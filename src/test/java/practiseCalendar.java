import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class practiseCalendar {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
        driver.findElement(By.xpath("//table[@id='datepickers']/descendant::td[2]::input[@type='text']")).click();
        while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/child::span[@class='ui-datepicker-month']")).getText().contains("December")){
            driver.findElement(By.xpath("//a[@title='Next']")).click();
        }
        List<WebElement> el = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/descendant::a[@class='ui-state-default']"));
        for (WebElement dat:el) {
            if(dat.getText().equalsIgnoreCase("16")){
                dat.click();
            }

        }


        //a[@class='ui-state-default']/ancestor::div
    }
}
