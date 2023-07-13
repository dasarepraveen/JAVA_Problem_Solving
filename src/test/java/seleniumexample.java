import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class seleniumexample {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("url");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abcd");
        driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("abcd@123");
        driver.findElement(By.id("login")).click();

        driver.findElement(By.xpath("//a[]")).click();

        List<WebElement> name = driver.findElements(By.xpath("//"));
        for (WebElement names:name) {
            System.out.println(names);
        }

    }
}
