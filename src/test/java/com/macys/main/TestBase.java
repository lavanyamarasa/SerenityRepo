package com.macys.main;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.macys.util.TestUtil;

public class TestBase {

	private static final Logger logger = Logger.getLogger(TestBase.class.getName());
	public static WebDriver driver;
	
	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver", TestUtil.readDataFromProperties().getProperty("driver"));
		logger.info(TestUtil.readDataFromProperties().getProperty("url"));
		driver = new ChromeDriver();
		driver.get(TestUtil.readDataFromProperties().getProperty("url"));
		logger.info("driver initiated ");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
	}

	public static void main(String[] args) {		
		TestUtil.readDataFromExcel();
		System.out.println("Data from Properties " + TestUtil.readDataFromProperties().getProperty("browser"));
		TestBase.initDriver();
	}
}