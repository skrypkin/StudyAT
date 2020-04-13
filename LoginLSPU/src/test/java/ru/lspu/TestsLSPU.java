package ru.lspu;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Date;

public class TestsLSPU extends SettingsLSPU {

    @Test
    public void EnterLogin() {

        driver.get("http://lspu-lipetsk.ru/modules.php?name=kabinet");

        driver.findElement(By.name("avt_login")).sendKeys("***");
        driver.findElement(By.name("avt_pass")).sendKeys("***");
        driver.findElement(By.name("avt_mem")).click();
        driver.findElement(By.className("red_form_button")).click();
        driver.findElement(By.id("l22")).click();

    }

    @Test

    public void ClickLesson() {

        Date date = new Date();


        if ( == date){



        }

    }

}
