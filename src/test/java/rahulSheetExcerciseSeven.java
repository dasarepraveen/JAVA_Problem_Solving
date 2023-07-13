import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rahulSheetExcerciseSeven {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/#");
        driver.findElement(By.id("autocomplete")).sendKeys("uni");
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement USA = driver.findElement(By.xpath("//ul[@id='ui-id-1']//div[text()='United States (USA)']"));
        js.executeScript("arguments[0].scrollIntoView(true);",USA);
        USA.click();
        System.out.println("Out put is "+driver.findElement(By.id("autocomplete")).getAttribute("value"));
        driver.close();
    }
}
