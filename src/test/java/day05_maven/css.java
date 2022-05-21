package day05_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class css {
    /*
    1 ) Bir class oluşturun : Locators_css
2
Main method oluşturun ve aşağıdaki görevi tamamlayın.
a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
b. Locate email textbox
c. Locate password textbox ve
d. Locate signin button
e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini
tıklayın
i. Username : testtechproed@gmail.com
ii. Password : Test1234!
NOT: cssSelector kullanarak elementleri locate ediniz.
     */
    public static void main(String[] args) throws InterruptedException {
        // a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("http://a.testaddressbook.com/sign_in");
        Thread.sleep(3000);
        // b. Locate email textbox
        WebElement emailText = driver.findElement(By.cssSelector("#session_email"));
        // c. Locate password textbox ve
       // WebElement passwordlText = driver.findElement(By.cssSelector("input[name='session[password]']"));
       WebElement passwordlText = driver.findElement(By.cssSelector("input[name='session[password]']"));
        // d. Locate signin button
        WebElement signInButton = driver.findElement(By.cssSelector("input[data-test='submit']"));

        //e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini
        //tıklayın
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!

        emailText.sendKeys("testtechproed@gmail.com" );
        passwordlText.sendKeys("Test1234!");
        signInButton.click();

        driver.close();


    }

}
