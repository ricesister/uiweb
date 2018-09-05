package pages.dingdan;

import org.openqa.selenium.WebElement;

import pages.BasePage;
import pages.crmrk.CrmHomePage;

/**
 * 
 * @author fs
 * @version 1.0.0
 * @description 查询控件入口
 * @date 2018年8月28日 下午2:53:12
 */
public class DDFindPage extends CrmHomePage{
	
	/**
	 * 查询框控件
	 */
	private String provice_sel = "//*[@id=\"OmsOrderHeader\"]/ul[1]/li[1]/div/div[1]/div/div[1]/i";
	private String proZJ = "/html/body/div[3]/div/div[1]/ul/li[3]";
//	private String proTJ = "";
//	private String proHB = "";
	
	/**
	 * 市
	 */
	private String city_sel = "//*[@id=\"OmsOrderHeader\"]/ul[1]/li[1]/div/div[2]/div/div[1]/i";
	private String cityWZ = "/html/body/div[4]/div/div[1]/ul/li[2]";
	
	/**
	 * 合作方:默认温州东城
	 */
	private String hzf = "/html/body/div[5]/div/div[1]/ul/li[1]";
	
	/**
	 * 状态:待入库
	 */
	private String statis_sel = "//*[@id=\"OmsOrderHeader\"]/ul[2]/li[1]/div/div[1]/i";
	private String sta_drk = "/html/body/div[10]/div/div[1]/ul/li[2]";
	
	/**
	 * 客户名称
	 */
	private String xx_khmc = "//*[@id=\"OmsOrderHeader\"]/ul[3]/li[2]/span/div/input";
	private String pt_khmc = "//*[@id=\"OmsOrderHeader\"]/ul[3]/li[3]/span/div/input";
	
	/**
	 * 支付时间
	 */
	private String start_sel = "//*[@id=\"OmsOrderHeader\"]/ul[4]/li[1]/div/i";
	private String start_input = "/html/body/div[11]/div[1]/div/div[1]/span[1]/div/input";
	private String start_button = "/html/body/div[11]/div[2]/button";
	private String end_sel = "//*[@id=\"OmsOrderHeader\"]/ul[4]/li[2]/div/i";
	private String end_input = "/html/body/div[11]/div[1]/div/div[1]/span[1]/div/input";
	private String end_button = "/html/body/div[11]/div[2]/button";
	
	/**
	 * 查询
	 */
	private String find = "//*[@id=\"OmsOrderHeader\"]/div/button[1]";
	/**
	 * 批量关联订单（平台纸板）
	 */
	private String plgl_button = "";
	private String choose_file_input = "";
	private String upload_button = "";
	
	
	
	
	public WebElement getProvice_sel() {
		return getElement(provice_sel, "x");
	}

	public WebElement getProZJ() {
		return getElement(proZJ, "x");
	}

	public WebElement getCity_sel() {
		return getElement(city_sel, "x");
	}

	public WebElement getCityWZ() {
		return getElement(cityWZ, "x");
	}

	public WebElement getHzf() {
		return getElement(hzf, "x");
	}

	public WebElement getStatis_sel() {
		return getElement(statis_sel, "x");
	}

	public WebElement getSta_drk() {
		return getElement(sta_drk, "x");
	}

	public WebElement getXx_khmc() {
		return getElement(xx_khmc, "x");
	}

	public WebElement getPt_khmc() {
		return getElement(pt_khmc, "x");
	}

	public WebElement getStart_sel() {
		return getElement(start_sel, "x");
	}

	public WebElement getStart_input() {
		return getElement(start_input, "x");
	}

	public WebElement getStart_button() {
		return getElement(start_button, "x");
	}

	public WebElement getEnd_sel() {
		return getElement(end_sel, "x");
	}

	public WebElement getEnd_input() {
		return getElement(end_input, "x");
	}

	public WebElement getEnd_button() {
		return getElement(end_button, "x");
	}

	public WebElement getFind() {
		return getElement(find, "x");
	}

	public WebElement getPlgl_button() {
		return getElement(plgl_button, "x");
	}

	public WebElement getChoose_file_input() {
		return getElement(choose_file_input, "x");
	}

	public WebElement getUpload_button() {
		return getElement(upload_button, "x");
	}

	
	
}
