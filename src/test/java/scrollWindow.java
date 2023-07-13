import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class scrollWindow {
    public static void main(String[] args) throws InterruptedException {
        int sum=0;
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/#");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,500)");
        Thread.sleep(2000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=200");
        List<WebElement> el =  driver.findElements(By.xpath("//div[@class='tableFixHead']/descendant::tbody/child::tr /td[4]"));
        for (WebElement dates: el) {
            sum=sum+Integer.parseInt(dates.getText());
        }
        String result = String.valueOf(sum);
        System.out.println("result is "+result);
        String expected = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
        System.out.println("expected is "+expected);
        Assertions.assertTrue(expected.contains(result));
        driver.close();

    }
}
