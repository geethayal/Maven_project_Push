package com.Nykaa_Pjt;

import java.io.IOException;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.Maven_Project.Base_Class_Methods;

public class Nykaa_Base extends Base_Class_Methods{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//1. Login Page---------------
		browserLaunch("chrome");
		geturl("https://www.nykaa.com/");
		imwait(30);
		maxwindow();
		
		
		WebElement SignIn = driver.findElement(By.xpath("//button[@aria-label='Kebab menu']"));
		actions("move", SignIn);
		click(SignIn);
		
		WebElement SignWith = driver.findElement(By.xpath("(//button[@kind='secondary'])[1]"));
		actions("move", SignWith);
		click(SignWith);
		
		WebElement MobileNo = driver.findElement(By.xpath("//input[@name='emailMobile']"));
		passinput(MobileNo, "9787349755");
		
		WebElement Proceed = driver.findElement(By.id("submitVerification"));
		click(Proceed);
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Input");
		String otp = S.next();
		
		
		thesleep(2000);
		WebElement otp1 = driver.findElement(By.xpath("//input[@type='number']"));
		passinput(otp1, otp);
				
		WebElement Verify = driver.findElement(By.xpath("//button[@type='submit']"));
		click(Verify);
		
		//2. Select the Product------------
		WebElement MakeUp = driver.findElement(By.xpath("(//a[text()='makeup'])[2]"));
		actions("move", MakeUp);
				
		WebElement LipLiner = driver.findElement(By.xpath("//a[text()='Lip Liner']"));
		actions("move", LipLiner);
		click(LipLiner);
		
		windowhandle("multiple");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		
		WebElement TilburyLip = driver.findElement(By.xpath("//div[text()='Charlotte Tilbury Lip Cheat']"));
		actions("move", TilburyLip);
		click(TilburyLip);
		
//		thesleep(100);
		windowhandle("multiple");
		
		WebElement LipShades = driver.findElement(By.xpath("//img[contains(@alt,'Crazy In Love-shade')]"));
		actions("move", LipShades);
		click(LipShades);
		
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement Add2Bag = driver.findElement(By.xpath("(//button[@class=' css-1qvy369'])[1]"));
		click(Add2Bag);
		
//		3. Add to Cart-----------------
		WebElement Cart = driver.findElement(By.xpath("//span[@class='cart-count']"));
		actions("move", Cart);
		click(Cart);
		
		WebElement Frame1 = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		frames("webrefname", null, Frame1);
		
		thesleep(500);
		WebElement Proceed1 = driver.findElement(By.xpath("(//button[@class='css-1j2bj5f e8tshxd0'])[2]"));
		click(Proceed1);
		
//		4. Add Address-----------------
		WebElement addadress = driver.findElement(By.xpath("//div[@class='css-1pan5g8 e1gecm6x0']"));
		actions("move", addadress);
		click(addadress);
		
		thesleep(1000);
	
		WebElement FlatNo = driver.findElement(By.xpath("//input[@placeholder='House/ Flat/ Office No.']"));
		actions("move", FlatNo);
		click(FlatNo);
		passinput(FlatNo, "5/92");
	
		thesleep(500);
		
		WebElement RoadName = driver.findElement(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']"));
		actions("move", RoadName);
		click(RoadName);
		passinput(RoadName, "Mettu Street");
		
		js.executeScript("window.scrollBy(0, 9000)");
		
		thesleep(500);
		
		WebElement Name1 = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		actions("move", Name1);
		click(Name1);
		passinput(Name1, "Sangeetha");
		
		thesleep(500);
		WebElement PhoneNo = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		actions("move", PhoneNo);
		click(PhoneNo);
		passinput(PhoneNo, "9787349755");
		
		thesleep(500);
		WebElement EmailId = driver.findElement(By.xpath("//input[@placeholder='Email ID (Optional)']"));
		actions("move", EmailId);
		click(EmailId);
		passinput(EmailId, "geethayal@gmail.com");
		
		js.executeScript("window.scrollBy(0, -9000)");
		
		thesleep(500);
		WebElement Pincode1 = driver.findElement(By.xpath("//input[@placeholder='Pincode']"));
		actions("move", Pincode1);
		click(Pincode1);
		passinput(Pincode1, "600023");
		
		WebElement Ship2Address = driver.findElement(By.xpath("//button[text()='Ship to this address']"));
		click(Ship2Address);

//		5. Place the Order-------------
		WebElement COD = driver.findElement(By.xpath("//p[text()='Cash on delivery']"));
		actions("move", COD);
		click(COD);
		
		js.executeScript("window.scrollBy(0,-9000)");
		
//		WebElement PlaceOrder = driver.findElement(By.xpath("//button[text()='Place order']"));
//		click(PlaceOrder);
		
		screenshot("OrderPlaced");
	}
}
