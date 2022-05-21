package day04_xPath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

/*
1
https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
2
Add Element butonuna basin
3
Delete butonu’nun gorunur oldugunu test edin
4
Delete tusuna basin
5
Add/Remove Elements ” yazisinin gorunur oldugunu test edin
*/

        // 1- https://the internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        // 2- Add Element butonuna basin
       //WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
       //WebElement addElementButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
       WebElement addElementButton = driver.findElement(By.xpath("//*[text()='Add Element']"));
       addElementButton.click();
     // 3- Delete butonu’nun gorunur oldugunu test edin
     WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));
     if (deleteButton.isDisplayed()){
         System.out.println("delete button testi PASSED");
     }else {
         System.out.println("delete button testi FAILED");
     }
     // 4 - Delete tusuna basin
     deleteButton.click();
     //5- Add/Remove Elements ” yazisinin gorunur oldugunu test edin
        WebElement addRemoveYaziElementi = driver.findElement(By.xpath("//h3"));
        if (addRemoveYaziElementi.isDisplayed()){
            System.out.println("addremove elementi testi PASSED");
        }else {
            System.out.println("addremove elementi testi FAILED");
        }
        Thread.sleep(3000);

        //driver.close();


    }//main method
}
