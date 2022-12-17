package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Selenium {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        /*

        En temel haliyle otomasyon yapmak icin Class'imiza otomasyon icin gerekli olan webdriver'in yerini
        gostermemiz gerekir. Bunun icin Java kutuphanesnden System.setProperty() methodunun icine ilk olarak driver'i
        yazariz. Ikinci olarak driver'in fiziki yolunu kopyalariz

          */

        WebDriver driver = new ChromeDriver();// Bos bir browser actik
        driver.get("https://www.amazon.com");//ilk olarak gitmek istedigimiz sasyfayi belirtiriz.
        System.out.println("Sayfa Basliği: " + driver.getTitle());
        System.out.println("Sayfa Url'i: " + driver.getCurrentUrl());

        //System.out.println("kaynak kodlar: " + driver.getPageSource());// sayfanin html kodlarini getirdi

        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());// Bize o window'a ait hash degerini verir.
                                                                                     // Biz bu hash degerlerini String'e atayip
                                                                                    //  pencereler arasi gecis yapabiliriz.






    }
}
