package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJar\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		//WebDriver driver1 = new FirefoxDriver();
		//How to open the browser
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		if(driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected())
		{
			driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		}
		WebElement DD = driver.findElement(By.name("passCount"));
		Select sel = new Select(DD);
		List<WebElement> data = sel.getOptions();
		System.out.println(data.size());
		for(int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i).getText());
		}
		//1st option
		sel.selectByVisibleText("2");
		Thread.sleep(2000);
		//2nd option
		sel.selectByIndex(2);
		Thread.sleep(2000);
		//3rd option
		sel.selectByValue("1");
		
	
		
		/*String ActualTitle= driver.getTitle();
		//if(Expectedtitle.equals(ActualTitle))
		{
			//write for logout
			driver.findElement(By.id("welcome")).click();
			Thread.sleep(3000);
			//driver.findElement(By.linkText("Logout")).click();
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			driver.close();
			
		}
		else
		{
			System.out.println("error occured");
		}*/
	
	}

}
