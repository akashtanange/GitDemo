package RAHULSHETTY;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		
		String abc=driver.findElement(By.xpath("//body/div[1]/div[4]/fieldset[1]/label[2]")).getText();
		
		WebElement Selectdropdown=driver.findElement(By.cssSelector("#dropdown-class-example"));
		
		Select a=new Select(Selectdropdown);
		
		a.selectByVisibleText(abc);
		
		driver.findElement(By.cssSelector("input[placeholder='Enter Your Name']")).sendKeys(abc);
		
		driver.findElement(By.cssSelector("input[value='Alert']")).click();
		
		String alertMessage=driver.switchTo().alert().getText();
	String text=driver.switchTo().alert().getText();
		
		if(alertMessage.contains(text))
		{
			System.out.println("Success alert");
		}
		else
		{
			System.out.println("failes alert");
		}
		
		driver.switchTo().alert().accept();

	}

}
