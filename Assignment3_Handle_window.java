package RAHULSHETTY;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_Handle_window
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		Set<String> window=driver.getWindowHandles();
		Iterator<String> a=window.iterator();
		String ParentID=a.next();
		String ChildID=a.next();
		
		driver.switchTo().window(ChildID);
		System.out.println(driver.findElement(By.cssSelector(".example")).getText());
		
		driver.switchTo().window(ParentID);
		
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
		

	}

}
