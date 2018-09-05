package test;

import org.testng.annotations.Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Ignore;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import common.AssertUtil;
import common.LoggerUtil;
import listeners.ShotListener;
import pages.BasePage;
import pages.crmrk.CrmHomePage;
import pages.crmrk.CrmLoginPage;
import pages.lunbo.APPPage;
import pages.lunbo.JFSCPage;
import pages.lunbo.JFSCRKPage;
import pages.lunbo.JFTGRKPage;
import pages.lunbo.SYLBPage;
import pages.lunbo.ZBTGPage;

/**
 * 
 * @author fs
 * @version 1.0.0
 * @description 广告管理test
 * @date 2018年8月29日 下午4:42:46
 */
public class GGGLTest extends BaseTest{
	CrmLoginPage loginPage = new CrmLoginPage();
	/**
	 * 轮播图页面初始化
	 */
	SYLBPage sylbPage = new SYLBPage();
	ZBTGPage zbtgPage = new ZBTGPage();;
	JFSCPage jfscPage = new JFSCPage();
	JFTGRKPage tgrkPage = new JFTGRKPage();
	JFSCRKPage jfscrkPage = new JFSCRKPage();
	APPPage appPage = new APPPage();
	
	@BeforeClass
	public void init() throws InterruptedException {
		ShotListener.driver = loginPage.driver;
		//登录系统
		loginPage.login();
	}
	
	@Test(description="添加首页轮播图",priority=0,invocationCount=1)
	public void addSYLB() {
		begin();
		LoggerUtil.info("添加首页轮播图脚本开始");
		try {
			
			sylbPage.toGGGL();
			sylbPage.addSYLB();
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		end();
	}
	
	@Test(description="添加纸板团购轮播图",priority=1,enabled=true,invocationCount=2)
	public void addZBTG() {
		begin();
		LoggerUtil.info("添加纸板团购轮播图脚本开始");
		try {
			zbtgPage.toGGGL();
			zbtgPage.addZBTG();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		end();
	}
	
	
	@Test(description="添加积分商城轮播图",priority=2,enabled=true,invocationCount=2)
	public void addJFSC() {
		begin();
		LoggerUtil.info("添加积分商城轮播图脚本开始");
		try {
			jfscPage.toGGGL();
			jfscPage.addJFSC();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		end();
	}
	
	
	@Test(description="编辑纸板团购入口轮播图",priority=3,enabled=true)
	public void addZBRK() {
		begin();
		LoggerUtil.info("编辑纸板团购入口轮播图脚本开始");
		try {
			tgrkPage.toGGGL();
			tgrkPage.addJFRK();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}end();
	}
	
	
	@Test(description="编辑积分商城入口轮播图",priority=4,enabled=true)
	public void addJFRK() {
		begin();
		try {
			jfscrkPage.toGGGL();
			jfscrkPage.addJFRK();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test(description="编辑APP首页轮播图",priority=5,enabled=true)
	public void addApp() {
		begin();
		try {
			appPage.toGGGL();
			appPage.editAPP();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}end();
	}
	
	
	
	@AfterTest
	public void destory() {
		loginPage.quit();
	}

}
