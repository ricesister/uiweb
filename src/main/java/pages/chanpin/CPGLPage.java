package pages.chanpin;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import common.LoggerUtil;
import pages.BasePage;

public class CPGLPage extends BasePage{
	
	/**
	 * 省、市、合作方选项
	 */
	private String provice="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[1]/input";
	private String proviceOption="/html/body/div[4]/div/div[1]/ul/li[1]";
	private String city="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[2]/div[1]/div[1]/div[2]/div/div[1]/input";
	private String cityOption="/html/body/div[4]/div/div[1]/ul/li";
	private String partner="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[2]/div[1]/div[2]/div/div/div/div[1]/input";
	private String partnerOption="/html/body/div[4]/div/div[1]/ul/li/span";
	private String addButton="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[2]/div[1]/button";
	/**
	 * 新增菜单
	 */
	private String xsqyOfInput="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[2]/div/div[1]/div/div[1]/input";
	private String xsqyOfBeijing="/html/body/div[6]/div/div[1]/ul/li[1]";
	private String xsqyOfInput2="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div[1]/input";
	private String xsqyOfBeijing2="/html/body/div[7]/div/div[1]/ul/li[1]";
	private String scmc="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[5]/div[1]/div/input";
	private String tjhy="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[6]/div[1]/div/input";
	private String cpmc="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[5]/div[2]/div/input";
	private String syhy="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[6]/div[2]/div/input";
	private String jqts="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[5]/div[3]/div/input";
	private String jqsj="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[6]/div[3]/div/input";
	private String queding="/html/body/div[8]/div[2]/button[2]";
	private String ylmc="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[5]/div[4]/div/input";
	private String wl="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[6]/div[4]/div[1]/div/input";
	private String maxjdc="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[5]/div[6]/div[1]/div/input";
	private String minjdc="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[6]/div[5]/div[1]/div/input";
	private String maxjdk="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[5]/div[6]/div[2]/div/input";
	private String minjdk="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[6]/div[5]/div[2]/div/input";
	private String mainPicture="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[7]/div/div[2]/div/input";
	private String detailPicture="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[8]/div[2]/div/input";
	private String lx="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[5]/div[5]/div/div/div[1]/input";
	private String lxOption="/html/body/div[9]/div/div[1]/ul/li[1]";
	private String cs="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[6]/div[4]/div[2]/div/div[1]/input";
	private String csOption="/html/body/div[9]/div/div[1]/ul/li[1]";
	private String saveButton="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[9]/button[2]/span";
	
	/**
	 * 选择省、市、合作方
	 * @throws InterruptedException
	 */
	public void selectOptions() throws InterruptedException {
		sleep(2);
		click(getElement(provice, "x"));
		click(getElement(proviceOption,"x"));
		click(getElement(city,"x"));
		click(getElement(cityOption, "x"));
		click(getElement(partner, "x"));
		click(getElement(partnerOption,"x"));
	}
	/**
	 * 填写新增产品属性
	 */
	public void addProduct() {
		LoggerUtil.info("开始新增产品...");
		click(getElement(addButton,"x"));
		click(getElement(xsqyOfInput,"x"));
		click(getElement(xsqyOfBeijing,"x"));
		click(getElement(xsqyOfInput2,"x"));
		click(getElement(xsqyOfBeijing2,"x"));
		List<WebElement> elements=new ArrayList<WebElement>();
		/*String js="document.getElementById(\"train_date\").removeAttribute(\"readonly\");";
		excuse_js(js);*/
		String[] values= {"自动化测试用","自动化测试","自动化测试","自动化测试","100","自动化测试","自动化测试","123","100","123","100","../image/sun1.png","../image/sun2.png"};
		elements.add(getElement(scmc,"x"));
		elements.add(getElement(tjhy, "x"));
		elements.add(getElement(cpmc, "x"));
		elements.add(getElement(syhy,"x"));
		elements.add(getElement(jqts, "x"));
		elements.add(getElement(ylmc, "x"));
		elements.add(getElement(wl,"x"));
		elements.add(getElement(maxjdc, "x"));
		elements.add(getElement(minjdc, "x"));
		elements.add(getElement(maxjdk, "x"));
		elements.add(getElement(minjdk, "x"));
		elements.add(getElement(mainPicture, "x"));
		elements.add(getElement(detailPicture,"x"));
		LoggerUtil.info("输入产品信息");
		sendKeys(elements, values);
		click(getElement(jqsj, "x"));
		click(getElement(queding,"x"));
		click(getElement(lx,"x"));
		click(getElement(lxOption,"x"));
		click(getElement(cs,"x"));
		click(getElement(csOption,"x"));
		click(getElement(saveButton, "x"));
		LoggerUtil.info("保存产品");
		
	}
}
