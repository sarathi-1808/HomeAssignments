package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		//load the url
	driver.get("http://leaftaps.com/opentaps/control/main");

	//maximize the window
	driver.manage().window().maximize();

	//locate the username
	WebElement usernameField = driver.findElement(By.id("username"));

	//enter the username
	usernameField.sendKeys("demosalesmanager");

	//locate and enter the password
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

	//locate the login buton and click
	driver.findElement(By.className("decorativeSubmit")).click();

	//locate and click on CRM/SFA
	driver.findElement(By.linkText("CRM/SFA")).click();

	//locate and click on leads button
	driver.findElement(By.linkText("Leads")).click();

	//locate and click on create leads button
	driver.findElement(By.linkText("Create Lead")).click();

	//locate first name and type the firstname
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sarathi");

	//locate lastname and type the lastname
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");

	//locate the company name and type the company name
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");

	//locate the title and type the title
	driver.findElement(By.name("generalProfTitle")).sendKeys("Creating lead");

	//locate create lead and click
	driver.findElement(By.name("submitButton")).click();

	//get the title under the TitleName
	String TitleName = driver.getTitle();

	//print the TitleName
	System.out.println("The page title name is "+TitleName);

	//find if the TitleName is displayed correctly on the console

			if (TitleName.equals("View Lead | opentaps CRM"))
			{
				System.out.println("The displayed title is correct");
			}		
			else
			{
				System.out.println("The displayed title is not correct");
			}

	// make the window wait for 2S
				
		Thread.sleep(2000);
		
	//close the window
		driver.close();
		
		

	


	}

}
