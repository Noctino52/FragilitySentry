package JUnit.Magento;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class UpdatePage1Test {
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
  public void updatePage1() throws InterruptedException {
    driver.get("http://localhost/admin");
    driver.manage().window().setSize(new Dimension(945, 1020));
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("user");
    driver.findElement(By.id("login")).click();
    driver.findElement(By.id("login")).click();
    driver.findElement(By.id("login")).sendKeys("bitnami1");
    driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("#menu-magento-backend-content > a > span")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".item-cms-page > a")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".data-row:nth-child(2) .action-select")).click();
    driver.findElement(By.linkText("Edit")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".admin__actions-switch-label")).click();
    driver.findElement(By.cssSelector(".admin__actions-switch-label")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("save-button")).click();

    {
      WebElement element = driver.findElement(By.id("back"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_privacy"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_bug_tracking"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }

    {
      WebElement element = driver.findElement(By.id("back"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_privacy"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_bug_tracking"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }

    {
      WebElement element = driver.findElement(By.id("back"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_privacy"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_bug_tracking"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }

    {
      WebElement element = driver.findElement(By.id("back"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_privacy"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_bug_tracking"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }

    {
      WebElement element = driver.findElement(By.id("back"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_privacy"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_bug_tracking"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("back"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_privacy"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_bug_tracking"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("back"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_privacy"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_bug_tracking"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }

    {
      WebElement element = driver.findElement(By.id("back"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_privacy"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_bug_tracking"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }

    {
      WebElement element = driver.findElement(By.id("back"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_privacy"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_bug_tracking"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }

    {
      WebElement element = driver.findElement(By.id("back"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_privacy"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_bug_tracking"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }

    {
      WebElement element = driver.findElement(By.id("back"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_privacy"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_bug_tracking"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("back"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_privacy"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("footer_bug_tracking"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }

  }
}
