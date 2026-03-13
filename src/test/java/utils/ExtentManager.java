package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    static ExtentReports extent;

    public static ExtentReports getExtentReport() {

        if (extent == null) {

            ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");

            spark.config().setReportName("Playwright Automation Report");
            spark.config().setDocumentTitle("Test Execution");

            extent = new ExtentReports();
            extent.attachReporter(spark);
        }

        return extent;
    }
}