package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {
        /*  1- https://www.amazon.com url'ine gidin
            2- Basligin Amazon kelimesi icerdigini test edin
            3- Url'in  https://www.amazon.com a esit oldugunu test edin
            4- Sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //  1- https://www.amazon.com url'ine gidin

        driver.get("https://www.amazon.com");

       //   2- Basligin Amazon kelimesi icerdigini test edin
        String actualTitle = driver.getTitle();
        String expectedWord ="Amazon";
        if (actualTitle.contains(expectedWord)){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("title" + expectedWord + "'yi icermiyor, title testi FAILED");
        }
       //   3- Url'in  https://www.amazon.com a esit oldugunu test edin
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url testi PASSED");
        }else {
            System.out.println("actual Url:" + actualUrl + " expected Url'den farkli, test FAILED");
        }
       //   4- Sayfayi kapatin
        driver.close();

    }
}
