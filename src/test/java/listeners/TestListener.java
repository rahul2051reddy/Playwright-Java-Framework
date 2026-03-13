package listeners;

import com.aventstack.extentreports.*;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ExtentManager;
import utils.ScreenshotUtil;
import base.BaseTest;

public class TestListener extends BaseTest implements ITestListener {

    ExtentReports extent = ExtentManager.getExtentReport();
    ExtentTest test;
    ScreenshotUtil screenshotUtil=new ScreenshotUtil();

    public void onTestStart(ITestResult result) {

        test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {

        test.pass("Test Passed");
    }

    public void onTestFailure(ITestResult result) {

        test.fail(result.getThrowable());

        String screenshotPath =
                screenshotUtil.captureScreenshot(
                        result.getMethod().getMethodName());

        test.addScreenCaptureFromPath(screenshotPath);
    }

    public void onFinish(org.testng.ITestContext context) {

        extent.flush();
    }
}