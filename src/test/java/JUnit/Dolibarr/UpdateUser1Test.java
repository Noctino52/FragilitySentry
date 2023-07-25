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

public class UpdateUser1Test {
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
  public void updateUser1() throws InterruptedException {
    driver.get("http://localhost:8080/");
    driver.manage().window().setSize(new Dimension(945, 1020));
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.id("password")).sendKeys("dolibarr");
    driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector(".menu")).click();
    driver.findElement(By.linkText("admin")).click();
    driver.findElement(By.linkText("Scheda")).click();

    js.executeScript("window.scrollBy(0,600)", "");
    driver.findElement(By.xpath("//a[contains(text(),\'Modifica\')]")).click();

    js.executeScript("window.scrollBy(0,600)", "");
    driver.findElement(By.name("email")).click();

    driver.findElement(By.name("email")).sendKeys("superadmin@gmail.com");
    driver.findElement(By.name("email")).sendKeys(Keys.ENTER);


    {
      WebElement element = driver.findElement(By.id("user"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("rights"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("guisetup"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("extsites"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("clicktodial"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("notify"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("bank"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("note"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("document"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("info"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("user"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("rights"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("guisetup"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("extsites"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("clicktodial"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("extsites"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("clicktodial"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("notify"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }

  }
}
