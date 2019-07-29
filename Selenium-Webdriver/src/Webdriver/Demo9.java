package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String Title= js.executeScript("return document.title").toString();
		System.out.println(Title);
		
		//String URL = driver.getCurrentUrl();
		//System.out.println(URL);
		
        String URL = js.executeScript("return document.URL").toString();
        System.out.println(URL);
        String domain = js.executeScript("return document.domain").toString();
        System.out.println(domain);
        
       //driver.navigate().refresh();
        js.executeScript("document.getElementById('txtUsername').value='Admin'");
        Thread.sleep(3000);
        js.executeScript("history.go(0)");
        js.executeScript("document.getElementById('txtUsername').value='Admin'");
        
        //store element first
        WebElement ele= (WebElement)js.executeScript(" return document.getElementById('txtUsername')");
        	//fetching value using getAttribute
        String name = ele.getAttribute("value");
        System.out.println(name);
        
        js.executeScript(" return document.getElementById('txtPassword').value='admin123'");
        js.executeScript(" return document.getElementById('btnLogin').click()");
        Thread.sleep(3000);
        js.executeScript("document.getElementById('menu_pim_viewPimModule').click();");
        js.executeScript("document.getElementById('menu_pim_viewEmployeeList').click();");
      //*[@id='resultTable']//child::tr/td[2]/a
        
       
	}

}
