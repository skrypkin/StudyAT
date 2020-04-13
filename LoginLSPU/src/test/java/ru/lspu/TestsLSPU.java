package ru.lspu;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestsLSPU extends SettingsLSPU {

    @Test
    public void EnterLogin() {

        driver.get("http://lspu-lipetsk.ru/modules.php?name=kabinet");

        driver.findElement(By.name("avt_login")).sendKeys("ghhwnz");
        driver.findElement(By.name("avt_pass")).sendKeys("BDjNBehA4");
        driver.findElement(By.name("avt_mem")).click();
        driver.findElement(By.className("red_form_button")).click();
        driver.findElement(By.id("l22")).click();



    }

}
