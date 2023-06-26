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
public class UpdateUserInfo1Test {
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
  public void updateUserInfo1() throws InterruptedException {
    driver.get("http://localhost:8989/login_page.php");
    driver.manage().window().setSize(new Dimension(1936, 1050));
    driver.findElement(By.id("username")).sendKeys("administrator");
    driver.findElement(By.cssSelector(".width-40")).click();
    driver.findElement(By.id("password")).sendKeys("root");
    driver.findElement(By.cssSelector(".width-40")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("li:nth-child(1) .menu-text")).click();
    driver.findElement(By.cssSelector("#resolved .my-buglist-bug:nth-child(1) span > a")).click();
    driver.findElement(By.linkText("Ivan52")).click();
    driver.findElement(By.cssSelector("tr:nth-child(3) > td")).click();
    assertThat(driver.findElement(By.cssSelector("tr:nth-child(3) > td")).getText(), is("Ivan Capasso"));
  }
}
