package org.example.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Hooks{
    public static WebDriver driver;
    @Before
    public static void openBrowser(){
        WebDriverManager.safaridriver().setup();
        driver =new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public static void quit(){
        driver.quit();
    }
}