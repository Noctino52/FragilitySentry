package MantisBT;// Generated by Selenium IDE
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
public class DeleteReport1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void deleteReport1() {
    driver.get("http://localhost:8989/login_page.php");
    driver.manage().window().setSize(new Dimension(945, 1020));
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("Chris95");
    driver.findElement(By.cssSelector(".width-40")).click();
    driver.findElement(By.id("password")).sendKeys("root");
    driver.findElement(By.cssSelector(".width-40")).click();
    driver.findElement(By.linkText("Le fatture sono errate")).click();
    driver.findElement(By.name("new_status")).click();
    {
      WebElement dropdown = driver.findElement(By.name("new_status"));
      dropdown.findElement(By.xpath("//option[. = 'risolta']")).click();
    }
    driver.findElement(By.cssSelector("fieldset > .btn:nth-child(5)")).click();
    driver.findElement(By.id("bugnote_text")).click();
    driver.findElement(By.id("bugnote_text")).sendKeys("Risolto");
    driver.findElement(By.name("fixed_in_version")).click();
    {
      WebElement dropdown = driver.findElement(By.name("fixed_in_version"));
      dropdown.findElement(By.xpath("//option[. = '[EasyManager] 1.1']")).click();
    }
    driver.findElement(By.cssSelector(".widget-toolbox > .btn")).click();
    driver.findElement(By.cssSelector(".pull-left:nth-child(5) .btn")).click();
    driver.findElement(By.cssSelector(".btn-white")).click();
  }
}