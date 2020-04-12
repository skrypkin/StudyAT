package ru.msudrf.lpk.levober1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public ChromeDriver driver;

    @Before
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver","D:/java/test_intern/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        System.out.println("Test Start!");
    }

    @Test
    public void FirstTest() {

        driver.get("http://levober1.lpk.msudrf.ru/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Судебный участок №1 </br>Левобережного судебного района г. Липецка"));

    }

    @After
    public void Close() {
        System.out.println("Test Close!");
        driver.quit();
    }

}
