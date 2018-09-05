package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import listeners.ShotListener;
import pages.crmrk.CrmLoginPage;
import pages.xiaoshou.XXSJFPage;

/**
 * 
 * @author fs
 * @version 1.0.0
 * @description 销售管理相关单元测试类
 * @date 2018年8月29日 下午4:17:04
 */
public class SXTest extends BaseTest{
	CrmLoginPage loginPage = new CrmLoginPage();
	XXSJFPage xxsjfPage = new XXSJFPage();
	@BeforeClass
	public void init() throws InterruptedException {
		ShotListener.driver = loginPage.driver;
		loginPage.login();
	}
	
	/**
	 * 
	 * @description：上传积分模板
	 * @param arr
	 * @return
	 */
	@Test(description="上传线下送积分模板",priority=0,enabled=false)
	public void sendJFFile() {
		try {
			xxsjfPage.toXXSJF();
			xxsjfPage.sendFile();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * 
	 * @description：审核积分
	 * @param arr
	 * @return
	 */
	@Test(description="审核线下送积分模板",priority=1)
	public void auditFile() {
		try {
			xxsjfPage.toXXSJF();
			xxsjfPage.auditFile();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	@AfterClass
	public void destory() {
		xxsjfPage.quit();
	}
	

}
