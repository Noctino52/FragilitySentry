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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

public class CreateReturn1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  public CreateReturn1Test(WebDriver driver) {
    this.driver = driver;
  }

  @Before
  public void setUp() {
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void createReturn1() {
    driver.get("http://localhost/");
    driver.manage().window().setSize(new Dimension(945, 1020));
    driver.findElement(By.cssSelector(".nav:nth-child(3) > a")).click();
    driver.findElement(By.id("oar-order-id")).click();
    driver.findElement(By.id("oar-order-id")).sendKeys("1");
    driver.findElement(By.id("oar-billing-lastname")).click();
    driver.findElement(By.id("oar-billing-lastname")).sendKeys("Capasso");
    driver.findElement(By.id("oar_email")).click();
    driver.findElement(By.id("oar_email")).sendKeys("prova@prova.com");
    driver.findElement(By.cssSelector(".submit > span")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".submit > span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
  }
}