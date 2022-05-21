package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
    /*
    Main method oluşturun ve aşağıdaki görevi tamamlayın.
    a. http://a.testaddressbook.com adresine gidiniz.
    b. Sign in butonuna basin
    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
3. Sayfada kac tane link oldugunu bulun.
     */
    public static void main(String[] args) {

//        Main method oluşturun ve aşağıdaki görevi tamamlayın.
//    a. http://a.testaddressbook.com adresine gidiniz.

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://a.testaddressbook.com");
//    b. Sign in butonuna basin
        WebElement signInLinki = driver.findElement(By.linkText("Sign in"));
        signInLinki.click();
//    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement passwordTextBox = driver.findElement(By.name("session[password]"));
        WebElement signinButton = driver.findElement(By.name("commit"));
//    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
//        i. Username : testtechproed@gmail.com
//        ii. Password : Test1234!

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signinButton.click();

        //    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).

        WebElement actualKullaniciAdiElementi = driver.findElement(By.className("navbar-text"));
        System.out.println(actualKullaniciAdiElementi);//[[ChromeDriver: chrome on WINDOWS (be30a3a9715f9eee46c4511de24253da)] -> class name: navbar-text]
        System.out.println(actualKullaniciAdiElementi.getText());//testtechproed@gmail.com
        //bir Webelementin uzerinde ne yazdigini gormek istersek webElementi.getText() kuıllaniriz

        String expectedUserEmail = "testtechproed@gmail.com";
        if (expectedUserEmail.equals(actualKullaniciAdiElementi.getText())){
            System.out.println("Expected kullanici testi PASSED");
        } else {
            System.out.println("Expected kullanici testi FAILED");
        }




//    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addressesElementi = driver.findElement(By.linkText("Addresses"));
        WebElement signOutElementi = driver.findElement(By.linkText("Sign out"));
        if (addressesElementi.isDisplayed()){
            System.out.println("addresses testi PASSED");
        }else {
            System.out.println("addresses testi FAILED");
        }

        if (signOutElementi.isDisplayed()){
            System.out.println("sign out testi PASSED");
        }else {
            System.out.println("sign out testi FAILED");
        }


//3. Sayfada kac tane link oldugunu bulun.

        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("sayfadaki link sayisi: " + linklerListesi.size());
//linkleri yazdiralim

        System.out.println(linklerListesi);
        /*[[[ChromeDriver: chrome on WINDOWS (2edd5592b2e563e0285282e8011e17fe)] -> tag name: a],
           [[ChromeDriver: chrome on WINDOWS (2edd5592b2e563e0285282e8011e17fe)] -> tag name: a],
        [[ChromeDriver: chrome on WINDOWS (2edd5592b2e563e0285282e8011e17fe)] -> tag name: a]]

         */
        for (WebElement each: linklerListesi
             ) {
            System.out.println(each.getText());

        }
        /*
        Home
(current)
Addresses
Sign out
         */






        driver.close();

    }
}
