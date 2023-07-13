import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class rahulShettyExcerciseOne {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        Assertions.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        Assertions.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
        Assertions.assertEquals(driver.findElements(By.xpath("//input[contains(@id,'checkBox')]")).size(),3);
        driver.close();
    }
}
