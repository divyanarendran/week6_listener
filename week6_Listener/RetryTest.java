package week6_Listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer {

	int count=0;
	int maxCount=3;
	public boolean retry(ITestResult result) {
		if(!result.isSuccess() && count < maxCount)
		{
			count++;
			return true;
		}
		return false;
	}

}
