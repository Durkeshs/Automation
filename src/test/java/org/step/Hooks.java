package org.step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
 public static WebDriver driver;

@Before
	public void before() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DURKESH KUMAR\\eclipse-workspace\\CucumberTest\\div\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
	}
@After
public void after() {
driver.quit();
}
}
