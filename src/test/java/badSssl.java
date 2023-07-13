import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class badSssl {
    public static void main(String[] args){
        ChromeOptions opt = new ChromeOptions();
        opt.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get("https://expired.badssl.com/");
    }
}
