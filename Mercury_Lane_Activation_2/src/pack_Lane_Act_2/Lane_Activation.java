package pack_Lane_Act_2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Lane_Activation 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		// Lane Activation Scenario # 2:Lane Activation-GSI  & Spotrate Integration[BCP Lane]    
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://bolla.su:Vertex37@pgitrade.pg.com/MercuryDev/Home.aspx");
		driver.findElement(By.xpath("//input[@id='MercuryHeader1_imgLaneActivation']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='ctl00_UserMenu_aLaneWizard']")).click();
		driver.findElement(By.xpath("//span[@id='ctl00_MainContent_rdBtnNewproductcategory_S_D']")).click();
		driver.findElement(By.xpath("//a[@id='ctl00_MainContent_aNewproductcategory']")).click();
		                                                         
		                                                             
		//Selection of Lane Type as One Time(BCP)
		Thread.sleep(4000);
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbLaneType_I")).click(); 
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbLaneType_I")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN); 
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbLaneType_I")).sendKeys(Keys.ENTER);
		                                       
		//Business Model - File upload using Java Robot
		Thread.sleep(6000);
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_uplBusinessModel")).click();
		Thread.sleep(5000);
		StringSelection s=new StringSelection("C:\\Users\\rajesh.pc\\Desktop\\LaneActivation_GPR_BusinessModel_DataForm_Template(1)");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_btnBusinessModel_CD")).click();
		
		Thread.sleep(10000);
		driver.switchTo().alert().accept();
		                                        
		//type of move
		Thread.sleep(5000);
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbTypeofMove_I")).click(); 
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbTypeofMove_I")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN); 
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbTypeofMove_I")).sendKeys(Keys.ENTER);
		                       
		//Origin Country selection using keyboard events
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbOriginCountry_I")).click(); 
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbOriginCountry_DDD_L_LBI241T0")).click();
		                   	                                       
		//Seller Legal Entity Code & Name
		Thread.sleep(5000);
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbSellerName_I")).click(); 
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbSellerName_I")).sendKeys(Keys.ARROW_DOWN); 
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbSellerName_I")).sendKeys(Keys.ENTER);
		
		//Destination Country selection using keyboard events
		Thread.sleep(6000);
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbDestinationCountry_I")).click(); 
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbDestinationCountry_DDD_L_LBI100T0")).click();
		                                       		                                       
		//Product Type / Commodity selection using keyboard events
		Thread.sleep(7000);
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbProductType_I")).click(); 
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbProductType_I")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN); 
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbProductType_I")).sendKeys(Keys.ENTER);
		                                       
		//Selection of Category
		Thread.sleep(4000);
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbCategory_I")).click(); 
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbCategory_I")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN); 
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbCategory_I")).sendKeys(Keys.ENTER);

		//Start of Shipment Date from Loading Site
		Thread.sleep(4000); 
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_txtDateofSOS_I")).sendKeys("05/24/2018"); 
		                                       
		//Is P&G IOR (Importer of Record)
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_rbtnlstIsPGIOR_RB1_I")).click();
		                                       
		//Estimated Annual Forecast / Estimated Shipment Quantity
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_txtAnnualforecast")).sendKeys("12");
		                                       
		//Supplier/Shipper
		//Supplier / Shipper same As Seller?
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_chkSameasSeller_S_D")).click();
		                 			                                       //Sold To Party
		//Sold To Legal Entity / Plant - Code & Name
		Thread.sleep(7000);
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbSoldToName_I")).click(); 
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbSoldToName_I")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN); 
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_cmbSoldToName_I")).sendKeys(Keys.ENTER);
		                                      
		//Ship To Party
		Thread.sleep(6000);
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_chkSameAsSoldToParty_S_D")).click(); 
		                 
		//Submit
		Thread.sleep(5000);
		driver.findElement(By.id("ctl00_MainContent_pnlShipperCallback_btnSubmit_CD")).click(); 
		String x = driver.switchTo().alert().getText();
		System.out.println(x);
		driver.switchTo().alert().accept();
		                 				                                    
		//Select Created Lane Request number under Dashboard View
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//*[@id='ctl00_MainContent_gvRecords_cell0_17_btnLaneNum']/span")).click();
		Thread.sleep(6000);
		                                
		//Click Edit
		Thread.sleep(5000);
		driver.findElement(By.id("ctl00_MainContent_btnEdit_CD")).click();
		                 
		//Click Additional infromation
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id='ctl00_UserMenu_trAdditionalInformation']/td/a")).click();
		
		//Fill Additional Information fields
		
		//IncoTerm (Origin Leg)
		driver.findElement(By.id("ctl00_MainContent_cmbIncotermLegOrigin_I")).click(); 
		driver.findElement(By.id("ctl00_MainContent_cmbIncotermLegOrigin_I")).sendKeys(Keys.ARROW_DOWN); 
		driver.findElement(By.id("ctl00_MainContent_cmbIncotermLegOrigin_I")).sendKeys(Keys.ENTER);
		                 
		//IncoTerm Location Name (Origin Leg)
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_MainContent_txtNameofPlaceOrigin")).sendKeys("Test");
		                 
		//IncoTerm (Destination Leg)
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_MainContent_cmbIncotermLegDestination_I")).click(); 
		driver.findElement(By.id("ctl00_MainContent_cmbIncotermLegDestination_I")).sendKeys(Keys.ARROW_DOWN); 
		driver.findElement(By.id("ctl00_MainContent_cmbIncotermLegDestination_I")).sendKeys(Keys.ENTER);
		                                       
		//IncoTerm Location Name (Destination Leg)
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_MainContent_txtNameofPlaceDestination")).sendKeys("Test");
		                 
		//Sales Area - Origin
		driver.findElement(By.id("ctl00_MainContent_txtSalesAreaOrigin")).sendKeys("Test");
		
		//Shipping Point - Origin
		driver.findElement(By.id("ctl00_MainContent_txtShippingPointOrigin")).sendKeys("Test");
		
		//Plant Vendor Code
		driver.findElement(By.id("ctl00_MainContent_txtPlantVendorCode")).sendKeys("Test");
		
		// Purch Org - Destination
		driver.findElement(By.id("ctl00_MainContent_txtPurchOrgDestination")).sendKeys("Test");
		                 
		//Sales Area - Destination
		driver.findElement(By.id("ctl00_MainContent_txtSalesAreaDestination")).sendKeys("Test");
		
		// Equipment Type
		driver.findElement(By.id("ctl00_MainContent_lstEquipmentType_126_D")).click();
		                                       
		// Click Submit
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_MainContent_btnSubmit_CD")).click();
		
		String x1 = driver.switchTo().alert().getText();
		System.out.println(x1);
		driver.switchTo().alert().accept();
		// Close the browser
		driver.close();
		                       
		    }
		                                       
		}
	
	
	

	


