import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class JUnitRunner {

    public static List<Test> createTestScore(List<Test> testWithSelector){
        float score=0;
        for (Test testToJudge: testWithSelector) {
            score=Judge.getTestScore(testToJudge);
            testToJudge.setTestScore(score);
        }
        return testWithSelector;
    }

    private static void showResult(List<Test> testsJudged, TestRunner testRunner) {
        System.out.println("============Risultati=============");
        System.out.println("==Successi: "+testRunner.numberOfSuccessTests+" ==Fallimenti: "+testRunner.numberOfFailedTests+" ==");
        System.out.println("==================================");
        for (Test testJudged:testsJudged) {
            System.out.println("Nome Test:"+testJudged.getClassName()+
                    " Punteggio:"+testJudged.getTestScore());
        }
    }


    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException, IOException {
        String directoryMagento="src/test/java/JUnit/Magento";

        List<Test> magentoTests=Test.getAllTests(directoryMagento);
        TestRunner testRunner=new TestRunner(magentoTests);
        List<Test> testsWithSelector=testRunner.executeTests();

        //Dal punteggio dei selettori ottengo il punteggio dei test
        List<Test> testsJudged=createTestScore(testsWithSelector);

        showResult(testsJudged,testRunner);
    }
}
