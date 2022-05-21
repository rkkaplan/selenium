package PracticeElifHoca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {
    // ...Exercise3...
// go to url : https://www.techlistic.com/p/selenium-practice-form.html
//fill the firstname
//fill the firstname
//check the gender
//check the experience
//fill the date
//choose your profession -> Automation Tester
//choose your tool -> Selenium Webdriver
//choose your continent -> Antartica
//choose your command  -> Browser Commands
//click submit button
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("//a[text()='Tamam']")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("alex");
        driver.findElement(By.name("lastname")).sendKeys("de souza");
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("2020-2022");

        driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
        driver.findElement(By.xpath("//option[text()='Antartica']")).click();
        driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        driver.close();


    }
}
