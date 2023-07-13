package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.TestUtil;

import java.util.Arrays;
import java.util.List;

public class FilteredResults extends BasePage{
    List<WebElement> price = null;
    String secondHigest = null;
    public FilteredResults(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="s-result-sort-select")
    WebElement results;
    @FindBy(xpath = "$secondHigest")
    WebElement secondElement;
    @FindBy(xpath = "//h1[text()=' About this item ']")
    WebElement aboutThisItem;

    public void selectFilterBy(){
        TestUtil.SelectfromDropDown(results,"VisibleText");
        //results.click();
    }
    public void clickOnSecondHighest(){
        price = driver.findElements(By.xpath("//span[@class=\"a-price-whole\"]"));
        String[] val = new String[price.size()];
        int i=0;
       for(WebElement individualPrice : price){
           val[i]=(individualPrice.getText());
           i++;
           System.out.println("value "+individualPrice.getText());
       }
        Arrays.sort(val);
        secondHigest= val[val.length-2];
        System.out.println("Second higest is "+secondHigest);

        secondElement.click();
        TestUtil.switchTab(driver);
    }
    public String getTextOfAboutThisItem(){
        return  aboutThisItem.getText();
    }
}
