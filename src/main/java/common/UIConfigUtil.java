package common;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import config.UIConfig;

/**
 * 
 * @author fs
 * @version 1.0.0
 * @description uiconfig工具类
 * @date 2018年8月21日 上午10:51:53
 */
public class UIConfigUtil {
	private String rootUrl;
	private List<UIConfig> address ;
	private String picPath;
	
	@SuppressWarnings("unchecked")
	public UIConfigUtil(String uiConfigPath) throws DocumentException {
		SAXReader reader = new SAXReader();
		Document document = reader.read(uiConfigPath);
		Element rootElement = document.getRootElement();
		
		rootUrl = rootElement.element("ui-config").getTextTrim();
		List<Element> https = rootElement.element("ui-address").element("http-addrs")
				.elements("http");
		https.forEach((ele)->{
			UIConfig config = new UIConfig();
			config.setDesc(ele.attributeValue("desc").trim());
			config.setAddress(ele.attributeValue("addr").trim());
			config.setPassword(ele.attributeValue("username").trim());
			config.setPassword(ele.attributeValue("password").trim());
			address.add(config);
		});
		
		picPath = rootElement.element("path").attributeValue("file-path")
				.trim();
	}

	public String getRootUrl() {
		return rootUrl;
	}

	public void setRootUrl(String rootUrl) {
		this.rootUrl = rootUrl;
	}

	public List<UIConfig> getAddress() {
		return address;
	}

	public void setAddress(List<UIConfig> address) {
		this.address = address;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	
	

}
