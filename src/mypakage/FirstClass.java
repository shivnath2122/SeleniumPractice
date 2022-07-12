package mypakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	

	public static void main(String[] args) {
		
		try {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://old.visuallearningkids.com/CCNearBy/code/restaurant/index");
		driver.manage().window().maximize();
		
		WebElement u_name= driver.findElement(By.id("user_name"));
		u_name.sendKeys("admin");
		WebElement LastName= driver.findElement(By.id("password"));
		LastName.sendKeys("admin");
		WebElement login_btn= driver.findElement(By.id("login_btn"));	
		login_btn.click();
		
		//WebDriverWait wait = new WebDriverWait(driver,TimeOut);
		
		WebElement restorunt= driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/a"));
		restorunt.click();
		
		WebElement search_txt= driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0_filter\"]/label/input"));
		
		search_txt.sendKeys("Shikha");
		
		
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
}
	}
