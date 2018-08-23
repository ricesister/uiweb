package test;

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
		System.out.println(loginPage.toString());
		ShotListener.driver = loginPage.driver;
		homePage = new CrmHomePage();
		cpglPage = new CPGLPage();
		//登入系统
		loginPage.login();
	}
	@Test
	public void testAddProduct() throws InterruptedException {
		LoggerUtil.info("新增产品脚本开始");
		homePage.toCPGL();
		homePage.toSubCPGL();
		cpglPage.selectOptions();
		cpglPage.addProduct();
	}
	@AfterTest
	public void destory() {
		loginPage.quit();
	}
}
