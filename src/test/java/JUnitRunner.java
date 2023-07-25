import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.List;

public class JUnitRunner {

    public static List<Test> createTestScore(List<Test> testWithSelector){
        double score=0;
        for (Test testToJudge: testWithSelector) {
            score=Judge.getTestScore(testToJudge);
            testToJudge.setTestScore(score);
        }
        return testWithSelector;
    }

    private static void showResult(List<Test> testsJudged, TestRunner testRunner) {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("============Risultati=============");
        System.out.println("==Successi: "+testRunner.numberOfSuccessTests+" ==Fallimenti: "+testRunner.numberOfFailedTests+" ==");
        System.out.println("==================================");
        for (Test testJudged:testsJudged) {
            System.out.println("Nome Test:"+testJudged.getClassName()+
                    " Punteggio:"+df.format(testJudged.getTestScore()));
        }
    }


    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException, IOException {
        String directoryMagento="src/test/java/JUnit/Magento";
        String directoryDolibarr="src/test/java/JUnit/Dolibarr";
        String directoryMantisBT="src/test/java/JUnit/MantisBT";

        List<Test> magentoTests=Test.getAllTests(directoryMantisBT);
        TestRunner testRunner=new TestRunner(magentoTests);
        List<Test> testsWithSelector=testRunner.executeTests();

        //Dal punteggio dei selettori ottengo il punteggio dei test
        List<Test> testsJudged=createTestScore(testsWithSelector);

        showResult(testsJudged,testRunner);
    }
}
