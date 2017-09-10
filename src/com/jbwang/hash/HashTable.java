package com.jbwang.hash;

/**
 * 使用线性探测的开放地址法hash表
 * @author Administrator
 *
 */
public class HashTable {
	
	/**
	 * hash表的底层数组
	 */
	private DataItem[] hashArray;
	
	/**
	 * 数组的长度
	 */
	private int arraySize;
	
	/**
	 * 被删除的元素，标记为-1
	 */
	private DataItem nonItem;
	
	public HashTable(int size) {
		arraySize = size;
		hashArray = new DataItem [arraySize];
		nonItem = new DataItem(-1);
	}
	
	/**
	 * 显示hash表中的元素
	 */
	public void displayTable() {
		
		System.out.println("Table: ");
		
		for (int i = 0; i < arraySize; i++) {
			if (hashArray[i] != null) {
				System.out.print(hashArray[i].getiData() + " ");
			} else
				System.out.print(" *** ");
		}
		
		System.out.println("");
		
	}
	
	/**
	 * hash函数，对key进行hash
	 * @param key
	 * @return
	 */
	public int hashFuc(int key) {
		return key % arraySize;
	}
	
	/**
	 * 往hash表中插入元素
	 * @param item
	 */
	public void insertItem(DataItem item) {
		
		int key = item.getiData();
		int hashVal = this.hashFuc(key);
		
		while(hashArray[hashVal] != null && hashArray[hashVal].getiData() != -1) {
			
			hashVal ++;
			
			//超过数组长度，从0开始重新寻址
			hashVal %= arraySize; //hashVal = hashVal % arraySize;
		}
		
		hashArray[hashVal] = item;
		
	}
	
	/**
	 * 根据关键字删除一个数据项
	 * @param key
	 * @return
	 */
	public DataItem deleteItem(int key) {
		
		int hashVal = this.hashFuc(key);
		
		while(hashArray[hashVal] != null) {
			
			if(hashArray[hashVal].getiData() == key) {
				DataItem temp = hashArray[hashVal];
				hashArray[hashVal] = nonItem;
				return temp;
			}
			
			hashVal ++;
			hashVal %= arraySize;
		}
		
		return null;
	}
	
	/**
	 * 根据关键字找到需要的数据项
	 * @param key
	 * @return
	 */
	public DataItem find(int key) {
		
		int hashVal = this.hashFuc(key);
		
		while(hashArray[hashVal] != null) {
			
			if (hashArray[hashVal].getiData() == key) 
				return hashArray[hashVal];
			
			hashVal ++;
			hashVal %= arraySize;
			
		}
		
		return null;
	}
}
