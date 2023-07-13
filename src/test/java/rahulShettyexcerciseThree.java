import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class rahulShettyexcerciseThree {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/windows']")).click();
        String parentbaba = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> it =  tabs.iterator();
        while (it.hasNext()){
            String childbaba = it.next();
            if(!parentbaba.equalsIgnoreCase(childbaba)){
                driver.switchTo().window(childbaba);
            }

        }
        System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
        driver.switchTo().window(parentbaba);
        System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());


    }
}
