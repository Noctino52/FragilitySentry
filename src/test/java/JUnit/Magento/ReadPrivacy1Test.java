package JUnit.Magento;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.*;

public class ReadPrivacy1Test {
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
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void readPrivacy1() throws InterruptedException {
    driver.get("http://localhost/admin");
    driver.manage().window().setSize(new Dimension(945, 1020));
    driver.findElement(By.name("login[username]")).sendKeys("user");
    driver.findElement(By.name("login[password]")).sendKeys("bitnami1");
    driver.findElement(By.name("login[password]")).sendKeys(Keys.ENTER);
    Thread.sleep(2000);
    {
      WebElement element = driver.findElement(By.id("store-change-button"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("grid_tab_reviewed_products"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id("grid_tab_customers")).click();
    driver.findElement(By.id("grid_tab_reviewed_products")).click();
    driver.findElement(By.id("grid_tab_ordered_products")).click();
    driver.findElement(By.cssSelector("#menu-magento-marketplace-partners > a")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".page-footer")).click();
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.xpath("//a[contains(@href, \'https://magento.com/sites/default/files/REVISED-MAGENTO-PRIVACY-POLICY.pdf\')]")).click();
    vars.put("win5173", waitForWindow(2000));
  }
}
