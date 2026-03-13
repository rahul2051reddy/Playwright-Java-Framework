package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.microsoft.playwright.Page;

import factory.PlayWrightFactory;
import utils.ConfigReader;

public class BaseTest {

    protected PlayWrightFactory playWrightFactory;
    protected Page page;
    ConfigReader configReader;
    @BeforeClass
    public void setup() {
        configReader=new ConfigReader();
        String browser= configReader.getBrowser();
        playWrightFactory=new PlayWrightFactory();
        page=playWrightFactory.initBrowser(browser,configReader);
        page.navigate(configReader.getUrl());

    }

    @AfterClass
    public void tearDown(){

        playWrightFactory.tearDown();
    }




}