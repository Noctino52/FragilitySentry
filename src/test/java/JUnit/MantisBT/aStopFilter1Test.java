package JUnit.MantisBT;// Generated by Selenium IDE
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
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

public class aStopFilter1Test {
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
  public void aStopFilter1() throws InterruptedException {
    driver.get("http://localhost:8989/login_page.php");
    driver.manage().window().setSize(new Dimension(766, 640));
    driver.findElement(By.name("username")).sendKeys("Chris95");
    driver.findElement(By.cssSelector(".width-40")).click();
    driver.findElement(By.name("password")).sendKeys("root");
    driver.findElement(By.cssSelector(".width-40")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("#menu-toggler")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("Visualizza anomalie")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("show_severity_filter")).click();
    Thread.sleep(1000);
    driver.findElement(By.name("severity[]")).click();
    Thread.sleep(1000);
    {
      WebElement dropdown = driver.findElement(By.name("severity[]"));
      dropdown.findElement(By.xpath("//option[. = 'maggiore']")).click();
    }
    driver.findElement(By.cssSelector(".no-float")).click();
    driver.findElement(By.name("reset_query_button")).click();
  }
}
