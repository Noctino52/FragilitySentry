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
import org.openqa.selenium.Keys;
import java.util.*;

public class CreateReport1Test {
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
  public void createReport1() throws InterruptedException {
    driver.get("http://localhost:8989/login_page.php");
    driver.manage().window().setSize(new Dimension(1936, 1056));
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("administrator");
    driver.findElement(By.cssSelector(".width-40")).click();
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("root");
    driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector(".fa-gears")).click();
    driver.findElement(By.linkText("Gestione progetti")).click();
    driver.findElement(By.cssSelector(".widget-toolbox > .form-inline .btn")).click();
    driver.findElement(By.id("project-name")).click();
    driver.findElement(By.id("project-name")).click();
    driver.findElement(By.id("project-name")).sendKeys("Prova");
    driver.findElement(By.cssSelector(".btn-white")).click();
    driver.findElement(By.linkText("Continua")).click();
    driver.findElement(By.cssSelector(".user-info")).click();
    driver.findElement(By.linkText("Esci")).click();
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("Chris95");
    driver.findElement(By.cssSelector(".width-40")).click();
    driver.findElement(By.id("password")).sendKeys("root");
    driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector("li:nth-child(3) .menu-text")).click();
    driver.findElement(By.id("select-project-id")).click();
    {
      WebElement dropdown = driver.findElement(By.id("select-project-id"));
      dropdown.findElement(By.xpath("//option[. = 'Prova']")).click();
    }
    driver.findElement(By.cssSelector(".btn-white")).click();
    driver.findElement(By.id("category_id")).click();
    {
      WebElement dropdown = driver.findElement(By.id("category_id"));
      dropdown.findElement(By.xpath("//option[. = '[Tutti i progetti] General']")).click();
    }
    driver.findElement(By.id("reproducibility")).click();
    {
      WebElement dropdown = driver.findElement(By.id("reproducibility"));
      dropdown.findElement(By.xpath("//option[. = 'casuale']")).click();
    }
    driver.findElement(By.id("severity")).click();
    {
      WebElement dropdown = driver.findElement(By.id("severity"));
      dropdown.findElement(By.xpath("//option[. = 'banale']")).click();
    }
    driver.findElement(By.id("priority")).click();
    {
      WebElement dropdown = driver.findElement(By.id("priority"));
      dropdown.findElement(By.xpath("//option[. = 'bassa']")).click();
    }
    driver.findElement(By.id("profile_id")).click();
    {
      WebElement dropdown = driver.findElement(By.id("profile_id"));
      dropdown.findElement(By.xpath("//option[. = 'PC Windows 10']")).click();
    }
    driver.findElement(By.id("handler_id")).click();
    {
      WebElement dropdown = driver.findElement(By.id("handler_id"));
      dropdown.findElement(By.xpath("//option[. = 'Chris95']")).click();
    }
    driver.findElement(By.id("summary")).click();
    driver.findElement(By.id("summary")).click();
    driver.findElement(By.cssSelector("tr:nth-child(7)")).click();
    driver.findElement(By.id("summary")).click();
    driver.findElement(By.id("summary")).click();
    driver.findElement(By.id("summary")).sendKeys("Quando chiedi la stampa dei fogli excel crasha");
    driver.findElement(By.id("description")).click();
    driver.findElement(By.id("description")).click();
    driver.findElement(By.id("description")).sendKeys("Quando chiedi la stampa dei fogl excel crasha");
    driver.findElement(By.cssSelector(".btn-white")).click();
  }
}
