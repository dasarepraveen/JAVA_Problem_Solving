import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printOnlyFooterLinks {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        WebElement footer = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
        System.out.println(" Footer anchro link count "+footer.findElements( By.tagName("a")).size());
        //or
        System.out.println("Or the other way to print the count is by using descendent tag "+
                driver.findElements(By.xpath("//div[@id='gf-BIG']/descendant::a")).size());

        //div[@id='gf-BIG']/descendant::a
        //descendant
    }
}
