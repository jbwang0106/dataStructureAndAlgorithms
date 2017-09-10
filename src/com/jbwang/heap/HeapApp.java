package com.jbwang.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HeapApp {
	
	public static void main(String[] args) throws IOException {
		
		int value, value2;
		Heap heap = new Heap(31);
		boolean success;
		
		heap.insert(70);
		heap.insert(40);
		heap.insert(50);
		heap.insert(20);
		heap.insert(60);
		heap.insert(100);
		heap.insert(80);
		heap.insert(30);
		heap.insert(10);
		heap.insert(90);
		
		while(true) {
			
			System.out.println("Enter first letter of show, ");
			System.out.println("insert remove or change.");
			
			int choice = getChar();
			
			switch(choice) {
			
				case 's':
					heap.displayHeap();
					break;
				case 'i':
					System.out.println("Enter value to insert: ");
					value = getInt();
					success = heap.insert(value);
					if(!success)
						System.out.println("Can not insert heap is full");
					break;
				case 'r':
					System.out.println("Entry value to remove: ");
					if(heap.isEmpty())
						System.out.println("Can not remove heap is empty");
					else
						heap.remove();
					
					break;
				case 'c':
					System.out.println("Entry current index item: ");
					value = getInt();
					System.out.println("Entry new key");
					value2 = getInt();
					
					heap.change(value, value2);
					
					break;
				
				default:
					System.out.println("invalid entry\n");
			}
			
		}
		
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
