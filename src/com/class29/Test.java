package com.class29;

public class Test {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.closeBrowser();
		driver.execute();
		driver.findElement();
		driver.m2();
		driver.maximizeWindow();
		driver.openBrowser();
		TakesScreenshot.m1();//access static method
		System.out.println(TakesScreenshot.fileExtension);

	}

}
