package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000); // trows attik yukariya 3 saniye bekle dedik

        //techproeducation sayfasina gidelim
        driver.navigate().to("https://techproeducation.com");
        Thread.sleep(3000);

        //Tekrar amazon sayfasina donelim
        driver.navigate().back();//amazon sayfasina geri doner
        Thread.sleep(3000);

        //Tekrar techproeducation sayfasina gidelim
        driver.navigate().forward();//techpro ya gider
        Thread.sleep(3000);

        //Son sayfada sayfayi yenileyelim(refresh)
        Thread.sleep(3000);
        driver.navigate().refresh();

        //Ve sayfayi kapatalim
        driver.close();




        //Youtube ana sayfasina gidelim . https://www.youtube.com/
        //Amazon soyfasina gidelim. https://www.amazon.com/
        //Tekrar YouTube’sayfasina donelim
        //Yeniden Amazon sayfasina gidelim
        //Sayfayi Refresh(yenile) yapalim
        //Sayfayi kapatalim / Tum sayfalari kapatalim

       // odev
    }
}
