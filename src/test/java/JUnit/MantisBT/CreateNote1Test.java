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
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

public class CreateNote1Test {
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
  public void createNote1() throws InterruptedException {
    driver.get("http://localhost:8989/login_page.php");
    driver.manage().window().setSize(new Dimension(945, 1020));
    driver.findElement(By.id("username")).sendKeys("Miranda23");
    driver.findElement(By.cssSelector(".width-40")).click();
    driver.findElement(By.id("password")).sendKeys("root");
    driver.findElement(By.cssSelector(".width-40")).click();
    Thread.sleep(1000);
    //Cambio classi CSS Selector
    driver.findElement(By.cssSelector(".my-buglist-bug:nth-child(1) .status-50-color")).click();
    driver.findElement(By.xpath("//div[@id=\'reported\']/div[2]/div/div/table/tbody/tr/td/i[2]")).click();
    driver.findElement(By.linkText("Le fatture sono errate")).click();
    driver.findElement(By.id("bugnote_text")).click();
    driver.findElement(By.id("bugnote_text")).click();
    driver.findElement(By.id("bugnote_text")).click();
    driver.findElement(By.id("bugnote_text")).sendKeys("com\'è successo?");
    driver.findElement(By.cssSelector(".widget-toolbox > .btn")).click();
  }
}
