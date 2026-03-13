package pages;

import com.microsoft.playwright.Page;

public class MediAssistPage {
    Page page;
    public MediAssistPage(Page page){
        this.page=page; }

    public void clickAccept(){
        page.click("text=Accept");
    }

}