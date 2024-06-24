package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("demosalesmanager");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("crmsfa");	
	driver.findElement(By.xpath("//*[@id=\"login\"]/p[3]/input")).click();
    driver.findElement(By.xpath("//*[@id=\"button\"]/a/img")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Accounts")).click();
    driver.findElement(By.linkText("Create Account")).click();
    driver.findElement(By.id("accountName")).sendKeys("Sarathi_TestLeaf");
    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
    driver.findElement(By.id("numberEmployees")).sendKeys("150");
    driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
    driver.findElement(By.className("smallSubmit")).click();
    String TitleName = driver.getTitle();
    System.out.println("The title of page is : "+TitleName);
    if(TitleName.equals("Create Account | opentaps CRM")) {
    	System.out.println("The Title is displayed correctly");
      	
    }
    else{
  	    System.out.println("The title is not displayed correctly");
  	}

    Thread.sleep(2000);

    driver.close();


	}

}
