/*
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class interview {
    public static void main(String[] args){
        //set up driver
        //wedbdriver ->
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        //login
        //profile.click();
        //switching to the tab
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parent=null;
        String child=null;
        while(it.hasNext()){
            parent=it.next();
            child=it.next();
        }
        //driver.switchTo(child);

        List<WebElement> ele = driver.findElements(By.tagName("a"));
        for (WebElement links:ele) {
            //int result = Fun(links);
            //System.out.println(result);
            //if(result!=200){
             //   count++;
            }

            //links.click();

        }
    }

}
*/
