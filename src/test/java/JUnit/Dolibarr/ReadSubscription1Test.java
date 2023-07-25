package JUnit.Dolibarr;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.*;

public class ReadSubscription1Test {
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
  public void readSubscription1() {
    driver.get("http://localhost:8080/");
    driver.manage().window().setSize(new Dimension(945, 1020));
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.id("password")).sendKeys("dolibarr");
    driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector(".members")).click();
    driver.findElement(By.cssSelector(".menu")).click();
    driver.findElement(By.linkText("Without subscription")).click();

    driver.findElement(By.xpath("//span[@id=\'select2-select_categ_search_categ-container\']")).click();
    driver.findElement(By.name("search_ref")).click();
    driver.findElement(By.name("search_firstname")).click();
    driver.findElement(By.name("search_lastname")).click();
    driver.findElement(By.name("search_company")).click();
    driver.findElement(By.name("search_login")).click();
    driver.findElement(By.xpath("//select[@id=\'search_type\']")).click();
    driver.findElement(By.xpath("//select[@id=\'search_type\']")).click();
    {
      WebElement element = driver.findElement(By.xpath("//select[@id=\'search_type\']"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.name("search_email")).click();
    driver.findElement(By.cssSelector(".div-table-responsive")).click();
    driver.findElement(By.xpath("//select[@id=\'search_filter\']")).click();
    driver.findElement(By.xpath("//select[@id=\'search_filter\']")).click();
  }
}
