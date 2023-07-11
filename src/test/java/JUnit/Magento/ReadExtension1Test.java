package JUnit.Magento;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

public class ReadExtension1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  public ReadExtension1Test(WebDriver driver) {
    this.driver = driver;
  }

  @Before
  public void setUp() {
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
  public void readExtension1() throws InterruptedException {
    driver.get("http://localhost/admin");
    driver.manage().window().setSize(new Dimension(945, 1020));
    driver.findElement(By.id("username")).sendKeys("user");
    driver.findElement(By.id("login")).sendKeys("bitnami1");
    driver.findElement(By.cssSelector(".action-login > span")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("#menu-magento-marketplace-partners > a")).click();
    js.executeScript("window.scrollBy(0,200)", "");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".magento-version")).click();
    assertThat(driver.findElement(By.cssSelector(".magento-version")).getText(), is("Magento ver. 2.4.2"));
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.linkText("Visit Magento Marketplaces")).click();
    vars.put("win2473", waitForWindow(2000));
    driver.switchTo().window(vars.get("win2473").toString());
  }
}