package JUnit.MantisBT;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.*;

public class zDeleteUser1Test {
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
  public void zdeleteUser1() throws InterruptedException {
    driver.get("http://localhost:8989/login_page.php");
    driver.manage().window().setSize(new Dimension(1950, 1050));
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("administrator");
    driver.findElement(By.cssSelector(".width-40")).click();
    driver.findElement(By.id("password")).sendKeys("root");
    driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".fa-gears")).click();
    Thread.sleep(1000);
    driver.findElement(By.linkText("Gestione utenti")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("search")).click();
    driver.findElement(By.id("search")).click();
    driver.findElement(By.linkText("Umber93")).click();
    driver.findElement(By.id("edit-access-level")).click();
    driver.findElement(By.id("edit-access-level")).click();
    driver.findElement(By.id("email-field")).click();
    driver.findElement(By.id("edit-realname")).click();
    driver.findElement(By.id("edit-username")).click();

    driver.findElement(By.cssSelector("#manage-user-delete-form .btn")).click();
    driver.findElement(By.cssSelector(".btn-white")).click();
  }
}
