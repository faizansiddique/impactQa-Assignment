package utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import crossBrowserTesting.CrossBrowserTesting;

public class TestUtil extends CrossBrowserTesting {

	public void captureScreenShots(ITestResult result, String status) {

		String destDir = "";
		String passfailMethod = result.getMethod().getRealClass().getSimpleName() + " . "
				+ result.getMethod().getMethodName();

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyy_hh_mm_ssaa");
		
		if(status.equalsIgnoreCase("fail")){
			destDir = "screenshots/Failures";
		}else if(status.equalsIgnoreCase("pass")){
			destDir = "screenshots/Passed";
		}
		
		new File(destDir).mkdir();
		
		String destFile = passfailMethod+" - "+ dateFormat.format(new Date())+".png";
		
		try {
			FileUtils.copyFile(srcFile, new File(destDir+"/"+destFile));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
