package RAHULSHETTY;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assessment2 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("name")).sendKeys("Akash Tanange");
		driver.findElement(By.cssSelector("[name='email']")).sendKeys("akash@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
		driver.findElement(By.className("form-check-input")).click();
		
		WebElement Dropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select option=new Select(Dropdown);
		option.selectByVisibleText("Female");
		//option.selectByVisibleText("Male");
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("[type='date']")).sendKeys("04/28/1997");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.cssSelector("[class*='alert-success']")).click();
		System.out.println(driver.findElement(By.xpath("//*[contains(@class,'alert-success')]")).getText());
		

	}

}
