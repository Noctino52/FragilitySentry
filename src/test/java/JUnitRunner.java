import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;

public class JUnitRunner {
    //TODO: Phormer Tests
    //TODO: Coefficiente di correlazione
    //TODO: Trova altri fattori di complessità per CSS e XPATH
    //TODO: Unire il calcolo complessitrà di CSS e XPath
    //TODO: Implementare una metrica che tiene conto della pagina  e del selettore insieme

    static String SoftwareUsed="Dolibarr";

    public static List<Test> createTestScore(List<Test> testWithSelector){
        double scoreTest=0;
        double scorePage=0;
        for (Test testToJudge: testWithSelector) {
            scoreTest=Judge.getTestScore(testToJudge);
            testToJudge.setTestScore(scoreTest);
        }
        return testWithSelector;
    }

    private static void showResult(List<Test> testsJudged, TestRunner testRunner) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        symbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("0.00",symbols);
        System.out.println("============Risultati=============");
        System.out.println("==Successi: "+testRunner.numberOfSuccessTests+" ==Fallimenti: "+testRunner.numberOfFailedTests+" ==");
        System.out.println("==================================");
        for (Test testJudged:testsJudged) {
            System.out.println("Nome Test:"+testJudged.getClassName()+
                    " Punteggio:"+df.format(testJudged.getTestScore()));
        }
        String directory="src/test/java/XMLResult/"+SoftwareUsed+"/Result.csv";
        createSelectorScoreFiles(testsJudged,df);
        writeInResult(testsJudged,directory,"MetricV3",df);
    }
    public static void writeInResult(List<Test> testsJudge, String csvFileName, String columnName,DecimalFormat df) {
        try {
            File inputFile = new File(csvFileName);
            File tempFile = new File("temp.csv");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String line;
            boolean foundColumn = false;
            int columnIdx = -1;
            String[] headers = null;

            // Process the header row separately
            if ((line = reader.readLine()) != null) {
                headers = line.split(",");
                for (int i = 0; i < headers.length; i++) {
                    if (headers[i].equals(columnName)) {
                        columnIdx = i;
                        foundColumn = true;
                        break;
                    }
                }
                writer.write(line);
                writer.newLine();
            }

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                if (foundColumn && !testsJudge.isEmpty()) {
                    // Update the values in the column with scores from testsJudge
                    if (columnIdx >= 0 && columnIdx < data.length) {
                        String newValue = df.format(testsJudge.remove(0).getTestScore());
                        data[columnIdx] = newValue;
                    }
                }

                // Reconstruct the line with updated data
                String newLine = String.join(",", data);
                writer.write(newLine);
                writer.newLine();
            }

            reader.close();
            writer.close();

            // Rename tempFile to inputFile to complete the overwrite
            if (inputFile.delete()) {
                tempFile.renameTo(inputFile);
            } else {
                throw new IOException("Failed to rename the temporary file to the original file.");
            }

            System.out.println("CSV file updated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createSelectorScoreFiles(List<Test> testsJudged, DecimalFormat df) {
        String basePath = "src/test/java/XMLResult/"+SoftwareUsed+"/Scores/";
        File directory = new File(basePath);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        for (Test test : testsJudged) {
            String fileName = basePath + test.getTestName() + "_scores.csv";

            try (FileWriter fileWriter = new FileWriter(fileName)) {
                String index = "Tipo,Selettore,Punteggio Selettore, Punteggio pagina, Punteggio finale \n";

                fileWriter.write(index);
                for (int i = 0; i < test.getSelectors().size(); i++) {
                    Selector selector = test.getSelectors().get(i);
                    Page page = test.getPage().get(i);

                    String nameSelector=selector.getSelector();
                    String typeSelector=selector.getType();
                    float selectorScore=selector.getSelectorScore();
                    float pageScore=page.getPageScore();
                    float selectorFinalScore=selector.getSelectorFinalScore();

                    String line = typeSelector+","+nameSelector + ","+ df.format(selectorScore) +
                            "," + df.format(pageScore) + ","+df.format(selectorFinalScore)+"\n";

                    fileWriter.write(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException, IOException {
        String directory="src/test/java/JUnit/"+SoftwareUsed;

        List<Test> magentoTests=Test.getAllTests(directory);
        TestRunner testRunner=new TestRunner(magentoTests);
        List<Test> testsWithSelector=testRunner.executeTests();

        //Dal punteggio dei selettori ottengo il punteggio dei test
        List<Test> testsJudged=createTestScore(testsWithSelector);

        PointBiserialCorrelationCoefficient.getCorrelation(testsJudged);
        showResult(testsJudged,testRunner);
    }
}
