package ru.msudrf.lpk.levober1;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {

    public ChromeDriver driver;

    @Before
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver","F:\\Java\\intern\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
    }

    @After
    public void Close() {
        driver.quit();
    }

}
