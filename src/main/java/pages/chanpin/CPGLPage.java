package pages.chanpin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import common.AssertUtil;
import common.LoggerUtil;
import pages.BasePage;

public class CPGLPage extends BasePage{
	
	/**
	 * 省、市、合作方选项
	 */
	private String provice="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[1]/input";
	private String proviceOption="/html/body/div[2]/div/div[1]/ul/li[1]";
	private String city="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[2]/div[1]/div[1]/div[2]/div/div[1]/input";
	private String cityOption="/html/body/div[3]/div/div[1]/ul/li";
	private String partner="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[2]/div[1]/div[2]/div/div/div/div[1]/input";
	private String partnerOption="/html/body/div[4]/div/div[1]/ul/li/span";
	private String addButton="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[2]/div[1]/button";
	/**
	 * 新增菜单
	 */
	private String xsqyOfInput="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[2]/div/div[1]/div/div[1]/input";
	private String xsqyOfBeijing="/html/body/div[5]/div/div[1]/ul/li[1]";
	private String xsqyOfInput2="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div[1]/input";
	private String xsqyOfBeijing2="/html/body/div[6]/div/div[1]/ul/li";
	private String scmc="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[5]/div[1]/div/input";
	private String tjhy="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[6]/div[1]/div/input";
	private String cpmc="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[5]/div[2]/div/input";
	private String syhy="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[6]/div[2]/div/input";
	private String jqts="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[5]/div[3]/div/input";
	private String jqsj="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[6]/div[3]/div/input";
	private String queding="/html/body/div[7]/div[2]/button[2]";
	private String ylmc="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[5]/div[4]/div/input";
	private String wl="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[6]/div[4]/div[1]/div/input";
	private String maxjdc="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[5]/div[6]/div[1]/div/input";
	private String minjdc="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[6]/div[5]/div[1]/div/input";
	private String maxjdk="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[5]/div[6]/div[2]/div/input";
	private String minjdk="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[6]/div[5]/div[2]/div/input";
	private String mainPicture="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[7]/div/div[2]/div/input";
	private String detailPicture="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[8]/div[2]/div/input";
	private String lx="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[5]/div[5]/div/div/div[1]/input";
	private String lxOption="/html/body/div[8]/div/div[1]/ul/li[1]";
	private String cs="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[6]/div[4]/div[2]/div/div[1]/input";
	private String csOption="/html/body/div[9]/div/div[1]/ul/li[1]";
	private String saveButton="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[9]/button[2]/span";
	
	/**
	 * 产品列表（编辑，删除）
	 */
	private String updateProduct="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[2]/div[2]/div[1]/div[4]/div[2]/table/tbody/tr[1]/td[11]/div/div[3]";
	private String productName="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[2]/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[5]/div";
	private String deleteProduct="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[2]/div[2]/div[1]/div[4]/div[2]/table/tbody/tr[1]/td[11]/div/div[4]";
	private String quedingOfDelete="//*[@id=\"home\"]/div[2]/div/div/div[2]/div[1]/div/div[2]/div/button[2]/span";
	private String cpmc2="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[4]/div[2]/div/input";
	private String saveButton2="//*[@id=\"home\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[8]/button[2]/span";
	/**
	 * 选择省、市、合作方
	 * @throws InterruptedException
	 */
	public void selectOptions() throws InterruptedException {
		sleep(5000);
		click(getElement(provice, "x"));
		sleep(2000);
		click(getElement(proviceOption,"x"));
		click(getElement(city,"x"));
		sleep(2000);
		click(getElement(cityOption, "x"));
		click(getElement(partner, "x"));
		click(getElement(partnerOption,"x"));
	}
	/**
	 * 填写新增产品属性
	 * @throws InterruptedException 
	 */
	public void addProduct() throws InterruptedException {
		LoggerUtil.info("开始新增产品...");
		click(getElement(addButton,"x"));
		click(getElement(xsqyOfInput,"x"));
		sleep(2000);
		click(getElement(xsqyOfBeijing,"x"));
		click(getElement(xsqyOfInput2,"x"));
		click(getElement(xsqyOfBeijing2,"x"));
		List<WebElement> elements=new ArrayList<WebElement>();
		/*String js="document.getElementById(\"train_date\").removeAttribute(\"readonly\");";
		excuse_js(js);*/
		String[] values= {"自动化测试用","自动化测试","自动化测试（新增）","自动化测试","100","自动化测试","自动化测试","123","100","123","100"};
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
		LoggerUtil.info("输入产品信息");
		sendKeys(elements, values);
		click(getElement(jqsj, "x"));
		sleep(1000);
		click(getElement(queding,"x"));
		click(getElement(lx,"x"));
		click(getElement(lxOption,"x"));
		click(getElement(cs,"x"));
		click(getElement(csOption,"x"));
		
		//添加图片
		addPicture();
		sleep(3000);
		click(getElement(saveButton, "x"));
		sleep(2000);
		String name=getElement(productName, "x").getText();
		AssertUtil.assertEquals(name, "自动化测试（新增）", "产品名称是自动化测试（新增）");
		LoggerUtil.info("新增产品成功");
	}
	/**
	 * 上传图片
	 * @throws InterruptedException
	 */
	public void addPicture() throws InterruptedException {
		LoggerUtil.info("开始上传图片...");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementsByName(\"file\")[0].style.display=\"block\"");
		js.executeScript("document.getElementsByName(\"file\")[1].style.display=\"block\"");
		WebElement pic1=getElement(mainPicture, "x");
		File picture1=new File("image/sun1.png");
		File picture2=new File("image/sun2.png");
		sendKeys(pic1, picture1.getAbsolutePath());
		WebElement pic2=getElement(detailPicture, "x");
		sendKeys(pic2, picture2.getAbsolutePath());
		LoggerUtil.info("上传图片成功");
	}
	/**
	 * 编辑产品
	 * @throws InterruptedException 
	 */
	public void updateProduct() throws InterruptedException {
		LoggerUtil.info("开始编辑产品");
		sleep(3000);
		click(getElement(updateProduct, "x"));
		WebElement element=getElement(cpmc2, "x");
		element.clear();
		sendKeys(element,"自动化测试（编辑）");
		click(getElement(saveButton2, "x"));
		sleep(2000);
		AssertUtil.assertEquals(getElement(productName, "x").getText(), "自动化测试（编辑）", "产品名称是自动化测试（编辑）");
		LoggerUtil.info("编辑产品成功");
	}
	/**
	 * 删除产品
	 * @throws InterruptedException 
	 */
	public void deleteProduct() throws InterruptedException {
		sleep(3000);
		LoggerUtil.info("开始删除产品");
		click(getElement(deleteProduct, "x"));
		click(getElement(quedingOfDelete, "x"));
		sleep(2000);
		AssertUtil.assertNotEquals(getElement(productName, "x"), "自动化测试（编辑）", "产品名称不是自动化测试（编辑）");
		LoggerUtil.info("删除产品成功");
	}
}
