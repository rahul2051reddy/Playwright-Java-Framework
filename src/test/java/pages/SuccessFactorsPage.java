package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import locators.SuccessFactorsLocators;

public class SuccessFactorsPage {

    Page page;
    public SuccessFactorsPage(Page page){
        this.page=page;
    }

    public Page clickSuccessFactorsLink(){
        Page newPage = page.waitForPopup(() -> {
            page.click(SuccessFactorsLocators.successfactorLink);
        });
        page.waitForLoadState();
        return newPage;
    }

    public void clickhomeTab(){
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Home")).click();
    }

    public void clickMyEmployeeFiles(){
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("My Employee File")).click();
    }
    public void clickPersonalInformationDropdown(){
       // page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Personal Information")).click();
        page.locator(SuccessFactorsLocators.personalDetailsDropDownLocator).getByTitle("More").click();
        //page1.locator("[id=\"__xmlview0--objectPage-anchBar-__section1-__xmlview0--objectPage-1-anchor-expandIcon\"]")
    }
    public String clickBiographicalInformation(){
        page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName(SuccessFactorsLocators.biographicalInformationLocator)).click();
        //page.locator("#__label4").waitFor();
        return page.locator("span.valuePattern").nth(19).textContent();
    }

    public void clickIDInformation(){
           page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName(SuccessFactorsLocators.iDInformationLocator)).click();
    }

    public void clickContactInformation(){
        page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName(SuccessFactorsLocators.contactInformationLocator)).click();
    }
}