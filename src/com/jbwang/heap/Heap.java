package com.jbwang.heap;


/**
 * 当前节点的父节点的索引为(x-1)/2
 * 当前节点的左子节点为2x+1, 右子节点为2x+2
 * @author Administrator
 *
 */
public class Heap {

	private Node[] nodeArray;
	private int maxSize;
	private int currentSize;
	
	public Heap(int size) {
		maxSize = size;
		currentSize = 0;
		nodeArray = new Node[maxSize];
	}
	
	/**
	 * 是否存在元素
	 */
	public boolean isEmpty() {
		return currentSize == 0;
	}
	
	/**
	 * 插入一个节点
	 * @param key
	 * @return
	 */
	public boolean insert(int key) {
		
		if(currentSize == maxSize)
			return false;
		
		Node node = new Node(key);
		
		nodeArray[currentSize] = node;
		trickUp(currentSize++);
		
		return true;
	}
	
	/**
	 * 向上替换
	 * @param index
	 */
	private void trickUp(int index) {
		
		int parent = (index - 1) / 2;
		Node bottom = nodeArray[index];
		
		while(index > 0 && nodeArray[parent].getiData() < bottom.getiData()) {
			
			nodeArray[index] = nodeArray[parent];
			
			index = parent;
			parent = (parent - 1) / 2;
		}
		
		nodeArray[index] = bottom;
	}
	
	/**
	 * 移除第一个元素
	 * @return
	 */
	public Node remove() {
		
		Node root = nodeArray[0];
		
		nodeArray[0] = nodeArray[--currentSize];
		trickDown(0);
		return root;
		
	}
	
	/**
	 * 向下替换
	 * @param index
	 */
	public void trickDown(int index) {
		
		int largerChild;
		Node top = nodeArray[index];
		
		while(index < currentSize/2) {
			
			int leftChild = 2 * index + 1;
			int rightChild = leftChild + 1;
			
			if(rightChild < currentSize && nodeArray[leftChild].getiData() < nodeArray[rightChild].getiData())
				largerChild = rightChild;
			else
				largerChild = leftChild;
			
			if (top.getiData() >= nodeArray[largerChild].getiData())
				break;
			
			nodeArray[index] = nodeArray[largerChild];
			
			index = largerChild;
			
		}
		
		nodeArray[index] = top;
		
	}
	
	/**
	 * 替换某个索引处的节点
	 * @param index
	 * @param value
	 * @return
	 */
	public boolean change(int index, int value) {
		
		if(index < 0 || index >= currentSize)
			return false;
		
		int oldValue = nodeArray[index].getiData();
		nodeArray[index].setiData(value);
		
		if(oldValue < value)
			trickUp(index);
		else
			trickDown(index);
		
		return true;
	}
	
	/**
	 * 显示heap中的元素
	 */
	public void  displayHeap() {
		System.out.print("heapArray: ");
		
		for (int i = 0; i < currentSize; i++) {
			if(nodeArray[i] != null) {
				System.out.print(nodeArray[i].getiData() + " ");
			} else {
				System.out.print("-- ");
			}
		}
		System.out.println();
		
		int nBlanks = 32;
		int itemsPerRow = 1;
		int column = 0;
		int j = 0;
		String dots = ".....................";
		System.out.println(dots + dots);
		
		while(currentSize > 0) {
			
			if(column == 0) {
				for (int k = 0; k < nBlanks; k++) {
					System.out.print(" ");
				}
			}
			
			System.out.print(nodeArray[j].getiData());
			
			if (++j == currentSize)
				break;
			
			if(++column == itemsPerRow) {
				
				nBlanks /= 2;
				itemsPerRow *= 2;
				column = 0;
				System.out.println();
				
			} else {
				for (int k = 0; k < nBlanks*2-2; k++) {
					System.out.print(" ");
				}
			}
		}
		System.out.println("\n" + dots + dots);
		
	}
	
	public void displayArray() {
		for (int i = 0; i < maxSize; i++) {
			System.out.print(nodeArray[i].getiData() + " ");
		}
		System.out.println();
	}
	
	public void insertAt(int index, Node node) {
		nodeArray[index] = node;
	}
	
	public void incrementSize() {
		currentSize ++;
	}
	
}
