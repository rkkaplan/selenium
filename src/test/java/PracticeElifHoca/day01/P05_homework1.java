package PracticeElifHoca;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05_homework1 {
    /*
       // ...Exercise5...
       // Navigate to website  https://testpages.herokuapp.com/styled/index.html
       // Under the  ORIGINAL CONTENTS
       // click on Alerts
       // print the URL
       // navigate back
       // print the URL
       // Click on Basic Ajax
       // print the URL
       // enter value-> 20 and Enter
       // and then verify Submitted Values is displayed open page
       // close driver
        */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Navigate to website  https://testpages.herokuapp.com/styled/index.html
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        // Under the  ORIGINAL CONTENTS
        // click on Alerts
        driver.findElement(By.xpath("//a[@id='alerts']")).click();
        // print the URL
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        // navigate back
        driver.navigate().back();
        // print the URL
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        // Click on Basic Ajax
        driver.findElement(By.xpath("//a[@id='basicajax']")).click();
        // print the URL
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        // enter value-> 20 and Enter
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("20" + Keys.ENTER);
        // and then verify Submitted Values is displayed open page
        WebElement submittedValues = driver.findElement(By.xpath("//*[text()='Submitted Values']"));
        if (submittedValues.isDisplayed()) System.out.println("submitted values is displayed");
        else System.out.println("submitted values is not displayed");
        // close driver
        driver.close();







    }
}
