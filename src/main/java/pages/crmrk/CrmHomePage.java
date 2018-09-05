package pages.crmrk;

import org.openqa.selenium.WebElement;

import common.AssertUtil;
import common.LoggerUtil;
import pages.BasePage;

/**
 * 
 * @description crm主页面
 * @author fs
 * @2018年8月14日
 *
 */
public class CrmHomePage extends BasePage{
	
	/**
	 * 导航栏中的数据
	 */
	private String homeTtitle = "//*[@id=\"first\"]/div/div/h1";
	
	private String ddgl = "//*[@id=\"header\"]/ul/li[4]";
	
	private String yygl = "//*[@id=\"header\"]/ul/li[5]";
	
	private String xsgl = "//*[@id=\"header\"]/ul/li[3]";
	/**
	 * 运营管理子菜单
	 */
	private String gggl = "//*[@id=\"menu\"]/div/ul/li[6]/div";
	private String hdzx = "//*[@id=\"menu\"]/div/ul/li[13]/div";
	private String yhgl = "//*[@id=\"menu\"]/div/ul/li[1]";
	private String wlycdd = "//*[@id=\"menu\"]/div/ul/li[9]";
	private String xxzx = "//*[@id=\"menu\"]/div/ul/li[12]/div";
	private String kfycdd = "//*[@id=\"menu\"]/div/ul/li[11]";
	
	/**
	 * 订单管理子菜单
	 */
	private String ptzbdd = "//*[@id=\"menu\"]/div/ul/li[2]";
	//线下纸板
	private String xxzbdd = "//*[@id=\"menu\"]/div/ul/li[3]";
	private String xxzxdd = "//*[@id=\"menu\"]/div/ul/li[4]";
	
	/**
	 * 销售管理子菜单
	 */
	private String xxsjf = "//*[@id=\"menu\"]/div/ul/li/ul/li[3]";
	
	/**
	 * 活动中心子菜单
	 */
	private String hdgl = "//*[@id=\"menu\"]/div/ul/li[13]/ul/li[2]";
	/**
	 * 产品管理
	 */
	private String cpgl="//*[@id=\"header\"]/ul/li[2]";

	private String subCpgl="//*[@id=\"menu\"]/div/ul/li[2]/span";
	

	  private String choosePriceProgram="//*[@id=\"menu\"]/div/ul/li[6]";
	  
	
	/**
	 * 进入运营管理
	 * @throws InterruptedException
	 */
	public void toYYGL() throws InterruptedException {
		//等待动画结束
		//wait(10000, "//*[@id=\"first\"]/div/div/h1", "x");
		sleep(8000);
		click(getYYGL());
		click(getYYGL());
		LoggerUtil.info("点击运营管理");
		sleep(2000);
		//判断元素是否可见
		if(checkVisable(getGGGL())) {
			LoggerUtil.info("进入运营管理菜单");
		}
	}
	
	/**
	 *  
	 * @description： 进入销售管理菜单
	 * @param arr
	 * @return
	 * @throws InterruptedException 
	 */
	public void toXXGL() throws InterruptedException {
		sleep(8000);
		click(getXsgl());
		click(getXsgl());
		LoggerUtil.info("点击销售管理");
		if(checkVisable(getXxsjf())) {
			LoggerUtil.info("进入销售管理导航");
		}
	}
	
	/**
	 * 
	 * @description： 进入订单管理
	 * @param arr
	 * @return
	 */
	public void toDDGL() {
		refresh();
		click(getDdgl());
		click(getDdgl());
		LoggerUtil.info("点击订单管理");
		if(checkVisable(getXxzbdd())) {
			LoggerUtil.info("进入订单管理菜单");
		}
	}
	
	/**
	 * 
	 * @description：进入线下送积分页面
	 * @param arr
	 * @return
	 * @throws InterruptedException 
	 */
	public void toXXSJF() throws InterruptedException {
		toXXGL();
		click(getXxsjf());
		containUrl("/sell/lineSendIntergral");
		LoggerUtil.info("进入线下送积分页面");
	}
	
