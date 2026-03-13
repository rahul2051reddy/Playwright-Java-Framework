package utils;

import base.BaseTest;
import com.microsoft.playwright.Page;

import java.nio.file.Paths;

public class ScreenshotUtil extends BaseTest {


    public  String captureScreenshot(String testName) {

        String path = "test-output/screenshots/" + testName + ".png";

        page.screenshot(new Page.ScreenshotOptions()
                .setPath(Paths.get(path)));

        return path;
    }
}