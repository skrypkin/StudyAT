package ru.msudrf.lpk.levober1;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void FirstTest() {
        System.setProperty("webdriver.chrome.driver","D:/java/test_intern/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("http://levober1.lpk.msudrf.ru/");
    }

}
