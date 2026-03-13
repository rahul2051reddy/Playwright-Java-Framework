package pages;

import com.microsoft.playwright.Page;
import locators.homePageLocators;

public class Homepage {
    private final Page page;
    public Homepage(Page page){
        this.page=page;
    }
    public void clickSearchIcon() {
        page.click(homePageLocators.searchIcon);
    }
    public void enterSearchText(String searchText) {
        page.fill(homePageLocators.searchText, searchText);
    }
    public void clickSearchButton() {
        page.click(homePageLocators.searchButton);  }

    public void selectCountry(String country) {
        page.selectOption(homePageLocators.countryDropdown, country);
    }

    public void selectDocumentType(String documentType) {
        page.selectOption(homePageLocators.documentTypeDropdown, documentType);
    }

    public void selectSortOption(String sortOption) {
        page.selectOption(homePageLocators.sortDropdown, sortOption);
    }

    public Page clickRepliconLink() {

       Page newPage= page.waitForPopup(()->{
           page.click(homePageLocators.repliconLocator);});
        page.waitForLoadState();

       return newPage;

    }


}