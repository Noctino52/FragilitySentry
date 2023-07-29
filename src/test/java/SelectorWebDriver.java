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
		Page page=new Page(pageDocument);
		page.setPageComplexity(PageComplexityEvaluator.calculatePageComplexity(page));
		selectorUrl.setSelectorFinalScore(Judge.getElementScore(selectorUrl,page));

		WebDriverListener.super.beforeGet(driver, url);
	}

	@Override
	public void beforeFindElement(WebDriver driver, By locator) {
		String pageString=driver.getPageSource();
		Document pageDocument= Jsoup.parse(pageString);
		documentPages.add(pageDocument);

		Selector selector=new Selector(locator);
		Page page=new Page(pageDocument);
		page.setPageComplexity(PageComplexityEvaluator.calculatePageComplexity(page));
		selector.setSelectorFinalScore(Judge.getElementScore(selector,page));
		System.out.println(selector+"   "+page);
		selectorPages.add(selector);
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
