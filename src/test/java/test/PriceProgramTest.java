package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.LoggerUtil;
import listeners.ShotListener;
import pages.chanpin.CPGLPage;
import pages.chanpin.XZJGFAPage;
import pages.crmrk.CrmHomePage;
import pages.crmrk.CrmLoginPage;

public class PriceProgramTest {
	
	CrmLoginPage loginPage = null;
	CrmHomePage homePage = null;
	XZJGFAPage pricePage=null;
	
	@BeforeClass
	public void init() throws InterruptedException {
		loginPage=new CrmLoginPage();
		ShotListener.driver = loginPage.driver;
		homePage = new CrmHomePage();
		pricePage=new XZJGFAPage();
		//登入系统
		loginPage.login();
	}
	@Test(description="新增价格方案",priority=1,enabled=true)
	public void addPriceProgram() throws InterruptedException {
		LoggerUtil.info("新增价格方案脚本开始");
		homePage.toCPGL();
		homePage.toChoosePriceProgram();
		pricePage.selectOptions();
		pricePage.addPriceProgram();
	}
	
	@Test(description="编辑价格方案",priority=2,enabled=true)
	public void updatePriceProgram() throws InterruptedException {
		LoggerUtil.info("编辑价格方案脚本开始");
		homePage.toCPGL();
		homePage.toChoosePriceProgram();
		pricePage.selectOptions();
		pricePage.updateProgram();
	}
	@Test(description="删除价格方案",priority=3,enabled=true)
	public void deletePriceProgram() throws InterruptedException {
		LoggerUtil.info("删除价格方案脚本开始");
		homePage.toCPGL();
		homePage.toChoosePriceProgram();
		pricePage.selectOptions();
		pricePage.deleteProgram();
	}
	@AfterClass
	public void destroy() {
		loginPage.quit();
	}
}
