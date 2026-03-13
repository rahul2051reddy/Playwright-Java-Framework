package tests;

import base.BaseTest;
import locators.homePageLocators;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Homepage;

public class DropdownTest extends BaseTest {
    Homepage homepage;
    @BeforeClass
    public void setupPages() {
        homepage = new Homepage(page);
    }

    @Test(priority = 1)
    public void ClickSearchIcon() {

        homepage.clickSearchIcon();
    }

    @Test(priority = 2)
    public void SelectCountryFromDropdown() {
        homepage.selectCountry("Finland");
        String selectedText=page.locator(homePageLocators.countryDropdown).inputValue();
        Assert.assertEquals(selectedText,"fi");
    }

    @Test(priority = 3)
    public void verifyDocumentTypeDropdown() {

        homepage.selectDocumentType("Pages");

    }
    @Test(priority = 4)
    public void verifySortOptionDropdown() {

        homepage.selectSortOption("by date");
           }


}