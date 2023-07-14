package JUnit.Magento;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class ReadDetailsProduct1Test {
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
  public void readDetailsProduct1() throws InterruptedException {
    driver.get("http://localhost/admin/admin/index/index/key/74014886a852539c94baad79d84f61c57416f74d1b3a4858e3d7b6f5bf236f5e/");
    driver.manage().window().setSize(new Dimension(945, 1020));
    driver.findElement(By.id("username")).sendKeys("user");
    driver.findElement(By.id("login")).sendKeys("bitnami1");
    driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector("#menu-magento-catalog-catalog > a")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".item-catalog-products span")).click();
    Thread.sleep(2000);
    //js.executeScript("document.querySelector(\"div.admin__data-grid-wrap[data-role='grid-wrapper']\").scrollLeft += 3000;");
    WebElement tableWrapper = driver.findElement(By.cssSelector("div.admin__data-grid-wrap[data-role='grid-wrapper']"));
    long initialScrollLeft = (long) js.executeScript("return arguments[0].scrollLeft;", tableWrapper);
// Esegui lo scroll orizzontale
    js.executeScript("arguments[0].scrollLeft += 3000;", tableWrapper);
    Thread.sleep(1000);
// Verifica se l'elemento si è spostato
    long finalScrollLeft = (long) js.executeScript("return arguments[0].scrollLeft;", tableWrapper);
    if (finalScrollLeft <= initialScrollLeft){
      fail("Lo scroll orizzontale non è stato eseguito correttamente.");
    }
    driver.findElement(By.cssSelector(".\\_odd-row .action-menu-item")).click();
  }
}
