package com.class29;

public interface WebDriver extends TakesScreenshot, Executes {
	void openBrowser();

	void closeBrowser();

	void maximizeWindow();

	void findElement();
}

class ChromeDriver extends Browser implements WebDriver, Report {
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

	@Override
	public void refreshBrowser() {
		System.out.println("Chrome browser refreshing");

	}

	@Override
	public void getReport() {
		System.out.println("Reports from chrome");

	}

	@Override
	public void takesScreenshot() {
		System.out.println("Taking screenshot in chrome browser");

	}

	@Override
	public void execute() {
		System.out.println("executing code from chrome browser");

	}
}

class FirefoxDriver extends Browser implements WebDriver, Report {
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

	@Override
	public void refreshBrowser() {
		System.out.println("Firefox refreshing browser");

	}

	@Override
	public void getReport() {
		System.out.println("Reports from Firefox browser");

	}

	@Override
	public void takesScreenshot() {
		System.out.println("Taking screenshot from firefox browser");

	}

	@Override
	public void execute() {
		System.out.println("executing code from firefox browser");

	}
}
