package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru {
    // //1-Test01 isimli bir class olusturun
    //    //2- https://www.amazon.com/ adresine gidin
    //    //3- Browseri tam sayfa yapin
    //    //4-Sayfayi “refresh” yapin
    //    //5-”Salesforce Apex Questions Bank” icin arama yapiniz
    //    //6- Kac sonuc bulundugunu yaziniz
    //    //7-Sayfayi kapatin


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://www.amazon.com");
        driver.navigate().refresh();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Salesforce Apex Questions Bank", Keys.ENTER);

        WebElement aa = driver.findElement(By.className("sg-col-inner"));
        System.out.println(aa.getText());



    }
}
