import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class rahulShettyExcerciseFour {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/nested_frames']")).click();
        Thread.sleep(2000);
        List<WebElement> el = driver.findElements(By.tagName("frame"));
        System.out.println("Size "+el.size());
        Thread.sleep(2000);
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
        System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
    }
}
