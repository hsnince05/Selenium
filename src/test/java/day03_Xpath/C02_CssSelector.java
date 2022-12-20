package day03_Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;
public class C02_CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");


        // Browseri tam sayfa yapin
        driver.manage().window().maximize();


        // Sayfayi “refresh” yapin
        driver.navigate().refresh();


        // Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle = driver.getTitle();
        String arananKelime = "Spend less";
        if (actualTitle.contains(arananKelime)) {
            System.out.println("PASSED");
        } else System.out.println("FAILED actualTitle-> " + actualTitle);

        // Gift Cards sekmesine basin
        driver.findElement(By.cssSelector("a[href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();


        // Birthday butonuna basin
        driver.findElement(By.cssSelector("img[alt='Birthday']")).click();


        // Best Seller bolumunden ilk urunu tiklayin
        List<WebElement> bestSeller8 = driver.findElements(By.cssSelector("img[alt='Amazon.com eGift Card']"));
        bestSeller8.get(0).click();


        // Gift card details’den 25 $’i secin
        driver.findElement(By.cssSelector("span[id='a-autoid-28']")).click();


        //-Urun ucretinin 25$ oldugunu test edin
        WebElement urunUcreti = driver.findElement(By.cssSelector("span[id='gc-live-preview-amount']"));
        if (urunUcreti.getText().equals("$25.00")) {
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED");


        //-Sayfayi kapatin
        driver.close();

    }
}