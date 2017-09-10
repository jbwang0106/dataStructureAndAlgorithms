package com.jbwang.hash;

/**
 * 使用链地址法的hash表
 * @author Administrator
 *
 */
public class HashTableChain {
	
	private SortedList[] hashArray;
	
	private int size;
	
	public HashTableChain(int size) {
		this.size = size;
		hashArray = new SortedList[size];
		
		for (int i = 0; i < size; i++) {
			hashArray[i] = new SortedList();
		}
	}
	
	public void displayTable() {
		
		for (int i = 0; i < size; i++) {
			System.out.println(i + ".");
			hashArray[i].displayList();
		}
		
	}
	
	public int hashFuc(int key) {
		
		return key % size;
		
	}
	
	public void insert(Link link) {
		int hashVal = this.hashFuc(link.getKey());
		hashArray[hashVal].insertLink(link);
	}
	
	public void delete(int key) {
		int hashVal = this.hashFuc(key);
		hashArray[hashVal].deleteLink(key);
	}
	
	public Link find(int key) {
		int hashVal = this.hashFuc(key);
		Link link = hashArray[hashVal].find(key);
		return link;
	}
}
