package RegLogOrderCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class SecondClassAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training\\java 7 lib\\chromedriver.exe");
		
		ChromeOptions Options = new ChromeOptions();
		
		Options.addArguments("start-maximized");
		
		Options.addArguments("disable-infobars");
		Options.addArguments("--incognito");
		Options.addArguments("--ignore-certificate-errors");
		Options.addArguments("--disable-popup-blocking");
		
		WebDriver driver = new ChromeDriver(Options);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//Registration start
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");	
		driver.manage().window().maximize();
        
		String arg1 = "adn.nasee3@gmail.com";
		String arg2 = "password";

		 WebElement startButton;  
		 startButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/div[1]/a[1]"));
		 startButton.click(); 
		 
		 WebElement firstName;
		 firstName = driver.findElement(By.id("input-firstname"));
		 firstName.sendKeys("Nauman");
		 
		 WebElement lastName;
		 lastName = driver.findElement(By.id("input-lastname"));
		 lastName.sendKeys("Naseer");
		 
		 WebElement userEmail;
		 userEmail = driver.findElement(By.id("input-email"));
		 //userEmail.sendKeys("nomi.naseer@gmail.comaaa");
		 userEmail.sendKeys(arg1);
		 
		 WebElement phoneNumber;
		 phoneNumber = driver.findElement(By.id("input-telephone"));
		 phoneNumber.sendKeys("02136565666");
		 
		 WebElement password;
		 password = driver.findElement(By.id("input-password"));
		 //password.sendKeys("password");
		 password.sendKeys(arg2);
		 
		 WebElement reconfirmPassword;
		 reconfirmPassword = driver.findElement(By.id("input-confirm"));
		 //reconfirmPassword.sendKeys("password");
		 reconfirmPassword.sendKeys(arg2);
		 
		 WebElement subscribeCheckbox;
		 subscribeCheckbox = driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/fieldset[3]/div[1]/div[1]/label[1]/input[1]"));
		 subscribeCheckbox.click();
		 
		 WebElement privacyPolicy;
		 privacyPolicy = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
		 privacyPolicy.click();
		 
		 Thread.sleep(5000);
				 
		 WebElement submitButton;
		 submitButton = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
		 submitButton.click();
		 
		 // Logout After registration
		 
		 WebElement logOut1;
		 logOut1 = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
		 logOut1.click();
		
		 WebElement logOut2;
		 logOut2 = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"));
		 logOut2.click();
			
			
		//Login
		 
		 driver.get("https://demo.opencart.com/index.php?route=account/login");	
		 driver.manage().window().maximize();

		
		 WebElement username;
		 username = driver.findElement(By.id("input-email"));
		// username.sendKeys("nomi.naseer@gmail.com");
		 username.sendKeys(arg1);
		 
		 WebElement Password;
		 Password = driver.findElement(By.id("input-password"));
		 //Password.sendKeys("pass");
		 Password.sendKeys(arg2);
		 
		 WebElement loginButton;  
		 loginButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		 loginButton.click(); 
		 
		
		 // Search product
		 
		 WebElement searchProduct;
		 searchProduct = driver.findElement(By.xpath("//*[@id=\"search\"]/input[1]"));
		 searchProduct.sendKeys("hp lp3065");
		 
		 WebElement searchProductbutton;
		 searchProductbutton = driver.findElement(By.xpath("//*[@id=\"search\"]/span[1]/button[1]"));
		 searchProductbutton.click();
		 
		 WebElement addToCart1;
		 addToCart1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]"));
		 addToCart1.click();
		 
		 Thread.sleep(2000);
		 
		 // Add product to cart
		 
		 WebElement addToCart2;  
		 addToCart2 = driver.findElement(By.id("button-cart"));
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].scrollIntoView()", addToCart2);
		 addToCart2.click(); 
		 
	
		 WebElement clickOnitem = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id=\"cart\"]/button"))));
		 clickOnitem.click();
		 
		 WebElement clickOncheckout = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong"))));
		 clickOncheckout.click();
		 
		 // Now we added billing detail
		 
		 Thread.sleep(2000);
		 
	
		// Check the element presence first before clicking on it.
		 boolean newPaymentaddressexsist;
		 newPaymentaddressexsist = driver.findElements(By.xpath("//*[@id=\"collapse-payment-address\"]/div/form/div[3]/label/input")).size() != 0;
		 
		 if(newPaymentaddressexsist)
		  {
			 WebElement newPaymentaddress;
			 newPaymentaddress = driver.findElement(By.xpath("//*[@id=\"collapse-payment-address\"]/div/form/div[3]/label/input"));
			 newPaymentaddress.click();
		  }
		 
	  	 WebElement firstName1;
		 firstName1 = driver.findElement(By.id("input-payment-firstname"));
		 firstName1.sendKeys("Nauman");
		 
		 WebElement lastName1;
		 lastName1 = driver.findElement(By.id("input-payment-lastname"));
		 lastName1.sendKeys("Naseer");
		 
		 WebElement companyName;
		 companyName = driver.findElement(By.id("input-payment-company"));
		 companyName.sendKeys("Digital");
		 
		 WebElement addressOne;
		 addressOne = driver.findElement(By.id("input-payment-address-1"));
		 addressOne.sendKeys("Address line 1");
		 
		 WebElement addressTwo;
		 addressTwo = driver.findElement(By.id("input-payment-address-2"));
		 addressTwo.sendKeys("Address line 2");
		 
		 WebElement cityName;
		 cityName = driver.findElement(By.id("input-payment-city"));
		 cityName.sendKeys("KHR");
		 
		 WebElement postCode;
		 postCode = driver.findElement(By.id("input-payment-postcode"));
		 postCode.sendKeys("KHR");
		 
		 
	   	 Select countryName = new Select(driver.findElement(By.id("input-payment-country")));
	   	 countryName.selectByValue("81");
	   	 
	   	 Thread.sleep(2000);
		 
	   	 Select paymentZone = new Select(driver.findElement(By.id("input-payment-zone")));
	   	 paymentZone.selectByVisibleText("Berlin");
	   	 
		 WebElement continueButton;  
		 continueButton = driver.findElement(By.id("button-payment-address"));
		 continueButton.click(); 		 
		 		 
	    // Now we added Delivery detail
		 
		 Thread.sleep(2000);
		
		 WebElement newShippingaddress;
		 newShippingaddress = driver.findElement(By.xpath("//*[@id=\"collapse-shipping-address\"]/div/form/div[3]/label/input"));
		 newShippingaddress.click();		
		 
	     WebElement shippingFirstname;
	     shippingFirstname = driver.findElement(By.id("input-shipping-firstname"));
	     shippingFirstname.sendKeys("Nauman");
		 
		 WebElement shippingLastname;
		 shippingLastname = driver.findElement(By.id("input-shipping-lastname"));
		 shippingLastname.sendKeys("Naseer");
		 
		 WebElement shippingCompanyname;
		 shippingCompanyname = driver.findElement(By.id("input-shipping-company"));
		 shippingCompanyname.sendKeys("DD");
		 
		 WebElement shippingAddressone;
		 shippingAddressone = driver.findElement(By.id("input-shipping-address-1"));
		 shippingAddressone.sendKeys("Address line 1");
		 
		 WebElement shippingAddresstwo;
		 shippingAddresstwo = driver.findElement(By.id("input-shipping-address-2"));
		 shippingAddresstwo.sendKeys("Address line 2");
		 
		 WebElement shippingCityname;
		 shippingCityname = driver.findElement(By.id("input-shipping-city"));
		 shippingCityname.sendKeys("KHR");
		 
		 WebElement shippingPostcode;
		 shippingPostcode = driver.findElement(By.id("input-shipping-postcode"));
		 shippingPostcode.sendKeys("123456");
		 
	   	 Select shippingCountryName = new Select(driver.findElement(By.id("input-shipping-country")));
	   	 shippingCountryName.selectByValue("81");
	   	 
	   	 Thread.sleep(2000);
		 		 
	   	 Select shippingPaymentZone = new Select(driver.findElement(By.id("input-shipping-zone")));
	   	 shippingPaymentZone.selectByVisibleText("Berlin");
	   	 
	   	 
		 WebElement shipContinueButton;  
		 shipContinueButton = driver.findElement(By.id("button-shipping-address"));
		 shipContinueButton.click(); 		 
		 
		 // Confirm Delivery Method 
		 Thread.sleep(2000);
		 
		 WebElement deliveryTextarea;  
		 deliveryTextarea = driver.findElement(By.xpath("//*[@id=\"collapse-shipping-method\"]/div/p[4]/textarea"));
		 deliveryTextarea.sendKeys("Test delivery");
		 
		 WebElement continueShipping;  
		 continueShipping = driver.findElement(By.id("button-shipping-method"));
		 continueShipping.click(); 
		 
		 
		 // Confirm Payment Method 
		 Thread.sleep(2000);

		 WebElement paymentTextarea;  
		 paymentTextarea = driver.findElement(By.xpath("//*[@id=\"collapse-payment-method\"]/div/p[3]/textarea"));
		 paymentTextarea.sendKeys("Test payment");
		 
		 WebElement agreeTerm;
		 agreeTerm = driver.findElement(By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]"));
		 agreeTerm.click();	
		 
		 WebElement continuePaymentmethod;  
		 continuePaymentmethod = driver.findElement(By.id("button-payment-method"));
		 continuePaymentmethod.click(); 		
		 
		 //Confirm Order
		 Thread.sleep(2000);
		 
		 WebElement confirmOrder;  
		 confirmOrder = driver.findElement(By.id("button-confirm"));
		 confirmOrder.click(); 	
		 
		 Thread.sleep(2000);
		 
		 String actualpagetitle = driver.getTitle();
		 String expectedTitle = "Your order has been placed!";
		 
		 Thread.sleep(2000);
		 
		 if (actualpagetitle.contentEquals(expectedTitle)){
	            System.out.println("Order placed successfully");
	        } else {
	            System.out.println("Test Failed");
	        }
		 
		 driver.close();
			
		 driver.quit();
		 
	}



}
