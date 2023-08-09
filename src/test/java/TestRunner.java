import org.jsoup.nodes.Document;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestRunner {

    List<Test> testsToValidate;
    WebDriverListener listenerDriver;
    SelectorWebDriver listener;
    WebDriver driver;
    int numberOfSuccessTests=0;
    int numberOfFailedTests=0;

    public TestRunner(List<Test> tests) {

        this.testsToValidate = tests;
    }

    public List<Test> executeTests() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        // Variabili per l'iterazione
        List<Test> testsFinished = new ArrayList<>();

        for (Integer testNum = 1; testNum <= testsToValidate.size(); testNum++) {
            setupListner();
            testsFinished.add(executeTest(testNum));
        }
        return testsFinished;
    }

    private Test executeTest(int testNum) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        List<Selector> selectorFinished;
        List<Page> pageFinished;
        Test test;
        String nomeTest;
        String nomeMetodo;
        boolean testFailed=false;
        Class testX;
        Method method1;
        Method method2;
        Method method3;
        Object objPetX;

        Class[] arg = new Class[1];
        arg[0] = WebDriver.class;

        System.out.println("\n Test N."+testNum+" Iniziato \n");
        // Prossimi test da eseguire
        test= testsToValidate.get(testNum - 1);
        nomeTest= getClassName(test);
        nomeMetodo=getMethodName(nomeTest);

        // Esecuzione test case
        testX = Class.forName(nomeTest);
        objPetX = create(testX);

        method1 = testX.getDeclaredMethod("setUp",WebDriver.class);
        method1.invoke(objPetX,driver);
        method2 = testX.getDeclaredMethod(nomeMetodo);
        try {
            method2.invoke(objPetX);
        }catch(Exception e){
            e.printStackTrace();
            Selector lastSelector=listener.getSelectorPages().get(listener.getSelectorPages().size() - 1);
            lastSelector.setSelectorScore(Judge.getBadElementScore(lastSelector));
            System.out.println("Un test ha smesso di funzionare,Richiamo il giudice cattivo che gli toglierà 100 punti!");
            numberOfFailedTests+=1;
            testFailed=true;
        }
        if(!testFailed)numberOfSuccessTests+=1;
        method3 = testX.getDeclaredMethod("tearDown");
        method3.invoke(objPetX);

        // Risultato del test
        System.out.println("\n Test N."+testNum+" Concluso \n");
        selectorFinished = listener.getSelectorPages();
        test.setSelectors(selectorFinished);
        pageFinished=listener.getDocumentPages();
        test.setPage(pageFinished);
        return test;
    }

    private void setupListner() {
        ChromeDriverService service = new ChromeDriverService.Builder()
                .withLogOutput(System.err)
                .build();

        driver = new ChromeDriver(service);
        listener=new SelectorWebDriver();
        listenerDriver=listener;
        driver= new EventFiringDecorator(listenerDriver).decorate(driver);

        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
        listener.setSelectorPages(new ArrayList<>());
        listener.setDocumentPages(new ArrayList<>());
    }


    private String getClassName(Test test) {
        String nomeTest;
        nomeTest=test.getClassName();
        nomeTest=nomeTest.replace(".java","");
        nomeTest=nomeTest.replace("src/test/java/","");
        nomeTest=nomeTest.replace("/",".");
        return nomeTest;
    }

    private String getMethodName(String nomeTest) {
        String nomeMetodo;
        nomeMetodo=nomeTest.replace("Test","");
        nomeMetodo=(nomeMetodo.substring(nomeMetodo.lastIndexOf(".") + 1).trim());
        nomeMetodo=decapitalize(nomeMetodo);
        return nomeMetodo;
    }

    public static <T> T create(Class<T> someClass) {
        try {
            return someClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException ex) {
            throw new RuntimeException("Failed to create instance of class " + someClass.getName(), ex);
        }
    }

    public static String decapitalize(String string) {
        if (string == null || string.length() == 0) {
            return string;
        }

        char c[] = string.toCharArray();
        c[0] = Character.toLowerCase(c[0]);

        return new String(c);
    }
}
