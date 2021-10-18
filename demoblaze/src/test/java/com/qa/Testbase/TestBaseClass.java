package com.qa.Testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseClass {
	public static WebDriver d;
	public static Properties pro;
    
	
	public TestBaseClass() throws IOException {
		pro =new Properties();
		FileInputStream src =new FileInputStream("C:/Users/PAVAN/eclipse-workspace/demoblaze/src/test/java/com/qa/config/config.properties");
	    pro.load(src);
	}
	
	public static void initilization() {
		String browsername =pro.getProperty("browser");
		if(browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			d=new ChromeDriver();
			
		}else if (browsername.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			d=new FirefoxDriver();
		}else if(browsername.equals("msedge")) {
			WebDriverManager.edgedriver().setup();
			d= new EdgeDriver();
		}
		else {
			System.out.println("Browser not find");
		}
		d.get(pro.getProperty("url"));
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	
	
	public static void verifyScrolling() throws InterruptedException {

		Thread.sleep(5000);
		JavascriptExecutor j = ((JavascriptExecutor) d);
		j.executeAsyncScript("scroll(0,400)");
		Thread.sleep(10000);
		System.out.println("Able to do Scroll");

	}
	
	public static void Screenshot(WebDriver d,String randomname) throws IOException {
		File src = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		File f = new File("C:/Users/PAVAN/eclipse-workspace/demoblaze/screenshots/"+randomname+".png");
		FileHandler.copy(src, f);
		System.out.println("Screenshot is Taken");

	}
	public String randomname() {
	String randomstring=RandomStringUtils.randomAlphabetic(5);
	return randomstring;
	}
}
