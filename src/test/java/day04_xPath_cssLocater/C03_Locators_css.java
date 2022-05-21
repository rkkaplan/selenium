package day04_xPath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Locators_css {

        //1 ) Bir class oluşturun : Locators_css
        //2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
        public static void main(String[] args) throws InterruptedException {
            //  a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
            System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.get("http://a.testaddressbook.com/sign_in");
            //  b. Locate email textbox
            WebElement emailTextBox = driver.findElement(By.cssSelector("#session_email"));
            //  c. Locate password textbox ve
            WebElement passwordTextBox = driver.findElement(By.cssSelector("#session_password"));
            //  d. Locate signin button
            WebElement signInButton = driver.findElement(By.cssSelector("input[value='Sign in']"));
            //  e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
            //
            //      i. Username : testtechproed@gmail.com
            emailTextBox.sendKeys("testtechproed@gmail.com" + Keys.ENTER);
            Thread.sleep(3000);
            //      ii. Password : Test1234!
            passwordTextBox.sendKeys("Test1234!");
            Thread.sleep(3000);
            signInButton.click();





        }//main method



        //  d. Locate signin button
        //  e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //
        //      i. Username : testtechproed@gmail.com
        //      ii. Password : Test1234!
        //NOT: cssSelector kullanarak elementleri locate ediniz











}
