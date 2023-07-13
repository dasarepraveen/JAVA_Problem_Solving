
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.Random;

public class rahulShettyExcerciseFive {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/#");
        int option = rahulShettyExcerciseFive.generateRandonNumber();
        String input = "option"+String.valueOf(option);
        WebElement checkbox = driver.findElement(By.xpath("//input[@value="+"'"+input+"'"+"]"));
        checkbox.click();
        Assertions.assertTrue(checkbox.isSelected());
        input=input.substring(0,1).toUpperCase()+input.substring(1);
        Select st = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
        st.selectByVisibleText(input);
        driver.findElement(By.id("name")).sendKeys(input);
        driver.findElement(By.id("alertbtn")).click();
        String alerttext = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assertions.assertEquals(alerttext,"Hello "+input+","+" share this practice page and share your knowledge");
        driver.close();
    }
    public static int generateRandonNumber(){
        Random rn = new Random();
        return rn.nextInt(3) + 1;

    }
}
