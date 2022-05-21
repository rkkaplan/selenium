package PracticeElifHoca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P06_homework2 {
    /*
    // ...Exercise6...
    1.  https://id.heroku.com/login sayfasina gidin
    2.  Bir mail adresi giriniz
    3.  Bir password giriniz
    4.  Login butonuna tiklayiniz
    5.  "There was a problem with your login." texti gorunur ise
    6.  "kayit yapilamadi" yazdiriniz
    8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz
    9.  Tum sayfalari kapatiniz
     */
    public static void main(String[] args) {
        //1.  https://id.heroku.com/login sayfasina gidin
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://id.heroku.com/login");
        //2.  Bir mail adresi giriniz
        driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("abcd@yahoo.com");
        //3.  Bir password giriniz
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12345");
        //    4.  Login butonuna tiklayiniz
        driver.findElement(By.xpath("//*[@value='Log In']")).click();
        //5.  "There was a problem with your login." texti gorunur ise
        //    6.  "kayit yapilamadi" yazdiriniz
        WebElement alert = driver.findElement(By.xpath("//div[text()='There was a problem with your login.']"));
        if (alert.isDisplayed()) System.out.println("kayit yapilamadi");
        //8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz
        else System.out.println("kayit yapildi");
        //    9.  Tum sayfalari kapatiniz
        driver.quit();
    }
}
