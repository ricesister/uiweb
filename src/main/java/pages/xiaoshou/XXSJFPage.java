package pages.xiaoshou;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import common.AssertUtil;
import common.LoggerUtil;
import pages.BasePage;
import pages.crmrk.CrmHomePage;

/**
 * 
 * @author fs
 * @version 1.0.0
 * @description 销售管理-线下送积分page
 * @date 2018年8月29日 下午3:47:51
 */
public class XXSJFPage extends CrmHomePage{
	
	/**
	 * 数据准备:excel中准备的
	 */
	private String audit_account = "18868196139";
	
	/**
	 * 导入按钮
	 */
	private String input_button = "//*[@id=\"uploadFile\"]";
	private String error_alert = "//*[@id=\"lineSendIntergral-warp\"]/div[3]";
	
	/**
	 * 审核按钮
	 */
	private String sh_div = "//*[@id=\"lineSendIntergral-warp\"]/div[1]/div/div[2]/ul[2]/li[3]/a";
	private String oper = "//*[@id=\"intergralAudit-warp\"]/div[1]/div/div[2]/ul/li[2]/div/div[1]/input";
	private String oper_choice = "/html/body/div[3]/div/div[1]/ul/li[4]";
	private String find = "//*[@id=\"intergralAudit-warp\"]/div[1]/div/div[2]/ul/li[4]/button";
	private String audit = "//*[@id=\"intergralAudit-warp\"]/div[1]/div/div[3]/div/div[3]/table/tbody/tr[1]/td[8]/div/div/button";
	private String audit_window = "//*[@id=\"intergralAudit-warp\"]/div[3]/div[2]";
	private String audit_phone = "//*[@id=\"intergralAudit-warp\"]/div[3]/div[2]/div[1]/div[3]/table/tbody/tr/td[2]/div";
	private String accept_btn = "//*[@id=\"intergralAudit-warp\"]/div[3]/div[2]/div[2]/div/button[1]";
	private String back_btn = "//*[@id=\"intergralAudit-warp\"]/div[3]/div[2]/div[2]/div/button[2]";
	
	/**
	 * 确认
	 */
	private String qr_btn = "/html/body/div[3]/div/div[3]/button[2]";
	
	
	
	/**
	 * 
	 * @description：导入积分文件
	 * @param arr
	 * @return
	 * @throws InterruptedException 
	 */
	public void sendFile() throws InterruptedException {
		/**
		 * 使输入框可见
		 */
		JavascriptExecutor js = (JavascriptExecutor)driver;
		sleep(5000);
		js.executeScript("document.getElementsByClassName(\"lineSendIntergral-uploadMask\")[0].style.display=\"block\"");
	    checkVisable(getInput_button());
	    LoggerUtil.info("文件输入框设置成可见");
	    addPicOrFile("resources/积分模板.xlsx", getInput_button());
	    /**
	     * 判断错误框
	     */
	    if(checkVisable(getError_alert())) {
	    	LoggerUtil.error("文件格式错误！无法上传！");
	    	AssertUtil.assertEquals("无错误弹窗", "有错误弹窗", "文件上传失败，格式有误！");
	    }
	    sleep(8000);
		LoggerUtil.info("成功导入调整积分文档");
	}
	
	/**
	 * 
	 * @description：审核上传积分文件
	 * @param arr
	 * @return
	 * @throws InterruptedException 
	 */
	public void auditFile() throws InterruptedException {
		/*JavascriptExecutor js = (JavascriptExecutor)driver;*/
		/*js.executeScript("document.getElementsByClassName(\"lineSendIntergral-auditMask\")[0].style.display=\"block\"");
		sleep(5000);
		click(getSh_div());
		LoggerUtil.info("点击审核调整积分文档");*/
		driver.get(getCurrentUrl()+"/audit");
		containUrl("/sell/lineSendIntergral/audit");
		LoggerUtil.info("进入调整积分文档审核页面");
		sendKeys(getOper(), "超级管理员");
		/*click(getOper());
		click(getOper_choice());*/
		LoggerUtil.info("选择上传用户：超级管理员");
		click(getFind());
		LoggerUtil.info("点击查询");
		/**
		 * 测试审核通过
		 */
		click(getAudit());
		LoggerUtil.info("点击审核按钮");
		if(checkVisable(getAudit_window())) {
			LoggerUtil.info("进入审核窗口");
		}
		checkText(getAudit_phone(), audit_account);
		LoggerUtil.info("审核excel内容正确展示");
		click(getAccept_btn());
		LoggerUtil.info("点击审核");
		click(getQr_btn());
		LoggerUtil.info("确认审核");
	}

	public WebElement getInput_button() {
		return getElement(input_button, "x");
	}
	
	public WebElement getError_alert() {
		return getElement(error_alert, "x");
	}

	public WebElement getSh_div() {
		return getElement(sh_div, "x");
	}
	
	
	public WebElement getOper() {
		return getElement(oper, "x");
	}

	public WebElement getFind() {
		return getElement(find, "x");
	}


	public WebElement getAudit() {
		return getElement(audit, "x");
	}


	public WebElement getAudit_window() {
		return getElement(audit_window, "x");
	}


	public WebElement getAudit_phone() {
		return getElement(audit_phone, "x");
	}


	public WebElement getAccept_btn() {
		return getElement(accept_btn, "x");
	}


	public WebElement getBack_btn() {
		return getElement(back_btn, "x");
	}

	public WebElement getQr_btn() {
		return getElement(qr_btn, "x");
	}

	public WebElement getOper_choice() {
		return getElement(oper_choice, "x");
	}






	
	
	
	
}
