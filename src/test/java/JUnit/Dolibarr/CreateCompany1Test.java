package JUnit.Dolibarr;// Generated by Selenium IDE

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.util.*;

public class CreateCompany1Test {
  private  WebDriver driver=new ChromeDriver();
  private Map<String, Object> vars=new HashMap<String, Object>();
  JavascriptExecutor js= (JavascriptExecutor) driver;

  public void setUp(WebDriver driver) {
    this.driver.quit();
    this.driver=driver;
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void createCompany1() {
    driver.get("http://localhost:8080/");
    driver.manage().window().setSize(new Dimension(945, 1020));
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.id("password")).sendKeys("dolibarr");
    driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector(".menu")).click();
    driver.findElement(By.linkText("Impostazioni")).click();
    driver.findElement(By.cssSelector(".fiche > .inline-block:nth-child(4)")).click();
    driver.findElement(By.linkText("Impostazioni -> Società/Organizzazione")).click();
    driver.findElement(By.id("name")).sendKeys("EasyCompany");
    driver.findElement(By.id("select2-selectcountry_id-container")).click();
    driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("Ital");
    driver.findElement(By.name("save")).click();

    driver.findElement(By.name("MAIN_INFO_SOCIETE_ADDRESS")).click();
    driver.findElement(By.cssSelector("#MAIN_INFO_SOCIETE_ZIP")).click();
    driver.findElement(By.name("MAIN_INFO_SOCIETE_TOWN")).click();
    driver.findElement(By.xpath("//div[@id=\'id-right\']/div/div[2]/form/table/tbody/tr[9]/td[2]/input")).click();
    driver.findElement(By.cssSelector("#fax")).click();
    driver.findElement(By.xpath("//div[@id=\'id-right\']/div/div[2]/form/table/tbody/tr[11]/td[2]/input")).click();
    driver.findElement(By.xpath("//input[@id=\'web\']")).click();
    driver.findElement(By.xpath("//input[@id=\'barcode\']")).click();
    driver.findElement(By.name("MAIN_INFO_SOCIETE_ADDRESS")).click();
    driver.findElement(By.cssSelector("#MAIN_INFO_SOCIETE_ZIP")).click();
    driver.findElement(By.name("MAIN_INFO_SOCIETE_TOWN")).click();
    driver.findElement(By.xpath("//div[@id=\'id-right\']/div/div[2]/form/table/tbody/tr[9]/td[2]/input")).click();
    driver.findElement(By.cssSelector("#fax")).click();
    driver.findElement(By.xpath("//div[@id=\'id-right\']/div/div[2]/form/table/tbody/tr[11]/td[2]/input")).click();
    driver.findElement(By.xpath("//input[@id=\'web\']")).click();
    driver.findElement(By.xpath("//input[@id=\'barcode\']")).click();
  }
}
