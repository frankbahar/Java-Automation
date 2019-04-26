package com.class28;
public interface WebDriver {
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
}
class ChromeDriver implements WebDriver {
	@Override
	public void openBrowser() {
		System.out.println("Chrome browser is opening");
	}
	@Override
	public void closeBrowser() {
		System.out.println("Chrome browser is closing");
	}
	@Override
	public void maximizeWindow() {
		System.out.println("Chrome browser maximized the window");
	}
	@Override
	public void findElement() {
		System.out.println("Chrome browser find element wanted");
	}
}
class FirefoxDriver implements WebDriver {
	@Override
	public void openBrowser() {
		System.out.println("Firefox browser is opening");
	}
	@Override
	public void closeBrowser() {
		System.out.println("Firefox browser is closing");
	}
	@Override
	public void maximizeWindow() {
		System.out.println("Firefox browser maximized the window");
	}
	@Override
	public void findElement() {
		System.out.println("Firefox browser find element wanted");
	}
}
