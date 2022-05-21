package day05_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {
    /*
1 C01_TekrarTesti isimli bir class olusturun
2 https://www.amazon.com/ adresine gidin
3 Browseri tam sayfa yapin
4 Sayfayi “refresh” yapin
5 Sayfa basliginin “Spend less” ifadesi icerdigini test edin
6 Gift Cards sekmesine basin
7 Birthday butonuna basin
8 Best Seller bolumunden ilk urunu tiklayin
9 Gift card details’den 25 $’i secin
10 Urun ucretinin 25$ oldugunu test edin
11 Sayfayi kapatin
     */
    public static void main(String[] args) throws InterruptedException {
        // 2 https://www.amazon.com/ adresine gidin
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        //3 Browseri tam sayfa yapin
        driver.manage().window().maximize();

        Thread.sleep(4000);
        //4 Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5 Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String sayfaBasligi = driver.getTitle();
        String expectedWords = "Spend less";
        if (sayfaBasligi.contains(expectedWords)){
            System.out.println("sayfa basligi testi PASSED");
        }else {
            System.out.println("sayfa basligi testi FAILED");
        }

        //6 Gift Cards sekmesine basin
        WebElement giftCardsLink = driver.findElement(By.xpath("//a[@tabindex='0'][4]"));
        giftCardsLink.click();

        //7 Birthday butonuna basin
        WebElement birthdayButton = driver.findElement(By.xpath("//span[text()='Birthday']"));
        birthdayButton.click();

        //8 Best Seller bolumunden ilk urunu tiklayin
        WebElement bestSellerButton = driver.findElement(By.xpath("(//span[@class='nav-a-content'])[2]"));
        bestSellerButton.click();
        WebElement firstProduct = driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]"));
        firstProduct.click();

        //9 Gift card details’den 25 $’i secin
        WebElement giftCard$25 = driver.findElement(By.xpath("//button[@value='25']"));
        giftCard$25.click();

        //10 Urun ucretinin 25$ oldugunu test edin
        WebElement priceOfProduct = driver.findElement(By.xpath("(//span[text()='$25.00'])[2]"));
        String expectedPrice = "$25";
        if (priceOfProduct.getText().contains(expectedPrice)){
            System.out.println("Price Test PASSED");
        }else System.out.println("Price Test FAILED");

        driver.close();











    }
}
