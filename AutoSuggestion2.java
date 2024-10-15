package RAHULSHETTY;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion2 {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://webv2.proctur.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[placeholder='Mobile or Email-id']")).sendKeys("keshav@proctur.com");
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("keshav");
		driver.findElement(By.cssSelector("button.login-btn2")).click();
		//driver.findElement(By.cssSelector("span[text*='3']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@type='button']")).click();
		//driver.findElement(By.className("_hj-dk3Fb__styles__iconX _hj-L5SMl__styles__icon")).click();
		driver.findElement(By.cssSelector("div[class='white']")).click();
		driver.findElement(By.id("searchParam")).sendKeys("De");
		driver.findElement(By.id("searchParam")).click();
		Thread.sleep(1000);
		List<WebElement> DATA= driver.findElements(By.xpath("//label"));
		WebElement Viewstudentclick=driver.findElement(By.xpath("(//a[normalize-space()='View Student'])[1]"));
		for(WebElement option:DATA)
		{
			if(option.getText().equalsIgnoreCase("Akash 101"))
			{
				Thread.sleep(3000);
				Viewstudentclick.click();
				break;
			}
		}
		
		

	}

}
