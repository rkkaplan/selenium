package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_getWindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        System.out.println(driver.getWindowHandle());
        // CDwindow-B4018BD5E23E4560C2724C74531A63F1 benzersiz olarak acilan window'un hashcode'unu verir.
    }
}
