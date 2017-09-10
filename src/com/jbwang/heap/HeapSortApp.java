package com.jbwang.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 堆排序
 * @author Administrator
 *
 */
public class HeapSortApp {
	
	public static void main(String[] args) throws IOException {
		
		int size,j;
		
		System.out.println("Entry number of item");
		size = getInt();
		Heap heap = new Heap(size);
		
		for (j = 0; j < size; j++) {
			Node node = new Node((int) (Math.random()*100));
			heap.insertAt(j, node);
			heap.incrementSize();
		}
		
		System.out.println("Random: ");
		heap.displayArray();
		
		for (j = size/2 - 1; j >= 0; j--) {
			heap.trickDown(j);
		}
		
		System.out.println("Heap: ");
		heap.displayArray();
		heap.displayHeap();
		
		for (j = size - 1; j >= 0; j--) {
			Node bigNode = heap.remove();
			heap.insertAt(j, bigNode);
		}
		
		System.out.println("Sorted: ");
		heap.displayArray();
		
	}
	
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		return line;
	}
	
	public static Integer getInt() throws IOException {
		String string = getString();
		return Integer.parseInt(string);
	}
	
	public static char getChar() throws IOException {
		return getString().charAt(0);
	}
	
}
