package pack_Lane_Act_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lane_Kickoff_Approval {

	public static void main(String[] args) throws InterruptedException 
	{
		// Lane Activation Scenario # 2:Lane Activation-GSI  & Spotrate Integration[BCP Lane]
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bolla.su:Vertex37@pgitrade.pg.com/MercuryDev/Home.aspx");
        driver.findElement(By.xpath("//input[@id='MercuryHeader1_imgLaneActivation']")).click();
        Thread.sleep(4000);
                                
        // Clicking on Lane Request Number
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_gvRecords_tccell0_17")).click();
                                
        // Click on Edit
        Thread.sleep(8000);
        driver.findElement(By.id("ctl00_MainContent_btnEdit_CD")).click();
                                
        // Click on Lane Kickoff Approval
        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id='ctl00_UserMenu_trLaneKickoffApproval']/td/a")).click();
                                
        //Approve Regional I-TRADE Operations Origin
        Thread.sleep(5000);
        driver.findElement(By.id("ctl00_MainContent_gvSuggITMulFunTeam_cell1_2_rbtSelection_RB0_I")).click();
                                
        //Regional I-TRADE Operations Destination
        Thread.sleep(3000);
        driver.findElement(By.id("ctl00_MainContent_gvSuggITMulFunTeam_cell2_2_rbtSelection_RB0_I")).click();
                                
        //Roles & Responsibilities section
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_gvRoles_cell0_2_chkCopy_S_D")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_gvRoles_cell1_3_chkPaste_S_D")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_gvRoles_cell2_3_chkPaste_S_D")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_gvRoles_cell3_3_chkPaste_S_D")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_gvRoles_cell4_3_chkPaste_S_D")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_gvRoles_cell5_3_chkPaste_S_D")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_gvRoles_cell6_3_chkPaste_S_D")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_gvRoles_cell7_3_chkPaste_S_D")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_gvRoles_cell8_3_chkPaste_S_D")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_gvRoles_cell9_3_chkPaste_S_D")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_gvRoles_cell10_3_chkPaste_S_D")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_gvRoles_cell11_3_chkPaste_S_D")).click();
                                
        // Copy & Paste Users
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_btnCopyUser_CD']/span")).click();
                                
        Thread.sleep(4000);
        String z = driver.switchTo().alert().getText();
        System.out.println(z);
        driver.switchTo().alert().accept();
                                
        // Click on submit
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id='ctl00_MainContent_btnSubmit_CD']/span")).click();
        Thread.sleep(3000);
        String a = driver.switchTo().alert().getText();
        System.out.println(a);
        driver.switchTo().alert().accept();
                             
        // Click on Sending Site
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id='ctl00_UserMenu_trSendingSite']/td/a")).click();
                                
        //Origin Service Type
        Thread.sleep(10000);
        driver.findElement(By.id("ctl00_MainContent_cmbFROriginService_I")).click(); 
        driver.findElement(By.id("ctl00_MainContent_cmbFROriginService_I")).sendKeys(Keys.ARROW_DOWN); 
        driver.findElement(By.id("ctl00_MainContent_cmbFROriginService_I")).sendKeys(Keys.ENTER);
                                
        //Origin Service Type
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_cmbOriginCity_I")).click(); 
        driver.findElement(By.id("ctl00_MainContent_cmbOriginCity_I")).sendKeys(Keys.ARROW_DOWN); 
        driver.findElement(By.id("ctl00_MainContent_cmbOriginCity_I")).sendKeys(Keys.ENTER);
        // Close the browser
        driver.close();        
            

	}

}
