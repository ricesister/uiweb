package pages.dingdan;

import org.openqa.selenium.WebElement;

/**
 * 
 * @author fs
 * @version 1.0.0
 * @description 线下纸板Page
 * @date 2018年8月28日 下午3:41:11
 */
public class XXZBPage extends DDFindPage{
	
	/**
	 * 导入
	 */
	private String import_button = "//*[@id=\"offlinePaperboardOrder\"]/div/ul/li[2]/button";

	
	/**
	 * 
	 * @description：导入线下纸板订单
	 * @param arr
	 * @return
	 */
	public void import_xxdd() {
		//click(element);
	}
	
	public WebElement getImport_button() {
		return getElement(import_button, "x");
	}
	
	
	/*public void */

}
