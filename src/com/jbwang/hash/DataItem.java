package com.jbwang.hash;

/**
 * hash表中存放的数据项,开放地址法
 * @author Administrator
 *
 */
public class DataItem {

	private int iData;
	
	public DataItem(int iData) {
		this.iData = iData;
	}

	public int getiData() {
		return iData;
	}

	public void setiData(int iData) {
		this.iData = iData;
	}
	
}
