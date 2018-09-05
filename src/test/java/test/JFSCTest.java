package test;

import org.testng.annotations.Test;

import listeners.ShotListener;
import pages.tuangou.TGHomePage;
import pages.tuangou.TGLoginPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class JFSCTest {
	
	private TGLoginPage tgLoginPage = null;
	private TGHomePage tgHomePage = null;
	@BeforeClass
	public void beforeClass() {
		tgLoginPage = new TGLoginPage();
		tgHomePage = new TGHomePage();
		ShotListener.driver = tgLoginPage.driver;
		try {
			tgLoginPage.tgLogin();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test(description="积分商城下单")
	public void testOrder() throws InterruptedException {
		tgHomePage.toJFSC();
		tgHomePage.buyOrder();
	}
	@AfterClass
	public void afterClass() {
		tgLoginPage.quit();
		
	}
	
	

}
