package test;

import common.LoggerUtil;

/**
 * 
 * @author fs
 * @version 1.0.0
 * @description 基本类
 * @date 2018年8月28日 上午11:28:48
 */
public class BaseTest {
	
	protected void begin() {
		LoggerUtil.info("-------ui test begin-------");
	}
	
	
	protected void end() {
		LoggerUtil.info("-------ui test end-------");
	}

}
