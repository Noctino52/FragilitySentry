import org.openqa.selenium.*;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SelectorWebDriver implements WebDriverEventListener {


	private List<Selector> selectorPages;

	public void setSelectorPages(List<Selector> selectorPages) {
		this.selectorPages = selectorPages;
	}

	@Override
	public void beforeAlertAccept(WebDriver webDriver) {

	}

	@Override
	public void afterAlertAccept(WebDriver webDriver) {

	}

	@Override
	public void afterAlertDismiss(WebDriver webDriver) {

	}

	@Override
	public void beforeAlertDismiss(WebDriver webDriver) {

	}

	@Override
	public void beforeNavigateTo(String s, WebDriver webDriver) {

	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
	}

	@Override
	public void beforeNavigateBack(WebDriver webDriver) {

	}

	@Override
	public void afterNavigateBack(WebDriver webDriver) {

	}

	@Override
	public void beforeNavigateForward(WebDriver webDriver) {

	}

	@Override
	public void afterNavigateForward(WebDriver webDriver) {

	}

	@Override
	public void beforeNavigateRefresh(WebDriver webDriver) {

	}

	@Override
	public void afterNavigateRefresh(WebDriver webDriver) {

	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		Selector selector=new Selector(by.toString());
		selectorPages.add(selector);
	}

	@Override
	public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {

	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
	}

	@Override
	public void afterClickOn(WebElement webElement, WebDriver webDriver) {

	}

	@Override
	public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

	}

	@Override
	public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

	}

	@Override
	public void beforeScript(String s, WebDriver webDriver) {

	}

	@Override
	public void afterScript(String s, WebDriver webDriver) {

	}

	@Override
	public void beforeSwitchToWindow(String s, WebDriver webDriver) {

	}

	@Override
	public void afterSwitchToWindow(String s, WebDriver webDriver) {

	}

	@Override
	public void onException(Throwable throwable, WebDriver webDriver) {

	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {

	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {

	}

	@Override
	public void beforeGetText(WebElement webElement, WebDriver webDriver) {

	}

	@Override
	public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {

	}

	public List<Selector> getSelectorPages() {
		return selectorPages;
	}

	public void waitForPageLoad(WebDriver driver) {

		Wait<WebDriver> wait = new WebDriverWait(driver, 30);
		wait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				return String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
						.equals("complete");
			}
		});
	}
}
