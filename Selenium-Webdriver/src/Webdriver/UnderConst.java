package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderConst {
	
public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://newtours.demoaut.com/");		
	String underconst = "Under Construction: Mercury Tours";
	List<WebElement> link = driver.findElements(By.tagName("a"));
	String[] linktext = new String[link.size()];
	int i=0;
	for(WebElement e:link)
	{
		linktext[i]= e.getText();
		i++;
	}
	for(String t:linktext)
	{
		driver.findElement(By.linkText(t)).click();
		if(driver.getTitle().equals(underconst))
		{
			System.out.println("\""+t+ "\""+  "\"+ in underconstrcution");
			
		}
		else
		{
			System.out.println("\""+t+ "\""+  "\"+ is working");
		}
		driver.navigate().back();
	}
	
}
}