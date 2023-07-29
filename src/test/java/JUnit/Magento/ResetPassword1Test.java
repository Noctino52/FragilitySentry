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
public class ResetPassword1Test {
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
  public void resetPassword1() throws InterruptedException {
    driver.get("http://localhost/");
    driver.manage().window().setSize(new Dimension(945, 1020));
    {
      WebElement element = driver.findElement(By.linkText("My Cart"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.linkText("Sign In")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".remind > span")).click();
    driver.findElement(By.id("email_address")).click();
    driver.findElement(By.id("email_address")).sendKeys("prova@prova.com");
    driver.findElement(By.id("captcha_user_forgotpassword")).click();
    driver.findElement(By.id("captcha_user_forgotpassword")).sendKeys("11111");
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".reload > span")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".submit > span")).click();

    {
      WebElement element = driver.findElement(By.id("email_address"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("captcha_user_forgotpassword"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("newsletter"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("search"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
  }
}
