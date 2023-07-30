package JUnit.Dolibarr;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.util.*;

public class ReadBAccounts1Test {
  private  WebDriver driver=new ChromeDriver();
  private Map<String, Object> vars=new HashMap<String, Object>();
  JavascriptExecutor js= (JavascriptExecutor) driver;

  public void setUp(WebDriver driver) {
    this.driver.quit();
    this.driver=driver;
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void readBAccounts1() {
    driver.get("http://localhost:8080/");
    driver.manage().window().setSize(new Dimension(945, 1020));
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.id("password")).sendKeys("dolibarr");
    driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector("#mainmenua_bank > .mainmenuaspan")).click();
    //Assert testuale fallita
    assertThat(driver.findElement(By.cssSelector(".divsearchfield")).getText(), is("Tag/categorie:"));
    driver.findElement(By.cssSelector(".select2-selection--multiple > .select2-selection__rendered")).click();

    driver.findElement(By.name("search_ref")).click();
    driver.findElement(By.name("search_label")).click();
    driver.findElement(By.name("search_number")).click();
    driver.findElement(By.xpath("//form[@id=\'searchFormList\']/div[2]/table/tbody/tr/td[8]/span/span/span/span[2]")).click();
    driver.findElement(By.xpath("//form[@id=\'searchFormList\']/div[2]/table/tbody/tr/td[8]/span/span/span/span[2]")).click();
    driver.findElement(By.xpath("//form[@id=\'searchFormList\']/div[2]/table/tbody/tr/td[10]/div/button[2]/span")).click();
    driver.findElement(By.xpath("//form[@id=\'searchFormList\']/div/div/span/span/span/ul")).click();
    driver.findElement(By.xpath("//form[@id=\'searchFormList\']/div[2]/table/tbody/tr/td[8]/span/span/span/span[2]")).click();
    driver.findElement(By.xpath("//form[@id=\'searchFormList\']/div[2]/table/tbody/tr/td[8]/span/span/span/span[2]")).click();
    driver.findElement(By.xpath("//form[@id=\'searchFormList\']/div[2]/table/tbody/tr/td[10]/div/button[2]/span")).click();
    driver.findElement(By.xpath("//form[@id=\'searchFormList\']/div/div/span/span/span/ul")).click();
    driver.findElement(By.xpath("//form[@id=\'searchFormList\']/div[2]/table/tbody/tr/td[8]/span/span/span/span[2]")).click();
    driver.findElement(By.xpath("//form[@id=\'searchFormList\']/div[2]/table/tbody/tr/td[8]/span/span/span/span[2]")).click();
    driver.findElement(By.xpath("//form[@id=\'searchFormList\']/div[2]/table/tbody/tr/td[10]/div/button[2]/span")).click();
    driver.findElement(By.xpath("//form[@id=\'searchFormList\']/div/div/span/span/span/ul")).click();
    driver.findElement(By.linkText("Conti bancari")).click();
    driver.findElement(By.linkText("Titolo")).click();
    driver.findElement(By.linkText("Numero di conto")).click();
    driver.findElement(By.linkText("Conto di contabilità")).click();
    driver.findElement(By.linkText("Accounting code journal")).click();
    driver.findElement(By.linkText("Stato")).click();
    driver.findElement(By.linkText("Conti bancari")).click();
    driver.findElement(By.linkText("Titolo")).click();
    driver.findElement(By.linkText("Numero di conto")).click();
    driver.findElement(By.linkText("Conto di contabilità")).click();
    driver.findElement(By.linkText("Accounting code journal")).click();
    driver.findElement(By.linkText("Stato")).click();
    driver.findElement(By.name("search_ref")).click();
    driver.findElement(By.name("search_label")).click();
    driver.findElement(By.name("search_number")).click();
    driver.findElement(By.xpath("//form[@id=\'searchFormList\']/div[2]/table/tbody/tr/td[8]/span/span/span/span[2]")).click();
    driver.findElement(By.xpath("//form[@id=\'searchFormList\']/div[2]/table/tbody/tr/td[8]/span/span/span/span[2]")).click();
    driver.findElement(By.xpath("//form[@id=\'searchFormList\']/div[2]/table/tbody/tr/td[10]/div/button[2]/span")).click();
    driver.findElement(By.xpath("//form[@id=\'searchFormList\']/div/div/span/span/span/ul")).click();
    driver.findElement(By.xpath("//form[@id=\'searchFormList\']/div[2]/table/tbody/tr/td[8]/span/span/span/span[2]")).click();
    driver.findElement(By.xpath("//form[@id=\'searchFormList\']/div[2]/table/tbody/tr/td[8]/span/span/span/span[2]")).click();
    driver.findElement(By.xpath("//form[@id=\'searchFormList\']/div[2]/table/tbody/tr/td[10]/div/button[2]/span")).click();
    driver.findElement(By.xpath("//form[@id=\'searchFormList\']/div/div/span/span/span/ul")).click();
    driver.findElement(By.linkText("Conti bancari")).click();
    driver.findElement(By.linkText("Titolo")).click();
    driver.findElement(By.linkText("Numero di conto")).click();
    driver.findElement(By.linkText("Conto di contabilità")).click();
    driver.findElement(By.linkText("Accounting code journal")).click();
    driver.findElement(By.linkText("Stato")).click();


  }
}
