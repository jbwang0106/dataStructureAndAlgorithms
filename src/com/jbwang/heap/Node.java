package com.jbwang.heap;

public class Node {
	
	private int iData;
	
	public Node(int key) {
		this.iData = key;
	}

	public int getiData() {
		return iData;
	}

	public void setiData(int iData) {
		this.iData = iData;
	}

	@Override
	public String toString() {
		return iData + "";
	}
	
	

}