	/**
	 * 
	 * @description：运营管理-进入广告管理
	 * @param arr
	 * @return
	 */
	public void toGGGL() throws InterruptedException {
		toYYGL();
		if(!checkVisable(getElement("//*[@id=\"menu\"]/div/ul/li[6]/ul/li[1]", "x"))) {
			click(getGGGL());
		}
		
		LoggerUtil.info("进入广告管理菜单");
		
		
	}
	
	/**
	 * 进入活动中心
	 * @throws InterruptedException
	 */
	public void toHDZX() throws InterruptedException {
		toYYGL();
		moveMenu(getYhgl(), getGGGL());
		sleep(3000);
		moveMenu(getGGGL(), getKfycdd());
		//moveMenu(getWlycdd(), getXxzx());
		sleep(8000);
		if(!checkVisable(getHdgl())) {
			click(getHdzx());
			sleep(8000);
		}
		LoggerUtil.info("进入活动中心菜单");
	}
	
	/**
	 * 
	 * @description：进入线下纸板订单菜单
	 * @param arr
	 * @return
	 */
	public void toXXZBDD() {
		toDDGL();
		click(getXxzbdd());
		LoggerUtil.info("进入线下纸板订单页面");
	}
	
	
	/**
	 * 进入产品管理
	 * @throws InterruptedException
	 */
	public void toCPGL() throws InterruptedException {
		sleep(8000);
		click(getCPGL());
		click(getCPGL());
		LoggerUtil.info("进入产品管理");
	}
	
	public void toSubCPGL() {
		if(checkVisable(getSubCPGL())) {
			click(getSubCPGL());
			click(getSubCPGL());
			LoggerUtil.info("进入子菜单产品管理");
		}else {
			LoggerUtil.info("没有找到产品管理子菜单");
		}
	}
	
	/**
	   * 进入产品管理-选择价格方案
	   * @throws InterruptedException 
	   */
	  public void toChoosePriceProgram() throws InterruptedException {
	    sleep(3000);
	    if(checkVisable(getSubCPGL())) {
	      click(getElement(choosePriceProgram, "x"));
	      click(getElement(choosePriceProgram, "x"));
	      LoggerUtil.info("进入产品管理-选择价格方案");
	    }else {
	      LoggerUtil.info("没有找到进入产品管理-选择价格方案");
	    }
	  }
	
	private WebElement getSubCPGL() {
		return getElement(subCpgl, "x");
	}

	private WebElement getYYGL() {
		return getElement(yygl, "x");
	}
	
	private WebElement getGGGL() {
		return getElement(gggl, "x");
	}

	public WebElement getHdzx() {
		return getElement(hdzx, "x");
	}

	public WebElement getHdgl() {
		return getElement(hdgl, "x");
	}

	public WebElement getYhgl() {
		return getElement(yhgl, "x");
	}

	public WebElement getWlycdd() {
		return getElement(wlycdd, "x");
	}

	public WebElement getXxzx() {
		return getElement(xxzx, "x");
	}

	public WebElement getKfycdd() {
		return getElement(kfycdd, "x");
	}
	public WebElement getCPGL() {
		return getElement(cpgl,"x");
	}

	public WebElement getDdgl() {
		return getElement(ddgl,"x");
	}

	public WebElement getPtzbdd() {
		return getElement(ptzbdd,"x");
	}


	public WebElement getXxzbdd() {
		return getElement(xxzbdd,"x");
	}


	public WebElement getXxzxdd() {
		return getElement(xxzxdd,"x");
	}

	public WebElement getXxsjf() {
		return getElement(xxsjf,"x");
	}


	public WebElement getXsgl() {
		return getElement(xsgl,"x");
	}



	
	
	
	
	 
	
	

}
