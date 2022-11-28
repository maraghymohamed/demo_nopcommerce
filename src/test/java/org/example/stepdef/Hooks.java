package org.example.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver = null;
    //Remember Static driver
    @Before
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();
        //System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @After
    public void closeBrowser() throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
    }
}
