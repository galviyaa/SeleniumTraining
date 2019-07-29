package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Performance")).click();
		// to find all links under one tab
		
		 List <WebElement> links = driver.findElements(By.tagName("a"));
		 
		
			 System.out.println(links.size());
			 for (int i = 1; i<=links.size(); i=i+1)
				 
			 {
			 
			 System.out.println(links.get(i).getText()+"-----"+links.get(i).getAttribute("href"));
			 
			 }
				 }
			/* for(WebElement e:links)
			 {
				 String text = e.getText();
				 System.out.println(text);
			 }*/
	}



