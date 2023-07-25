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
import org.openqa.selenium.interactions.Actions;

import java.util.*;

public class zDeleteReport1Test {
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
  public void zDeleteReport1() {
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
    driver.findElement(By.cssSelector(".widget-toolbox > .btn")).click();
    driver.findElement(By.cssSelector(".pull-left:nth-child(5) .btn")).click();
    driver.findElement(By.cssSelector(".btn-white")).click();



    {
      WebElement element = driver.findElement(By.id("filter-search-txt"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("per_page_filter"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("show_profile_filter"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("show_category_filter"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("reporter_id_filter"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("handler_id_filter"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("hide_status_filter"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("platform_filter"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("user_monitor_filter"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("show_status_filter"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("show_sort_filter"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("note_user_id_filter"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("show_resolution_filter"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("os_build_filter"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("show_priority_filter"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("do_filter_by_date_filter"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("relationship_type_filter"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
  }
}
