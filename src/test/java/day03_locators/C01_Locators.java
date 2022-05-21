package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //Amazon'a gidip Nutella aratalim


        driver.get("https://www.amazon.com");
        //WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox")); // bu CALISTI // id genelde unique olur!!
        //WebElement aramaKutusu = driver.findElement(By.className("nav-search-field"));
        /*
        bu locator calismadi Locator alirken gozumuzden kacan detaylar olabilr
        aldigimiz bir locator calismazsa alternatif locatorlar denemeliyiz
        */
        //WebElement aramaKutusu = driver.findElement(By.className("nav-input nav-progressive-attribute"));// bu da calismadi //class genelde unique OLMAZ
        WebElement aramaKutusu = driver.findElement(By.name("field-keywords")); // bu CALISTI


        /*findElement(By...locator)-->istedigimiz web elementini bize dondurur
        biz de web elementini kullanmak icin bir objeye assign ederiz
         */

        /*
        herhangi bir web elementine istedigimiz yaziyi yollamak istersek
        */

        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        // driver.close();
    }
}
