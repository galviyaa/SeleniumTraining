package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		//driver.findElement(By.name("userName")).sendKeys("manzoor");
		//driver.findElement(By.name("password")).sendKeys("manzoor");
		//driver.findElement(By.name("login")).click();
		//Thread.sleep(3000);
	
	/* if(driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected())
		 
	 {
		 driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
	 }
	 WebElement DD = driver.findElement(By.name("passCount"));
	 Select sel = new Select(DD);
	 List <WebElement> data = sel.getOptions();
	 System.out.println(data.size());
	 for (int i=0;i<data.size();i++)
	 {
		System.out.println(data.get(i).getText());
	 }
	sel.selectByVisibleText("2");
	Thread.sleep(2000);
	sel.selectByIndex(2);
	Thread.sleep(2000);
	//3rd option
	sel.selectByValue("1");*/
		/*
		 * driver.findElement(By.linkText("Home")).click();
		 * System.out.println("page loaded successfully");
		 * driver.findElement(By.linkText("Flights"));
		 * System.out.println("page loaded successfully");
		 * driver.findElement(By.linkText("Hotels"));
		 * 
		 */
	
		/*
		 * public void ClickLink() { List<WebElement> link =
		 * driver.findElements(By.tagName("a")); Iterator<WebElement> i =
		 * link.iterator(); System.out.println();
		 * 
		 * }
		 */
	
		 List <WebElement> links = driver.findElements(By.tagName("a"));
		 
			
		 System.out.println(links.size());
		 for (int i = 1; i<=links.size(); i=i+1)
		 
		 {
		 
		 System.out.println(links.get(i).getText()+"-----"+links.get(i).getAttribute("href"));
		 
		 }
	
	
	 
	 
	 
}
}
