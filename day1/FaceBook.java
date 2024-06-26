package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
		
		//Load the url Using get()
		driver.get("https://en-gb.facebook.com/");
		
		//To Maximize the window
		driver.manage().window().maximize();
		
		//to pause the excution
		Thread.sleep(3000);
		
		//to click the create ne account button
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();	
		
		Thread.sleep(3000);
		
		//To Locate the firstname WebElement and enter value
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sarathi");

		//To Locate the lastname WebElement and enter value
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
		
		//To Locate the email or mobile number WebElement and enter value
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sarathiravi45@gmail.com");
		
		//To Locate the password WebElement and enter value
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("sarathi");
		
		//To Locate the date WebElement and enter value
		WebElement dateWE = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select date = new Select(dateWE);
		date.selectByVisibleText("8");
		
		//To Locate the month WebElement and enter value
		WebElement monthWE = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month = new Select(monthWE);
		month.selectByVisibleText("Aug");
		
		//To Locate the year WebElement and enter value
		WebElement yearWE = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year = new Select(yearWE);
		year.selectByVisibleText("2000");	
		
		//To click the radio button
		driver.findElement(By.xpath("(//input[@name ='sex'])[2]")).click();
		
		//to close browser window
		driver.close();

	}

}
