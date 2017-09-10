package com.jbwang.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HashTableApp {
	
	public static void main(String[] args) throws IOException {
		
		DataItem aItem;
		int aKey, n, size, keyperCell;
		
		System.out.println("Enter size of hash table: ");
		size = getInt();
		
		System.out.println("Enter initial number of items: ");
		n = getInt();
		keyperCell = 10;
		
		HashTable hashTable = new HashTable(size);
		
		for (int i = 0; i < n; i++) {
			aKey = (int) (Math.random() * keyperCell * size);
			aItem = new DataItem(aKey);
			hashTable.insertItem(aItem);
		}
		
		while(true) {
			
			System.out.println("Enter first letter of show, ");
			System.out.println("insert find or delete");
			
			int choice = getChar();
			
			switch(choice) {
			
				case 's':
					hashTable.displayTable();
					break;
				case 'i':
					System.out.println("Enter value to insert: ");
					aKey = getInt();
					hashTable.insertItem(new DataItem(aKey));
					break;
				case 'f':
					System.out.println("Entry value to find: ");
					aKey = getInt();
					DataItem found = hashTable.find(aKey);
					if (found == null) {
						System.out.println("can not found :" + aKey);
					} else {
						System.out.println("found value: " + aKey);
					}
					break;
				case 'd':
					System.out.println("Entry value to delete: ");
					aKey = getInt();
					
					DataItem item = hashTable.deleteItem(aKey);
					
					if (item != null) {
						System.out.println("delete value " + aKey);
					} else {
						System.out.println("can not found delete:" + aKey);
					}
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
