package tests;

import base.BaseTest;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;
import locators.SearchPageLocators;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;
public class SearchTest extends BaseTest {
    Homepage homepage;
    ResultsPage resultsPage;

    @BeforeClass
    public void setupPages() {
        homepage = new Homepage(page);
        resultsPage = new ResultsPage(page);
    }

    @Test(priority = 1)
    public void clickSearch() {


        homepage.clickSearchIcon();

    }

    @Test(priority = 2)
    public void EnterCountry(){
        homepage.enterSearchText("replicon");
    }

    @Test(priority = 3)
    public void clickSearchButton() {
        homepage.clickSearchButton();
        int count=resultsPage.getSearchResultsCount();
        Assert.assertEquals(count, 9);
    }


    @Test(priority = 4)
    public void ClickRadioButton() {

        resultsPage.sortByDate();

    }

    @Test(priority = 5)
    public void ClickSortSearchButton() {
        resultsPage.clickSortSearchButton();
    }

    @Test(priority = 6)
    public void searchByCheckbox() {

        resultsPage.clickSortByCheckbox();
        resultsPage.clickSortSearchButton();

    }


   @Test(priority = 7)
    public void unCheckBoxIn() {

        resultsPage.clickCheckBoxIn();
        Assert.assertFalse(page.locator(SearchPageLocators.checkBoxIn).isChecked());
        //resultsPage.clickSortSearchButton();
        page.pause();
    }

    @Test
    public void Demo() {
        page.navigate("https://talent.capgemini.com/in/");
        Page newPage=page.waitForPopup(()->{
            page.locator("[title='Replicon']").click();
        });
        page.waitForLoadState(LoadState.NETWORKIDLE);
        newPage.getByText("All Timesheets").click();

        System.out.println(newPage.locator("#grid_wrapperrowheader1 + [role='gridcell']").textContent());



    }
    }
