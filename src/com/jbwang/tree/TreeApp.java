package com.jbwang.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeApp {

	public static void main(String[] args) throws IOException {
		
		int value;
		Tree tree = new Tree();
		
		tree.insert(50, 1.2);
		tree.insert(25, 1.2);
		tree.insert(75, 1.2);
		tree.insert(12, 1.2);
		tree.insert(37, 1.2);
		tree.insert(43, 1.2);
		tree.insert(30, 1.2);
		tree.insert(33, 1.2);
		tree.insert(87, 1.2);
		tree.insert(93, 1.2);
		tree.insert(97, 1.2);
		
		while(true) {
			
			System.out.println("Enter first letter of show, ");
			System.out.println("insert find delete or traverse.");
			
			int choice = getChar();
			
			switch(choice) {
			
				case 's':
					tree.displayTree();
					break;
				case 'i':
					System.out.println("Enter value to insert: ");
					value = getInt();
					tree.insert(value, value + 0.8);
					break;
				case 'f':
					System.out.println("Entry value to find: ");
					value = getInt();
					Node found = tree.find(value);
					if (found == null) {
						System.out.println("can not found :" + value);
					} else {
						found.displayNode();
					}
					break;
				case 'd':
					System.out.println("Entry value to delete: ");
					value = getInt();
					
					boolean delete = tree.delete(value);
					
					if (delete) {
						System.out.println("delete value " + value);
					} else {
						System.out.println("can not found delete:" + value);
					}
					
					
					break;
				case 't':
					System.out.println("Entrey type 1 2 or 3");
					value = getInt();
					tree.traverse(value);
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
