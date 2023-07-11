import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {

    private final String className;
    private List<Selector> selectors;
    private float testScore;

    public Test(String className) {
        this.className=className;
        this.testScore =0;
    }

    public static List<Test> getAllTests(String directory) throws IOException {
        List<Test> listOfTests=new ArrayList<>();
        List<String> fileNames=getFileNames(directory);
        for (String className:fileNames) {
            Test newTest= new Test(className);
            listOfTests.add(newTest);
        }
        return listOfTests;
    }

    private static List<String> getFileNames(String directoryPath) throws IOException {
        List<String> fileNames = new ArrayList<>();
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        fileNames.add(directoryPath+"/"+file.getName());
                    }
                }
            }
        }

        return fileNames;
    }




    public String getClassName() {
        return className;
    }
    public float getTestScore() {
        return testScore;
    }

    public void setTestScore(float testScore) {
        this.testScore = testScore;
    }
    public List<Selector> getSelectors() {
        return selectors;
    }
    public void setSelectors(List<Selector> selectors) {
        this.selectors = selectors;
    }
}
