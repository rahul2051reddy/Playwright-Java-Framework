package tests;

import base.BaseTest;
import com.microsoft.playwright.Page;
import locators.SuccessFactorsLocators;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.ResultsPage;
import pages.SuccessFactorsPage;

public class SuccessFactorsValidationTest extends BaseTest {

    SuccessFactorsPage successFactorsPage;
    SuccessFactorsLocators successFactorsLocators;

    @BeforeClass
    public void setupPages() {
        successFactorsPage = new SuccessFactorsPage(page);
    }
    @Test
    public void validateSuccessFactorsPage() {
        Page newPage=successFactorsPage.clickSuccessFactorsLink();
        //successFactorsLocators=new SuccessFactorsLocators(newPage);
        SuccessFactorsPage newsuccessFactorsPage=new SuccessFactorsPage(newPage);

        //newsuccessFactorsPage.clickhomeTab();
       // newsuccessFactorsPage.clickMyEmployeeFiles();
        newPage.waitForLoadState();
        newsuccessFactorsPage.clickPersonalInformationDropdown();
        String DOB=newsuccessFactorsPage.clickBiographicalInformation();
       Assert.assertEquals(DOB,"05 May 2003");
        newsuccessFactorsPage.clickPersonalInformationDropdown();

        newsuccessFactorsPage.clickIDInformation();





    }

//      page1.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("Biographical Information")).click();
//    page1.locator("[id=\"__xmlview0--objectPage-anchBar-__section1-__xmlview0--objectPage-1-anchor-expandIcon\"]").getByTitle("More").click();
//    page1.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("ID Information")).click();
//    page1.locator("[id=\"__xmlview0--objectPage-anchBar-__section1-__xmlview0--objectPage-1-anchor-expandIcon\"]").getByTitle("More").click();
//    page1.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("Contact Information")).click();
//    page1.locator("[id=\"__xmlview0--objectPage-anchBar-__section1-__xmlview0--objectPage-1-anchor-expandIcon\"]").getByTitle("More").click();
//    page1.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("Address Information")).click();
}