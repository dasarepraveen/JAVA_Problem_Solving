package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.TestUtil;

public class HomePageElements extends BasePage{
    WebDriver driver;
    public HomePageElements(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="nav-hamburger-menu")
    WebElement hambergerMenu;

    public void clickHamburgerMenu(){
        hambergerMenu.click();
    }
}
