package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@id=\"button\"]/a/img")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("(//input[@name='accountName' and @type='text'])[2]")).sendKeys("Naresh");
		WebElement description = driver.findElement(By.xpath("//textarea[@class='inputBox' and @name='description']"));
		description.sendKeys("Selenium Automation Tester");	
		WebElement industryElement = driver.findElement(By.xpath("//select[@class='inputBox' and @name='industryEnumId']"));
		Select industry = new Select(industryElement);
		industry.selectByIndex(2);
		WebElement ownershipWE = driver.findElement(By.xpath("//select[@class='inputBox' and @name='ownershipEnumId']"));
		Select ownership = new Select(ownershipWE);
		ownership.selectByVisibleText("S-Corporation");
	    WebElement sourceWE = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
		Select source = new Select(sourceWE);
		source.selectByValue("LEAD_EMPLOYEE");	
	    WebElement marketingCampaignWE = driver.findElement(By.xpath("//select[@class='inputBox' and @name='marketingCampaignId']"));
		Select marketingCampaignDD = new Select(marketingCampaignWE);				
		marketingCampaignDD.selectByIndex(5);
	    WebElement stateWE = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select state = new Select(stateWE);
		state.selectByValue("TX");		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
        String actualTitle = driver.getTitle();
		System.out.println("actualtitle is : "+actualTitle);
		String expectedTitle = "Create Account | opentaps CRM";
		System.out.println("expectedTitle is : "+expectedTitle);
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
		driver.close();
		
		

	}

}
