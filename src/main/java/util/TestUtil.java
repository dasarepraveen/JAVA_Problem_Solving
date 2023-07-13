package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

import java.util.Set;

public class TestUtil extends BasePage {

    public TestUtil(WebDriver driver){
        this.driver=driver;
    }

    public static void Scroll(WebElement element,WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);",
                element);
    }

    public static void SelectfromDropDown(WebElement element,String type){
        System.out.println("all optionsBefore");
        Select sc = new Select(element);
        System.out.println("all options after" + "\n" +sc.getAllSelectedOptions()+"get wrapped elements"+sc.getWrappedElement());
        sc.selectByVisibleText("Price: High to Low");
        //element.click();
    }

    public static void switchTab(WebDriver driver){
        String currentHandle= driver.getWindowHandle();
        Set<String> handles=driver.getWindowHandles();
        for(String actual: handles) {
            if(!actual.equalsIgnoreCase(currentHandle)) {
                driver.switchTo().window(actual);
            }
        }

    }

}
