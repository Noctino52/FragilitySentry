package JUnit.Magento;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

public class ReadProduct1Test {
  private WebDriver driver=new ChromeDriver();
  private Map<String, Object> vars=new HashMap<String, Object>();
  JavascriptExecutor js= (JavascriptExecutor) driver;


  public void setUp(WebDriver driver) {
    this.driver.quit();
    this.driver = driver;
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void readProduct1() throws InterruptedException {
    driver.get("http://localhost/");
    driver.manage().window().setSize(new Dimension(945, 1020));
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[contains(@class, \'nav-sections-items\') and not(contains(@class, \'mage-tabs-disabled\'))]")).click();
    driver.findElement(By.cssSelector(".nav:nth-child(5) > a")).click();
    driver.findElement(By.xpath("//input[@id=\'name\']")).click();
    driver.findElement(By.xpath("//input[@id=\'name\']")).sendKeys("Pera");
    driver.findElement(By.cssSelector(".primary > .search > span")).click();
    driver.findElement(By.xpath("//a[@id=\'mode-list\']")).click();
  }
}
