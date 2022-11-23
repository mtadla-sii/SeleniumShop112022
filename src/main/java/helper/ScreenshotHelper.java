package helper;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;


public class ScreenshotHelper {
    public static void takeScreenshot(WebDriver driver, String testName) {
        File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File file = new File(testName + DateHelper.getDate()+".png");
        try {
            FileUtils.copyFile(scr, file);
            System.out.println("Saving screenshot at: " + file.getAbsolutePath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
