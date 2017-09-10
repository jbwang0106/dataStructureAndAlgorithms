package com.jbwang.hash;

/**
 * 节点组成的一个有序链表
 * @author Administrator
 *
 */
public class SortedList {

	private Link first;
	
	public SortedList() {
		first = null;
	}
	
	/**
	 * 插入节点
	 * @param link
	 */
	public void insertLink(Link link) {
		
		int key = link.getKey();
		
		Link prev = null;
		Link current = first;
		
		while(current != null && key > current.getKey()) {
			prev = current;
			current = current.next;
		}
		
		if(prev == null) 
			first = link;
		else
			prev.next = link;
		
		link.next = current;
	}
	
	/**
	 * 删除一个节点
	 * @param key
	 */
	public void deleteLink(int key) {
		
		Link prev = null;
		Link current = first;
		
		while(current != null && key != current.getKey()) {
			prev = current;
			current = current.next;
		}
		
		if(prev == null && first != null)
			first = first.next;
		else 
			prev.next = current.next;
		
	}
	
	/**
	 * 查找一个节点
	 * @param key
	 * @return
	 */
	public Link find(int key) {
		
		Link current = first;
		
		while(current != null && current.getKey() <= key) {
			
			if(current.getKey() == key)
				return current;
			
			current = current.next;
			
		}
		
		return null;
	}
	
	public void displayList() {
		
		System.out.print("List first -------> last: ");
		
		Link current = first;
		
		while(current != null) {
			current.display();
			current = current.next;
		}
		
		System.out.println();
		
	}
	
}
