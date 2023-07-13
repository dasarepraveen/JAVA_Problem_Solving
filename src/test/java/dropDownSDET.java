import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class dropDownSDET {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hdfcbank.com/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@class='drp1']")).click();
        //driver.findElement(By.xpath("//a[@data-toggle='dropdown']/child::*")).click();
        Thread.sleep(2000);
        List<WebElement> el = driver.findElements(By.xpath("//a[@data-toggle='dropdown']/following-sibling::ul/li"));
        for (WebElement cards:el) {
            if(cards.getText().equalsIgnoreCase("Cards")){
                cards.click();
                break;
            }
        }
        driver.close();
    }
}
