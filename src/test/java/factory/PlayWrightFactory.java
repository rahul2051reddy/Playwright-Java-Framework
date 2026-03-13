package factory;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import utils.ConfigReader;

import java.nio.file.Paths;

public class PlayWrightFactory {
    Playwright playwright;
    Browser browser;
    BrowserContext browserContext;
    Page page;



    public Page initBrowser(String browserType,ConfigReader configReader) {
        //configReader=new ConfigReader();
        //String browserType=configReader.getBrowser();
        boolean headless=Boolean.parseBoolean(configReader.getHeadless());

        playwright=Playwright.create();

        switch(browserType) {
            case "chrome":
                browserContext=playwright.chromium().launchPersistentContext(Paths.get("C:\\PlayWrightProfile"),new BrowserType.LaunchPersistentContextOptions().setChannel("chrome").setHeadless(headless));
                break;

            case "firefox":
                browser=playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(headless));
                break;

        }

        //browserContext=browser.newContext();
        if(browserContext.pages().size()>0){
            page=browserContext.pages().get(0);
        }else{
        page=browserContext.newPage();}
        return page;

    }

    public void tearDown() {
        if(browserContext!=null){
        browserContext.close();}
    }


}
