import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class rahulShettyExceriseTwo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("//span[text()=' User']/following-sibling::input")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement ele= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='okayBtn']")));
        ele.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='form-control']")));

        Select st = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
        st.selectByIndex(2);

        driver.findElement(By.id("terms")).click();

        driver.findElement(By.id("signInBtn")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='nav-link btn btn-primary']")));

        List<WebElement> addtocart = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
        for (WebElement ch:addtocart
             ) {ch.click();

        }
       driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-default']")));
        driver.close();
    }
}
