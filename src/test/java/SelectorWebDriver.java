import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.*;
import org.openqa.selenium.support.events.WebDriverListener;
import java.util.List;

public class SelectorWebDriver implements WebDriverListener {


	private List<Selector> selectorPages;
	private List<Document> documentPages;

	@Override
	public void beforeGet(WebDriver driver, String url) {
		String pageString=driver.getPageSource();
		Document pageDocument= Jsoup.parse(pageString);
		documentPages.add(pageDocument);

		Selector selectorUrl=new Selector(url,"url");
		selectorUrl.setSelectorScore(Judge.getElementScore(selectorUrl,pageDocument));

		WebDriverListener.super.beforeGet(driver, url);
	}

	@Override
	public void beforeFindElement(WebDriver driver, By locator) {
		String pageString=driver.getPageSource();
		Document pageDocument= Jsoup.parse(pageString);
		documentPages.add(pageDocument);

		Selector selector=createSelector(driver,locator);
		selector.setSelectorScore(Judge.getElementScore(selector,pageDocument));
		System.out.println(selector);
		selectorPages.add(selector);
	}

	private Selector createSelector(WebDriver driver, By locator) {
		String type=locator.getClass().getSimpleName().replaceFirst("By", "");
		String stringLocator=locator.toString();
		int index = stringLocator.indexOf(":"); // Trova l'indice del primo carattere ":"
		String selectorString = stringLocator.substring(index + 2);
		System.out.println(selectorString);
		return new Selector(selectorString,type);
	}

	@Override
	public void afterFindElement(WebDriver driver, By locator, WebElement result) {
		WebDriverListener.super.afterFindElement(driver, locator, result);
	}

	public void setSelectorPages(List<Selector> selectorPages) {
		this.selectorPages = selectorPages;
	}
	public List<Selector> getSelectorPages() {
		return selectorPages;
	}

	public List<Document> getDocumentPages() {
		return documentPages;
	}
	public void setDocumentPages(List<Document> documentPages) {
		this.documentPages = documentPages;
	}



}
