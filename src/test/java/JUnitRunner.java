import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

/*
JUnitRunner prende tutti i casi di test registrati e li esegue con JUnitCore
 */
public class JUnitRunner {
    public static void main(String[] args) throws IOException {
        runAllTestsInDirectory("src/test/java/MantisBT");
    }

    public static void runAllTestsInDirectory(String directoryPath) throws IOException {
        List<Class<?>> testClasses = findTestClasses(directoryPath);
        runTestClasses(testClasses);
    }

    private static List<Class<?>> findTestClasses(String directoryPath) throws IOException {
        List<Class<?>> testClasses = new ArrayList<>();

        try {
            // Cammina attraverso il percorso della directory dei test
            Files.walk(Paths.get(directoryPath))
                    .filter(Files::isRegularFile)
                    .forEach(filePath -> {
                        String fileName = filePath.getFileName().toString();
                        if (fileName.endsWith("Test.java")) {
                            System.out.println(filePath.toString());
                            // Costruisci il nome della classe
                            String className = filePath.toString()
                                    .replace("src\\test\\java\\", "")  // Rimuovi la parte iniziale del percorso
                                    .replace(File.separator, ".")  // Converti il separatore di file in "."
                                    .replace(".java", "");  // Rimuovi l'estensione del file
                            try {
                                System.out.println(className);
                                // Carica la classe utilizzando il nome qualificato
                                Class<?> testClass = Class.forName(className);
                                testClasses.add(testClass);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }

        return testClasses;
    }

    private static void runTestClasses(List<Class<?>> testClasses) {
        ChromeOptions options = new ChromeOptions();
        // Imposta eventuali opzioni desiderate per il driver di Chrome

        // Imposta il percorso del driver di Chrome (chromedriver) sul tuo sistema
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);

        try {
            for (Class<?> testClass : testClasses) {
                JUnitCore junit = new JUnitCore();
                // Esegui la classe dei test
                Result result = junit.run(testClass);
                for (Failure failure : result.getFailures()) {
                    System.out.println(failure.toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}