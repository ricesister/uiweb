package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.LoggerUtil;
import listeners.ShotListener;
import pages.chanpin.CPGLPage;
import pages.crmrk.CrmHomePage;
import pages.crmrk.CrmLoginPage;

public class ProductTest{
	
	CrmLoginPage loginPage = null;
	CrmHomePage homePage = null;
	CPGLPage cpglPage=null;
	@BeforeClass
	public void init() throws InterruptedException {
		
		loginPage=new CrmLoginPage();
		ShotListener.driver = loginPage.driver;
		homePage = new CrmHomePage();
		cpglPage = new CPGLPage();
		//登入系统
		loginPage.login();
	}
	@Test(description="新增产品脚本",priority=1)
	public void testAddProduct() throws InterruptedException {
		LoggerUtil.info("新增产品脚本开始");
		homePage.toCPGL();
		homePage.toSubCPGL();
		cpglPage.selectOptions();
		cpglPage.addProduct();
	}
	@Test(description="修改产品脚本",priority=2,enabled=true)
	public void testUpdateProduct() throws InterruptedException {
		LoggerUtil.info("修改产品脚本开始");
		homePage.toCPGL();
		homePage.toSubCPGL();
		cpglPage.selectOptions();
		cpglPage.updateProduct();
	}
	@Test(description="删除产品脚本",priority=3,enabled=true)
	public void testDelectProduct() throws InterruptedException {
		LoggerUtil.info("删除产品脚本开始");
		homePage.toCPGL();
		homePage.toSubCPGL();
		cpglPage.selectOptions();
		cpglPage.deleteProduct();
	}
	@AfterClass
	public void destory() {
		loginPage.quit();
	}
}
