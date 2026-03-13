package locators;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class homePageLocators
{
    Page page;
    public homePageLocators(Page page){

        this.page=page;
    }
    public static final String searchIcon="#search-toggle-btn-icon";
    public static final String searchText="#alt_navigation_input";
    public static final String searchButton="#search_button";
    public static final String searchBox="#small-searchterms";
    //public static final String searchButton="button[type='submit']";
    public static final String countryDropdown="#intranet";
    public static final String documentTypeDropdown="#type";
    public static final String sortDropdown="#sort";
    public static final String repliconLocator="[title='Replicon']";
    //public  final Locator globalLocator=  page.getByRole(AriaRole.TAB,new Page.GetByRoleOptions().setName("Global links"));
    //public  final Locator items= page.getByText("Group Essentials").locator("..").locator("li");
    //public  final Locator annaulReportLocator=page.getByText("Annual Report 2024");
}