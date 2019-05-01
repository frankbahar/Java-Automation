package com.class29;

public class WebDriverTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.openBrowser();
		driver.maximizeWindow();
		driver.findElement();
		driver.closeBrowser();
		
		driver = new FirefoxDriver();
		driver.openBrowser();
		driver.maximizeWindow();
		driver.findElement();
		driver.closeBrowser();
		

	}

}
