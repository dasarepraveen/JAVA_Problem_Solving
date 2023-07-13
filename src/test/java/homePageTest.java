import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.FilterElemets;
import pages.FilteredResults;
import pages.HomePageElements;
import util.TestUtil;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class homePageTest {
    public BasePage basePage;
    public WebDriver driver;
    public Properties prop;
    public HomePageElements homePageElements;
    public FilterElemets filterElemets;
    public FilteredResults filteredResults;

    @BeforeEach
    public void SetUp(){
        basePage = new BasePage();
        driver = basePage.init();
        prop = basePage.init_properties();
        homePageElements = new HomePageElements(driver);
        filterElemets = new FilterElemets(driver);
        filteredResults = new FilteredResults(driver);
        driver.get("https://www.amazon.in");
    }
    @Test
    public void voidLaunchBasePage(){
        homePageElements.clickHamburgerMenu();
        filterElemets.clickTvAppliences();
        filterElemets.clickTelivision();
        filterElemets.filterbyBrand();
        filteredResults.selectFilterBy();
        filteredResults.clickOnSecondHighest();
        assertEquals("About this item", filteredResults.getTextOfAboutThisItem());
    }
    @AfterEach
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
