package tests;

import base.BaseTest;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;
import locators.HumanResourcesLocators;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.HumanResourcesFunctionity;
import pages.MediAssistPage;

public class VerifyHumanResoucesLinksTest extends BaseTest {
    HumanResourcesFunctionity humanResourcesFunctionity;
    @BeforeClass
    public void setupPages() {
       humanResourcesFunctionity=new HumanResourcesFunctionity(page);
    }



    @Test(priority = 1)
    public void clickIndiaTransformation() {
        humanResourcesFunctionity.clickIndiaTransformation();
        //String title=page.title();
        //Assert.assertEquals(title,"Human Resources - Employee Services and Tools");
        humanResourcesFunctionity.navigateBack();
    }
    @Test(priority = 2)
    public void clickWorkOne() {
        Page newPage=humanResourcesFunctionity.clickWorkOne();
        newPage.waitForLoadState(LoadState.NETWORKIDLE);
        String title=newPage.title();
        Assert.assertEquals(title,"Home - Home");
        newPage.close();

    }

    @Test(priority = 3)
    public void clickSuccessFactors() {
        Page newPage=humanResourcesFunctionity.clickSuccessFactors();
        newPage.waitForLoadState(LoadState.NETWORKIDLE);
        String title=newPage.title();
        Assert.assertEquals(title,"SuccessFactors: Home");
        newPage.close();

    }

    @Test(priority = 4)
    public void clickIndiaContinuousAssimilationProgram() {
        humanResourcesFunctionity.clickIndiaContinuousAssimilationProgram();
       // String title=page.title();
        //Assert.assertEquals(title,"India Continuous Assimilation Program - Employee Services and Tools");
        humanResourcesFunctionity.navigateBack();
    }

    @Test(priority = 5)
    public void clickWorkAbroad() {
        Page newPage = humanResourcesFunctionity.clickWorkAbroad();
        newPage.waitForLoadState(LoadState.NETWORKIDLE);

        Assert.assertEquals(newPage.title(), "Immidart Technologies LLP");
        newPage.close();

    }

    @Test(priority = 6)
    public void clickMediAssist() {
        Page newPage = humanResourcesFunctionity.clickMediAssist();
        newPage.waitForLoadState(LoadState.NETWORKIDLE);
        MediAssistPage mediAssistPage=new MediAssistPage(newPage);
        mediAssistPage.clickAccept();
        newPage.waitForLoadState();
        Assert.assertEquals(newPage.title(), "Maven");
        newPage.close();

    }

    @Test(priority = 7)
    public void clickEmployeeAssistanceProgram() {
        humanResourcesFunctionity.clickEmployeeAssistanceProgram();
        humanResourcesFunctionity.navigateBack();

        //Assert.assertEquals(page.title(),"Employee Assistance Program - Employee Services and Tools");
    }

    @Test(priority = 8)
    public void clickGTDPlatform() {
        Page newPage = humanResourcesFunctionity.clickGTDPlatform();
//        newPage.waitForLoadState(LoadState.NETWORKIDLE);
//        Assert.assertEquals(newPage.title(), "GTD Platform - Employee Services and Tools");
        newPage.close();}


    @Test(priority = 9)
    public void clickCommunityConnect() {
        Page newPage = humanResourcesFunctionity.clickCommunityConnect();
        newPage.waitForLoadState(LoadState.NETWORKIDLE);
        Assert.assertEquals(newPage.title(), "CommunityConnect - Employee Services and Tools");
        newPage.close();
    }


}