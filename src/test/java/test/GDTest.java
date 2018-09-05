package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import listeners.ShotListener;
import pages.crmrk.CrmLoginPage;
import yunying.HDGLPage;

/**
 * 
 * @description 活动管理单元测试
 * @author fs
 * @2018年8月17日
 *
 */
public class GDTest {
	CrmLoginPage loginPage = new CrmLoginPage();
	HDGLPage hdglPage = new HDGLPage();
	
	@BeforeClass
	public void init() throws InterruptedException {
		ShotListener.driver = loginPage.driver;
		//登录系统
		loginPage.login();
	}
	
	@Test
	public void addActivity() {
		try {
			hdglPage.toHDZX();
			hdglPage.addActivity();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	@AfterClass
	public void quit() {
		hdglPage.quit();
	}

}
