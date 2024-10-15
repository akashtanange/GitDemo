package RAHULSHETTY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Iframe 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Nested Frames")).click();
		
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		
	     driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
	     
	    System.out.println(driver.findElement(By.id("content")).getText());
		
		
	}

}
