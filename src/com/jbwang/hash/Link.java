package com.jbwang.hash;

/**
 * 一个节点
 * @author Administrator
 *
 */
public class Link {
	
	private int iData;
	public Link next;
	
	public Link(int iData) {
		this.iData = iData;
	}
	
	public int getKey() {
		return iData;
	}

	public void display() {
		System.out.print(iData + " ");
	}
}
