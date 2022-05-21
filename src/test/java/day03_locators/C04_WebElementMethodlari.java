package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodlari {
    /*
    1- amazon.com'a gidip arama kutusunu locate edin
    2- arama kutusunun tagName'inin input oldugunu test edin
    3- arama kutusunun naem attribute'nun degerinin field-keywords oldugunu test edin
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        String expectedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();
        if (expectedTagName.equals(actualTagName)){
            System.out.println("TagName testi PASSED");
        }else {
            System.out.println("TagName testi FAILED");
        }

        String expectedNameDegeri = "field-keywords";
        String actualNameDegeri = aramaKutusu.getAttribute("name");

        if (expectedNameDegeri.equals(actualNameDegeri)){
            System.out.println("name attribute testi PASSED");
        }else {
            System.out.println("name attribute testi FAILED");
        }
        driver.close();

    }
}
