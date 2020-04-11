package Open_site;

import org.openqa.selenium.chrome.ChromeDriver;

public class Open_site {    public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver","D:/java/test_intern/chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();

    String baseUrl = "http://demo.guru99.com/test/newtours/";
    String expectedTitle = "Welcome: Mercury Tours";
    String actualTitle = "";
    driver.get(baseUrl);


    actualTitle = driver.getTitle();

    if (actualTitle.contentEquals(expectedTitle)){
        System.out.println("Test Passed!");
    } else {
        System.out.println("Test Failed");
    }

    driver.close();

}
}
