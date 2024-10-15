

package RAHULSHETTY;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssessmentCheckbox {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[id='checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("[id='checkBoxOption1']")).isSelected());
		driver.findElement(By.cssSelector("[id='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("[id='checkBoxOption1']")).isSelected());
		
		int Totalcheckbox=driver.findElements(By.cssSelector("[type='checkbox']")).size();
		
		Assert.assertEquals(Totalcheckbox, 3);

	}

}
