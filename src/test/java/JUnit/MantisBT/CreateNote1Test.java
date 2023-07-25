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
    driver.findElement(By.cssSelector(".my-buglist-bug:nth-child(1) .status-50-color")).click();
    driver.findElement(By.xpath("//div[@id=\'reported\']/div[2]/div/div/table/tbody/tr/td/i[2]")).click();
    driver.findElement(By.linkText("Le fatture sono errate")).click();
    driver.findElement(By.id("bugnote_text")).click();
    driver.findElement(By.id("bugnote_text")).sendKeys("com\'è successo?");
    driver.findElement(By.cssSelector(".widget-toolbox > .btn")).click();


    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div[2]")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tfoot/tr/td")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[17]/td")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[16]/th")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[15]/th")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[14]/th")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[13]/th")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[10]/th")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[9]/th")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[8]/th")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[7]/th")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[6]/th")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[5]/th")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr/th[2]")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr/th[3]")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[3]")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[4]")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr/th[4]")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr/th[5]")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[5]")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr/th[6]")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div[2]")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tfoot/tr/td")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[17]/td")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[16]/th")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[15]/th")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[14]/th")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[13]/th")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[10]/th")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[9]/th")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[8]/th")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[7]/th")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[6]/th")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[5]/th")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr/th[2]")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr/th[3]")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[3]")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[4]")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr/th[4]")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr/th[5]")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[5]")).click();
    driver.findElement(By.xpath("//div[@id=\'main-container\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div/table/tbody/tr/th[6]")).click();
  }
}
