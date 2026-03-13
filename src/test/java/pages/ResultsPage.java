package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import locators.SearchPageLocators;

public class ResultsPage {
SearchPageLocators searchPageLocator;
    private final Page page;
    public ResultsPage(Page page){
        this.page=page;
        searchPageLocator=new SearchPageLocators(this.page);
    }

    public int getSearchResultsCount() {
        Locator results= page.locator(SearchPageLocators.searchResults);
        results.first().waitFor();
        return results.count();
    }

    public void sortByDate() {
        page.getByText("Date").first().click();
    }

    public void clickSortByCheckbox() {
        page.locator(SearchPageLocators.sortByCheckbox).check();
    }

    public void clickSortSearchButton() {
        page.locator(SearchPageLocators.sortSearchButton).first().click();
    }

  public void clickCheckBoxIn() {
        page.locator(SearchPageLocators.checkBoxIn).click();
    }

}
