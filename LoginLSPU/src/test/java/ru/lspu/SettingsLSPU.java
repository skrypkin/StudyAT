package ru.lspu;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SettingsLSPU {

    public WebDriver driver;

    @Before
        public void openSite() {

            System.setProperty("webdriver.chrome.driver", "D:\\java\\test_intern\\chromedriver.exe");
            driver = new ChromeDriver();

    }

    @After
        public void closeSite() {


        //System.out.println("Test Passed!");
        //driver.quit();

    }

}
