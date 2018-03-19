package pack_Lane_Act_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sending_Receiving_Site {

	public static void main(String[] args) throws InterruptedException 
	{
		// Lane Activation Scenario # 2:Lane Activation-GSI  & Spotrate Integration[BCP Lane]
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bolla.su:Vertex37@pgitrade.pg.com/MercuryDev/Home.aspx");

		// In the Home page, click on Lane Activation tab
		driver.findElement(By.id("MercuryHeader1_imgLaneActivation")).click();
		// Click on Dashboard menu in the left pane
		driver.findElement(By.xpath("//a[@id='ctl00_UserMenu_aDBView']")).click();
		// Click on the Request Number thats created thru Lane Activation and Kickoff Approval 
        driver.findElement(By.id("ctl00_MainContent_gvRecords_tccell0_17")).click();
        // Click on Edit
        Thread.sleep(8000);
        driver.findElement(By.id("ctl00_MainContent_btnEdit_CD")).click();	
        Thread.sleep(5000);
		// Sending Site
	    // Click on Sending Site tab in the left pane
	    driver.findElement(By.xpath("//a[text() = 'Sending Site']")).click();
	    // Enter Special Requirements in the Sending Site page
	    // Click on Origin Sevice Type and select option Door 
	    driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_cmbFROriginService_I']")).click();
	    driver.findElement(By.xpath("//td[text() = 'Door']")).click();
	    Thread.sleep(3000);
	    // Select Origin City and select Bencat
	    driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_cmbOriginCity_I']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//td[@id = 'ctl00_MainContent_cmbOriginCity_DDD_L_LBI1T0']")).click();
	    Thread.sleep(3000);
	    // Enter Origin Postal Code
	    driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_txtOriginPostalCode']")).sendKeys("10010");
	    Thread.sleep(3000);
	    // Enter  Prepaid Days at the Origin Port (Free time at origin Port
	    driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_txtDaysAtThePort']")).sendKeys("9");
	    Thread.sleep(3000);
	    // Select Method of Load
	    driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_cmbMethodofLoad_I']")).click();
	    driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_cmbMethodofLoad_I']")).sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(3000);
	    // Select Temperature control Required? as No
	    driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_rblTemperaturecontrolRequired_RB1_I']")).click();
	    Thread.sleep(3000);
	    // Click on Submit
	    driver.findElement(By.xpath("//span[@class = 'dx-vam' and text() = 'Submit']")).click();
	    // Handle the Alert
	    Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.accept();
	    Thread.sleep(10000);
	    
	    
	    // Receiving Site
	    // Click on Receiving Site tab in the left pane
	    driver.findElement(By.xpath("//a[text() = 'Receiving Site']")).click();
	    // Select Destination Service type as Door
	    driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_cmbDestinationService_I']")).click();
	    driver.findElement(By.xpath("//td[@id = 'ctl00_MainContent_cmbDestinationService_DDD_L_LBI2T0']")).click();
	    // Click on Destination City drop down and select Hong Kong
	    driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_cmbDestinationCity_I']")).click();
	    driver.findElement(By.xpath("//td[@id = 'ctl00_MainContent_cmbDestinationCity_DDD_L_LBI1T0']")).click();
	    // Enter Destination Postal Code
	    driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_txtDestinationPostalCode']")).sendKeys("10099");
	    // Enter Prepaid Days at the Destination Port (Container Free Time at Destination Port)
	    driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_txtDaysAtThePort']")).sendKeys("9");
	    // Select Method of Unload and select Drop
	    driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_cmbMethodofunLoad_I']")).click();
	    driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_cmbMethodofunLoad_I']")).sendKeys(Keys.ARROW_DOWN);
	    // Enter Annual Container VOlume
	    driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_gvEQTypeVolumeGrid_cell0_1_txtAnnualContainerVolume']")).sendKeys("100");
	    // CLick on Submit
	    driver.findElement(By.xpath("//span[@class = 'dx-vam' and text() = 'Submit']")).click();
	    // Handle Alert
	    Alert alert1 = driver.switchTo().alert();
	    System.out.println(alert1.getText());
	    alert1.accept();
	    // Close the browser
        driver.close();
	}

}
