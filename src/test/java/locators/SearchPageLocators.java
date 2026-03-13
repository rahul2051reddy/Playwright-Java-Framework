package locators;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class SearchPageLocators {
    Page page;
    public SearchPageLocators(Page page){
        this.page=page;}
    public static final String searchResults=".card.mb-3.result";
    //public static final String sortByDate="#sort[dt_updateddate]";
    //public  final Locator sortByDateLocator=page.getByText("Date");
    public static final String sortSearchButton=".btn.btn-secondary";
    public static final String sortByCheckbox="[for='Capgemini_Object_Type_Talent[page]']";
    public static final String checkBoxIn="[for='Capgemini_Country_Talent[in]']";


}