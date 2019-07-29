package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJar\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		//WebDriver driver1 = new FirefoxDriver();
		//How to open the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		// maximize the window
		driver.manage().window().maximize();
		//System.out.println(Expectedtitle);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
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
		System.out.println("GitTest");
	}

}
