package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.TestUtil;

public class FilterElemets extends BasePage{
    public FilterElemets(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//div[text()='TV, Appliances, Electronics']")
    WebElement TV_Appliences;
    @FindBy(xpath = "//a[text()='Televisions']")
    WebElement Telivision;
    @FindBy(xpath = "//span[text()='Samsung']")
    WebElement Samsung;

    public void clickTvAppliences(){
        TestUtil.Scroll(TV_Appliences,driver);
        TV_Appliences.click();
    }
    public void clickTelivision(){
        Telivision.click();
    }

    public void filterbyBrand(){
        TestUtil.Scroll(Samsung,driver);
        Samsung.click();
    }



}

