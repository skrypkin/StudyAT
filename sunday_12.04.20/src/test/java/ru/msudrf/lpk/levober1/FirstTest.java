package ru.msudrf.lpk.levober1;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest extends WebDriverSettings {


    @Test
    public void TestTitle() {

        driver.get("https://ya.ru");

       // String title = driver.getTitle();
       // Assert.assertEquals(true, title.equals("Виктор Мелиоров"));

    }

}
