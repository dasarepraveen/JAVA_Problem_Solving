import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePageElements;

import java.time.Duration;

public class searchTvE2E {
public static void main(String[] args){
    superKey sk = new superKey();
    sk.getsuperFunction();
    //WebDriverManager.chromedriver().setup();
    //ChromeDriver driver = new ChromeDriver();
//    WebDriverManager.chromedriver().setup();
//    WebDriver driver = new ChromeDriver();
//    driver.get("https://www.amazon.in");
//
//    HomePageElements hm = new HomePageElements(driver);
//    hm.clickHamburgerMenu();

    WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/locatorspractice/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.findElement(By.id("inputUsername")).sendKeys("anbcd");
    driver.findElement(By.name("inputPassword")).sendKeys("anbcd");
    driver.findElement(By.className("signInBtn")).click();
    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
    driver.findElement(By.partialLinkText("Forgot your password?")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("asdasd");
    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("qweqweq");
    driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("1231231321");
    driver.findElement(By.cssSelector("button[class*='pwd']")).click();
    driver.findElement(By.xpath("//button[contains(@class,'login')]")).click();

}
}
