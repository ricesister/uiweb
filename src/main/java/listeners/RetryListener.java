package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import common.LoggerUtil;

/**
 * 
 * @author fs
 * @version 1.0.0
 * @description 失败重跑监听
 * @date 2018年8月22日 上午9:45:33
 */
public class RetryListener implements IRetryAnalyzer{
	
	private int retrycount = 0;
	private int maxRetryCount = 2;

	public boolean retry(ITestResult result) {
		if(retrycount < maxRetryCount) {
			LoggerUtil.info(">>>>用例失败，开始重试第"+(retrycount+1)+"次");
			retrycount++;
			return true;
		}
		return false;
	}

}
