package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadsUsingXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@id=\"button\"]/a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@href=\"/crmsfa/control/leadsMain\"]")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@class='inputBox'][1]")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sarathi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("R");
		WebElement sourceWE = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceDD = new Select(sourceWE);
		sourceDD.selectByVisibleText("Direct Mail");
		WebElement marketingCampaignWE = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingCampaignDD = new Select(marketingCampaignWE);
		marketingCampaignDD.selectByVisibleText("Demo Marketing Campaign");
		WebElement currencyWE = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select currencyDD = new Select(currencyWE);
		currencyDD.selectByValue("GBP");
		WebElement countryWE = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select countryDD = new Select(countryWE);
		countryDD.selectByValue("GBR");
		driver.findElement(By.name("submitButton")).click();
		String pageTitle = driver.getTitle();
		System.out.println("The title of the page is:" + pageTitle);
		driver.close();
		
		

		



	}

}
