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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.util.*;

public class ReadTemplate1Test {
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
  public void readTemplate1() throws InterruptedException {
    driver.get("http://localhost/admin");
    driver.manage().window().setSize(new Dimension(945, 1020));
    driver.findElement(By.id("username")).sendKeys("user");
    driver.findElement(By.id("login")).sendKeys("bitnami1");
    driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("#menu-magento-backend-marketing > a")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".item-template span")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//button[@type=\'button\'])[7]")).click();
    Thread.sleep(1000);
    {
      WebElement dropdown = driver.findElement(By.xpath("//select[contains(@class, \'ui-datepicker-month\') and not(@aria-label)]"));
      dropdown.findElement(By.cssSelector("*[value='1']")).click();
    }
    {
      WebElement dropdown = driver.findElement(By.cssSelector(".ui-datepicker-year"));
      dropdown.findElement(By.xpath("//option[. = '2022']")).click();
    }
    driver.findElement(By.xpath("//a[contains(text(),\'1\')]")).click();
    driver.findElement(By.xpath("//div[2]/div/button/span")).click();
    driver.findElement(By.xpath("//main[@id=\'anchor-content\']/div")).click();
    driver.findElement(By.xpath("//body[@id=\'html-body\']/div[3]/header/div/div/h1")).click();
    driver.findElement(By.xpath("//body[@id=\'html-body\']/div[3]/footer/div/div/p")).click();
    driver.findElement(By.xpath("//body[@id=\'html-body\']/div[3]/footer/div/div/div/p/strong")).click();
    driver.findElement(By.name("limit")).click();
    driver.findElement(By.xpath("//div[@id=\'systemEmailTemplateGrid\']/div")).click();


    driver.findElement(By.xpath("//body[@id=\'html-body\']/div[3]/header/div/div/h1")).click();
    driver.findElement(By.xpath("//body[@id=\'html-body\']/div[3]/footer/div/div/p")).click();
    driver.findElement(By.xpath("//body[@id=\'html-body\']/div[3]/footer/div/div/div/p/strong")).click();
    driver.findElement(By.name("limit")).click();
    driver.findElement(By.xpath("//div[@id=\'systemEmailTemplateGrid\']/div")).click();
    driver.findElement(By.xpath("//body[@id=\'html-body\']/div[3]/header/div/div/h1")).click();
    driver.findElement(By.xpath("//body[@id=\'html-body\']/div[3]/footer/div/div/p")).click();
    driver.findElement(By.xpath("//body[@id=\'html-body\']/div[3]/footer/div/div/div/p/strong")).click();
    driver.findElement(By.name("limit")).click();
    driver.findElement(By.xpath("//div[@id=\'systemEmailTemplateGrid\']/div")).click();
    driver.findElement(By.xpath("//body[@id=\'html-body\']/div[3]/header/div/div/h1")).click();
    driver.findElement(By.xpath("//body[@id=\'html-body\']/div[3]/footer/div/div/p")).click();
    driver.findElement(By.xpath("//body[@id=\'html-body\']/div[3]/footer/div/div/div/p/strong")).click();
    driver.findElement(By.name("limit")).click();
    driver.findElement(By.xpath("//div[@id=\'systemEmailTemplateGrid\']/div")).click();
    driver.findElement(By.xpath("//body[@id=\'html-body\']/div[3]/header/div/div/h1")).click();
    driver.findElement(By.xpath("//body[@id=\'html-body\']/div[3]/footer/div/div/p")).click();
    driver.findElement(By.xpath("//body[@id=\'html-body\']/div[3]/footer/div/div/div/p/strong")).click();
    driver.findElement(By.name("limit")).click();
    driver.findElement(By.xpath("//div[@id=\'systemEmailTemplateGrid\']/div")).click();
  }
}
