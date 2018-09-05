package pages.chanpin;

import java.io.File;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.asserts.Assertion;

import common.AssertUtil;
import common.LoggerUtil;
import pages.BasePage;

/**
 * 
 * @author zhangyingkai
 *	
 * 2018年8月29日,下午7:45:34
 */
public class XZJGFAPage extends BasePage{
	/**
	 * 省市、合作方选项
	 */
	private String proviceInput="//*[@id=\"home\"]/div[2]/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/input";
	private String proviceOption="/html/body/div[2]/div/div[1]/ul/li[1]";
	private String cityInput="//*[@id=\"home\"]/div[2]/div/div/div[2]/div[1]/div[1]/div/div[2]/div/div[1]/input";
	private String cityOption="/html/body/div[3]/div/div[1]/ul/li";
	private String partnerInput="//*[@id=\"home\"]/div[2]/div/div/div[2]/div[1]/div[2]/div/div/div/div[1]/input";
	private String partnerOption="/html/body/div[4]/div/div[1]/ul/li";
	
	/**
	 * 新增价格方案
	 */
	private String product="//*[@id=\"home\"]/div[2]/div/div/div[2]/div[1]/div[3]/div/div[3]/table/tbody/tr[1]/td[1]";
	private String addProgramButton="//*[@id=\"home\"]/div[2]/div/div/div[2]/div[2]/div[2]/button";
	private String priceProgramName="//*[@id=\"home\"]/div[2]/div/div/div[3]/div[1]/div/div[2]/div[1]/div[1]/div[1]/div/input";
	private String xiangouNum="//*[@id=\"home\"]/div[2]/div/div/div[3]/div[1]/div/div[2]/div[1]/div[3]/div[1]/div/div/input";
	private String tuangouPrice="//*[@id=\"home\"]/div[2]/div/div/div[3]/div[1]/div/div[2]/div[1]/div[4]/div/div/div/input";
	private String shichangPrice="//*[@id=\"home\"]/div[2]/div/div/div[3]/div[1]/div/div[2]/div[1]/div[3]/div[2]/div/div/input";
	private String qbNum="//*[@id=\"home\"]/div[2]/div/div/div[3]/div[1]/div/div[2]/div[1]/div[5]/div/div[1]/div/input";
	private String zcNum="//*[@id=\"home\"]/div[2]/div/div/div[3]/div[1]/div/div[2]/div[1]/div[5]/div/div[2]/div/input";
	private String priceAdd="//*[@id=\"home\"]/div[2]/div/div/div[3]/div[1]/div/div[2]/div[1]/div[5]/div/div[3]/div/input";
	private String mainPicture="//*[@id=\"home\"]/div[2]/div/div/div[3]/div[1]/div/div[2]/div[1]/div[8]/div[1]/div/div[2]/div/input";
	private String detailPicture="//*[@id=\"home\"]/div[2]/div/div/div[3]/div[1]/div/div[2]/div[1]/div[8]/div[2]/div/div[2]/div/input";
	private String saveButton="//*[@id=\"home\"]/div[2]/div/div/div[3]/div[1]/div/div[2]/div[2]/button[2]/span";
	/**
	 * 编辑价格方案
	 */
	private String editButton="//*[@id=\"home\"]/div[2]/div/div/div[2]/div[2]/div[3]/div/div[4]/div[2]/table/tbody/tr/td[8]/div/button[1]/span";
	private String priceProgramName2="//*[@id=\"home\"]/div[2]/div/div/div[3]/div[1]/div/div[2]/div[1]/div[1]/div[1]/div/input";
	private String saveButton2="//*[@id=\"home\"]/div[2]/div/div/div[3]/div[1]/div/div[2]/div[2]/button[2]";
	private String programName="//*[@id=\"home\"]/div[2]/div/div/div[2]/div[2]/div[3]/div/div[3]/table/tbody/tr/td[2]/div";
	/**
	 * 删除价格方案
	 */
	private String deleteButton="//*[@id=\"home\"]/div[2]/div/div/div[2]/div[2]/div[3]/div/div[4]/div[2]/table/tbody/tr[1]/td[8]/div/button[2]/span";
	private String quedingButton="//*[@id=\"home\"]/div[2]/div/div/div[4]/div[1]/div/div[2]/div/button[2]/span";
	
	
	
	/**
	 * 选择省市合作方
	 * @throws InterruptedException
	 */
	public void selectOptions() throws InterruptedException {
		LoggerUtil.info("选择省市合作方选项");
		sleep(3000);
		click(getElement(proviceInput, "x"));
		click(getElement(proviceOption, "x"));
		click(getElement(cityInput, "x"));
		click(getElement(cityOption, "x"));
		click(getElement(partnerInput, "x"));
		click(getElement(partnerOption, "x"));
		sleep(3000);
		click(getElement(product, "x"));
	}
	
	/**
	 * 新增价格方案
	 * @throws InterruptedException 
	 */
	public void addPriceProgram() throws InterruptedException {
		LoggerUtil.info("新增价格方案开始");
		click(getElement(addProgramButton,"x"));
		sleep(2000);
		sendKeys(getElement(priceProgramName, "x"), "自动化测试（新增）");
		sendKeys(getElement(xiangouNum, "x"), "100");
		sendKeys(getElement(tuangouPrice, "x"), "0.5");
		sendKeys(getElement(shichangPrice, "x"), "1");
		sendKeys(getElement(qbNum, "x"), "100");
		sendKeys(getElement(zcNum, "x"), "300");
		sendKeys(getElement(priceAdd, "x"), "0.1");
		addPicture();
		sleep(2000);
		click(getElement(saveButton, "x"));
		sleep(2000);
		AssertUtil.assertEquals(getElement(programName, "x").getText(), "自动化测试（新增）", "");
		LoggerUtil.info("新增价格方案成功");
	}
	/**
	 * 添加图片
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
	
	public void updateProgram() throws InterruptedException {
		LoggerUtil.info("开始编辑价格方案");
		sleep(2000);
		click(getElement(editButton, "x"));
		sleep(2000);
		WebElement element=getElement(priceProgramName2, "x");
		clean(element);
		sendKeys(element, "自动化测试（编辑）");
		click(getElement(saveButton2, "x"));
		sleep(2000);
		AssertUtil.assertEquals(getElement(programName, "x").getText(), "自动化测试（编辑）", "");
		LoggerUtil.info("编辑价格方案成功");
	}
	
	public void deleteProgram() throws InterruptedException {
		LoggerUtil.info("开始删除价格方案");
		sleep(2000);
		click(getElement(deleteButton, "x"));
		click(getElement(quedingButton, "x"));
		sleep(2000);
		AssertUtil.assertEquals(checkElementCanBeFind(programName), false, "");
	}
}
