package locators;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class Demo{

    public void DemoMethod() {
        Playwright pw = Playwright.create();
        Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser.newContext();
        Page page = browserContext.newPage();
        page.navigate("https://practice.expandtesting.com/locators");
        //page.getByRole(AriaRole.LINK,new Page.GetByRoleOptions().setName("Contact")).click();
        String x=page.locator("text=Latest news and updates").locator("..").locator("text=\uD83D\uDCDD getByText" + "text=\uD83D\uDD25 Hot Deal: Buy 1 Get 1 Free").textContent();
        System.out.println(x);

    }

}