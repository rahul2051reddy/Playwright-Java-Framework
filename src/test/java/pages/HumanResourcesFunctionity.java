package pages;

import com.microsoft.playwright.Page;
import locators.HumanResourcesLocators;

public class HumanResourcesFunctionity {

    Page page;
    public HumanResourcesFunctionity(Page page){
        this.page=page;
    }

    public void navigateBack(){
        page.goBack();
        page.waitForLoadState();
    }

    public void clickIndiaTransformation() {
        page.click(HumanResourcesLocators.indiaTransformationLocator);
        page.waitForLoadState();
    }

    public Page clickWorkOne() {
        Page newPage=page.waitForPopup(()->{
        page.click(HumanResourcesLocators.workOne);});
        page.waitForLoadState();
        return newPage;
    }


    public Page clickSuccessFactors() {
        Page newPage = page.waitForPopup(() -> {
            page.click(HumanResourcesLocators.successFactorsLocator);
        });
        page.waitForLoadState();
        return newPage;

    }

    public void clickIndiaContinuousAssimilationProgram() {

            page.click(HumanResourcesLocators.indiaContinuousAssimilationProgramLocator);

        page.waitForLoadState();

    }

    public Page clickWorkAbroad() {
        Page newPage = page.waitForPopup(() -> {
            page.click(HumanResourcesLocators.workAbroadLocator);
        });
        page.waitForLoadState();
        return newPage;

    }

    public Page clickMediAssist() {
        Page newPage = page.waitForPopup(() -> {
            page.click(HumanResourcesLocators.mediAssistLocator);
        });
        page.waitForLoadState();
        return newPage;

    }

    public void clickEmployeeAssistanceProgram() {
        page.click(HumanResourcesLocators.employeeAssistanceProgramLocator);
        page.waitForLoadState();
    }

    public Page clickGTDPlatform() {
        Page newPage = page.waitForPopup(() -> {
            page.click(HumanResourcesLocators.gTDPlatformLocator);
        });
        page.waitForLoadState();
        return newPage;

    }

     public Page clickCommunityConnect() {
         Page newPage = page.waitForPopup(() -> {
        page.click(HumanResourcesLocators.communityConnect);});
        page.waitForLoadState();
        return newPage;
    }


}