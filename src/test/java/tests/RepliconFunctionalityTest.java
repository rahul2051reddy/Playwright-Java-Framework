package tests;

import base.BaseTest;
import com.microsoft.playwright.Page;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.RepliconPage;

public class RepliconFunctionalityTest extends BaseTest {
    Homepage homepage;
    Page newPage;
    RepliconPage repliconPage;
    @Test(priority = 1)
    public void clickRepliconLink(){
        homepage=new Homepage(page);
        newPage=homepage.clickRepliconLink();

    }

    @Test(priority = 2)
    public void clickTimesheets(){
            repliconPage=new RepliconPage(newPage);
        repliconPage.clickTimesheets();
    }

    @Test(priority = 3)
    public void verfiyMarch_8to14Timesheet() {
       // repliconPage=new RepliconPage(newPage);
       String status=repliconPage.getMarch_8to19_status();
       System.out.println(status);

     Assert.assertEquals(status,"Waiting for Approval");}


    @Test(priority = 4)
    public void verfiyMarch_1to7Timesheet() {

        String status=repliconPage.getMarch_1to7_status();
        System.out.println(status);

        Assert.assertEquals(status,"Waiting for Approval");}




//     page.navigate("https://talent.capgemini.com/in/");
//    Page page1 = page.waitForPopup(() -> {
//        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("SuccessFactors")).click();
//    });
//    page1.navigate("https://performancemanager5.successfactors.eu/sf/start?_s.crb=0%252bAXhqO2spCv9hdO2CzJhEu8L3%252bjWt0sBDaoicX9A7o%253d");
//    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Home")).click();
//    page1.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("My Employee File")).click();
//    page1.navigate("https://performancemanager5.successfactors.eu/sf/liveprofile?bplte_company=capgemitecP3&_s.crb=0%252bAXhqO2spCv9hdO2CzJhEu8L3%252bjWt0sBDaoicX9A7o%253d");
//    page1.locator("[id=\"__xmlview0--objectPage-anchBar-__section1-__xmlview0--objectPage-1-anchor-expandIcon\"]").getByTitle("More").click();
//    page1.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("Biographical Information")).click();
//    page1.locator("[id=\"__xmlview0--objectPage-anchBar-__section1-__xmlview0--objectPage-2-anchor-expandIcon\"]").getByTitle("More").click();
//    page1.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("Job Information")).click();
//    page1.locator("[id=\"__xmlview0--objectPage-anchBar-__section1-__xmlview0--objectPage-3-anchor-expandIcon\"]").getByTitle("More").click();
//    page1.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("One Time Payments")).click();
//    page1.locator("[id=\"__xmlview0--objectPage-anchBar-__section1-__xmlview0--objectPage-5-anchor-expandIcon\"]").getByTitle("More").click();
//    page1.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("Work Experience Within Company")).click();


}