import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class openLinksInNewTab {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/#");
        List<WebElement> links = driver.findElements(By.xpath("//div[@id='gf-BIG']/descendant::ul[1]/li/child::a"));
        System.out.println("Count is "+links.size());
        for (WebElement anchor: links) {
            //anchor.sendKeys(Keys.chord(Keys.COMMAND,Keys.ENTER));
            anchor.sendKeys(Keys.chord(Keys.COMMAND,Keys.RETURN));
        }
        Set<String> Tabs = driver.getWindowHandles();
        Iterator<String> it = Tabs.iterator();
        while (it.hasNext()){
            driver.switchTo().window(it.next());
            Thread.sleep(2000);
            System.out.println(driver.getTitle());
        }
        driver.close();


    }
}
