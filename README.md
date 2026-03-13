Playwright Java + TestNG + ExtentReports Framework

This project provides a minimal Playwright-based test framework using TestNG and ExtentReports.

Prerequisites
- Java JDK 11+ (project is currently set to Java 24 in pom)
- Maven

One-time browser install (Playwright):

mvn com.microsoft.playwright:playwright-maven-plugin:1.40.0:install

Build (compile without tests):

mvn -DskipTests=true compile

Run tests (headless by default):

mvn test

Run tests non-headless (useful for debugging):

mvn test -Dheadless=false

Reports & screenshots
- HTML report: target/extent-report/ExtentReport.html
- Screenshots: target/screenshots/

Notes
- The framework uses ThreadLocal to manage Playwright instances per thread.
- The TestNG listener attaches screenshots on failures and writes an Extent report at the end of the run.

If you need parallel execution or additional browser options, we can add configuration and TestNG suite updates.
