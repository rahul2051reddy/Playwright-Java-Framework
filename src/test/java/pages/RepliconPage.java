package pages;

import com.microsoft.playwright.Page;
import locators.RepliconPageLocators;

public class RepliconPage {
    Page page;

    public RepliconPage(Page page){
        this.page=page;
    }

    public void clickTimesheets(){
        page.getByText(RepliconPageLocators.timeSheets).click();
    }

public String getMarch_8to19_status(){
    return page.locator(RepliconPageLocators.validateMarch_8to14_Timesheet).textContent();
}

public String getMarch_1to7_status(){
    return page.locator(RepliconPageLocators.validateMarch_1to7_Timesheet).textContent();}



}