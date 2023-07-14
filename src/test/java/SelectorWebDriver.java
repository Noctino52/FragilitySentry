import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.*;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SelectorWebDriver implements WebDriverListener {


	private List<Selector> selectorPages;
	private List<Document> documentPages;

	@Override
	public void beforeFindElement(WebDriver driver, By locator) {
		String pageString=driver.getPageSource();
		Document pageDocument= Jsoup.parse(pageString);
		documentPages.add(pageDocument);
		System.out.println(locator.toString());
		Selector selector=new Selector(locator.toString());
		selectorPages.add(selector);
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
