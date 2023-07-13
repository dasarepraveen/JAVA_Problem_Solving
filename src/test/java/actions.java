import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Actions a = new Actions(driver);
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.click();
        a.moveToElement(search).keyDown(Keys.SHIFT).sendKeys("condoms").doubleClick().build().perform();
        a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
        WebElement el = driver.findElement(By.xpath("asdad"));
    }
}
