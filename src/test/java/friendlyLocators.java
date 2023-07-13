import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class friendlyLocators {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement el = driver.findElement(By.xpath("//input[@name='name']"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(el)).getText());


        driver.get("https://rahulshettyacademy.com/#/index");
        System.out.println(driver.findElement(By.xpath("//div[@id='courses-block']/descendant::h2[1]")).getText());


    }
}
