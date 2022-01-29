package hu.endre.duolingo.checker;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{

  public static String baseUrl = "https://www.duolingo.com";
  private static String CHROME_BINARY_PROPERTY_KEY = "webdriver.chrome.driver";
  private static WebDriver webDriver;
  
    public static void main( String[] args ) throws InterruptedException {    	
    	
    	    openChrome();
	  
	  //webDriver.findElements(By.xpath("//img[contains(@class, '_3HNwh')]")).get(1).click();
	  
	  Thread.sleep(3000L);
	  
	  for (int m = 1; m < 1000; m++) {
		  
		  webDriver.findElements(By.xpath("//div[contains(text(), 'Old Things')]/..")).get(0).click();
		  
		  Thread.sleep(4000L);
		  
		  clickContinue();

		  Thread.sleep(2000L);
		  webDriver.findElements(By.xpath("//span[contains(text(), 'sell')]/..")).get(0).click();
		  
		  clickContinue();
		  
		  clickContinue(); 
		  Thread.sleep(2000L);
		  
		  webDriver.findElements(By.xpath("//span[contains(text(), 'Wertvolles')]/..")).get(0).click();
		  
		  clickContinue();
		  
		  Thread.sleep(1000L);
		  
		  webDriver.findElements(By.xpath("//span[contains(text(), 'want')]/..")).get(0).click();
		  
		  clickContinue();
		  
		  Thread.sleep(5000L);
		  List<WebElement> findElements = webDriver.findElements(By.xpath("//div[contains(@class, '_2-hAU')]/span"));
		  for (WebElement webElement : findElements) {
			if (webElement.getText().equals("Nach")) {
				webElement.click(); break;
			}
		  }
		  
		  for (WebElement webElement : findElements) {
				if (webElement.getText().equals("was")) {
					webElement.click(); break;
				}
			  }
		  for (WebElement webElement : findElements) {
				if (webElement.getText().equals("suchst")) {
					webElement.click(); break;
				}
			  }
		  for (WebElement webElement : findElements) {
				if (webElement.getText().equals("du")) {
					webElement.click(); break;
				}
			  }
		  
		  clickContinue();
		  
		  Thread.sleep(4000L);
		  
		  int i = 0;
		  while (!webDriver.findElements(By.xpath("//button[contains(@class, 'cqFjD _3syfy _3MmRF _1bJB- vy3TL _3iIWE _1Mkpg _1Dtxl _1sVAI sweRn _1BWZU _2bW5I _3ZpUo _2ddJq')]")).get(0).isEnabled()) {
			  webDriver.findElements(By.xpath("//button")).get(i).click();
			  Thread.sleep(1000L);
			  i++;
		}
		  
		  clickContinue();
		  
		  webDriver.findElements(By.xpath("//button[contains(text(), 'Ich glaube es nicht')]")).get(0).click();
		  
		  
		  clickContinue();
		  Thread.sleep(3000L);
		  
		  webDriver.findElements(By.xpath("//span[contains(text(), 'valuable')]/..")).get(0).click();
		  
		  clickContinue();
		  
		  List<WebElement> lastElements = webDriver.findElements(By.xpath("//li[contains(@class, '_2dYwE')]"));
		  
		  for (WebElement webElement : lastElements) {
			  for (WebElement webElement2 : lastElements) {
				  webElement.click();
				  webElement2.click(); 
			}
				
			}
	}
	  
	  
    quit();
	
    }

	private static void clickContinue() throws InterruptedException {
				for (int i = 0; i < 100; i++) {
					if (webDriver.findElements(By.xpath("//button[contains(@class, 'cqFjD _3syfy _3MmRF _1bJB- vy3TL _3iIWE _1Mkpg _1Dtxl _1sVAI sweRn _1BWZU _2bW5I _3ZpUo _2ddJq')]")).get(0).isEnabled()) {
						webDriver.findElements(By.xpath("//button[contains(@class, 'cqFjD _3syfy _3MmRF _1bJB- vy3TL _3iIWE _1Mkpg _1Dtxl _1sVAI sweRn _1BWZU _2bW5I _3ZpUo _2ddJq')]")).get(0).click();
						break;
					} else {
						Thread.sleep(1000L);
					}
				}
				
	}

  public static void openChrome() {
    System.setProperty(
            CHROME_BINARY_PROPERTY_KEY,
            "c:\\sajatProjects\\chromedriver.exe");
    
    webDriver = new ChromeDriver();
    webDriver.navigate().to(baseUrl);
  }
  
  public static void quit() {

	  webDriver.close();
	  webDriver.quit();
	  }
}
