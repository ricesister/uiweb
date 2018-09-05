package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.LoggerUtil;
import listeners.ShotListener;
import pages.tuangou.TGHomePage;
import pages.tuangou.TGLoginPage;

/**
 * 
 * @description 团购平台测试脚本：用于接口测试订单管理有关订单操作的数据准备
 * @author fs
 * @2018年8月16日
 *
 */
public class TGTest extends BaseTest{
	private TGLoginPage tgLoginPage = new TGLoginPage();
	private TGHomePage tgHomePage = new TGHomePage();
	
	
	@BeforeClass
	public void init() {
		ShotListener.driver = tgLoginPage.driver;
		try {
			tgLoginPage.tgLogin();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test(description="团购下单",invocationCount=2)
	public void tuangou_xiadan() {
		begin();
		LoggerUtil.info("团购下单脚本开始");
		try {
			tgHomePage.toDDAgain();
			tgHomePage.dd_again();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}end();
	}
	
	@AfterClass
	public void destory() {
		tgHomePage.quit();
	}

}
