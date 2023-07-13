import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class rahulShettyExcerciseSix {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/#");
        System.out.println(driver.findElements(By.xpath("//div[@class='left-align'] //table[@id='product']/descendant::tr")).size());
        System.out.println(driver.findElements(By.xpath("//div[@class='left-align'] //table[@id='product']/descendant::tr/th")).size());
        List<WebElement> thirdRow = driver.findElements(By.xpath("//div[@class='left-align'] //table[@id='product']/descendant::tr[4]/td"));
        for (WebElement data:thirdRow) {
            System.out.println(data.getText());
        }
        driver.close();
    }
}
