package com.jbwang.tree;

import java.util.Stack;

public class Tree {
	
	/**
	 * 根节点
	 */
	public Node root;
	
	public Tree() {
		root = null;
	}
	
	/**
	 * 通过key查找一个节点
	 * @param key
	 * @return
	 */
	public Node find(int key) {
		
		Node current = root;
		
		while(current != null && current.iData != key) {
			
			if(current.iData > key) {
				current = current.leftChild;
			} else if (current.iData <= key) {
				current = current.rightChild;
			}
			
			if(current == null) {
				return null;
			}
		}
		
		return current;
		
	}
	
	/**
	 * 插入一个节点
	 * @param node
	 */
	public void insert(int iData, double dData) {
		
		Node node = new Node(iData, dData);
		
		if(root == null) {
			root = node; 
		} else {
			//把根节点设置为当前节点
			Node current = root;
			//当前节点的父节点
			Node parent;
			
			while(true) {
				
				parent = current;
				
				if(iData < current.iData) {
					
					current = current.leftChild;
					
					if(current == null) {
						parent.leftChild = node;
						return;
					}
				} else {
					
					current = current.rightChild;
					
					if (current == null) {
						parent.rightChild = node;
						return ;
					}
					
				}
				
			}
		}
	}
	
	/**
	 * 删除一个节点
	 * @param key
	 */
	public boolean delete(int key) {
		
		//1. 查找到要删除的节点，并标记是左节点还是右节点
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;
		
		while(root != null && current.iData != key) {
			
			parent = current;
			
			if(key < current.iData) {
				isLeftChild = true;
				current = current.leftChild;
			} else {
				current = current.rightChild;
				isLeftChild = false;
			}
			
			if (current == null)
				return false;
		}
		
		//2.1 如果删除节点正好是最后一个节点
		if(current.leftChild == null && current.rightChild == null) {
			if(current == root) {
				root = null;
			}else if(isLeftChild) {
				parent.leftChild = null;
			} else {
				parent.rightChild = null;
			}
		}
		//2.2 如果要删除的节点的右子节点为空
		else if(current.rightChild == null) {
			
			if(current == root) {
				root = current.leftChild;
			} else if(isLeftChild) {
				parent.leftChild = current.leftChild;
			} else {
				parent.rightChild = current.leftChild;
			}
			
		}
		
		//2.3 如果要删除的节点的左子节点为空
		else if (current.leftChild == null) {
			if(current == root) {
				root = current.rightChild;
			} else if(isLeftChild) {
				parent.leftChild = current.rightChild;
			} else {
				parent.rightChild = current.rightChild;
			}
		} 
		
		//2.4 左右子节点都有
		else {
			Node successor = this.getSuccessor(current);
			
			if(current == root) {
				root = successor;
			} else if (isLeftChild) {
				parent.leftChild = successor;
			} else {
				parent.rightChild = successor;
			}
			
			successor.leftChild = current.leftChild;
			
		}
		return true;
	}
	
	/**
	 * 返回要删除节点的中序后继节点
	 * @param delNode
	 * @return
	 */
	private Node getSuccessor(Node delNode) {
		
		//后继节点的父节点
		Node successorParent = delNode;
		//后继节点
		Node successor = delNode;
		Node current = delNode.rightChild;
		
		//找到后继节点
		while(current != null) {
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		
		if(successor != delNode.rightChild) {
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		
		return successor;
	}
	
	public void traverse(int traverseType) {
		
		switch(traverseType) {
			
			case 1: //前序遍历
				System.out.println("\nPreorder traversal: ");
				this.preOder(root);
				break;
			case 2: //中序遍历
				System.out.println("\nInorder traversal: ");
				this.inOder(root);
				break;
			case 3: //后序遍历
				System.out.println("\nPostorder traversal: ");
				this.postOder(root);
				break;
		
		}
		
		System.out.println();
		
	}
	
	/**
	 * 后序遍历二叉树
	 * @param localRoot
	 */
	private void postOder(Node localRoot) {
		if(localRoot != null) {
			inOder(localRoot.leftChild);
			inOder(localRoot.rightChild);
			System.out.println(localRoot.iData + " ");
		}
		
	}
	
	/**
	 * 中序遍历二叉树
	 * @param localRoot
	 */
	private void inOder(Node localRoot) {
		if(localRoot != null) {
			inOder(localRoot.leftChild);
			System.out.println(localRoot.iData + " ");
			inOder(localRoot.rightChild);
		}
	}
	
	/**
	 * 前序遍历二叉树
	 * @param localRoot
	 */
	private void preOder(Node localRoot) {
		if(localRoot != null) {
			System.out.println(localRoot.iData + " ");
			inOder(localRoot.leftChild);
			inOder(localRoot.rightChild);
		}
		
	}
	
	/**
	 * 获得二叉树的最大深度
	 * @return
	 */
	public int getMaxDepth(Node roots) {
		
		roots = root;
		
		if (root == null) {
			return 0;
		}
		
		int left = getMaxDepth(roots.leftChild);
		int right = getMaxDepth(roots.rightChild);
		
		return Math.max(left, right) + 1;
		
	}
	
	
	public void displayTree() {
		
		Stack<Node> globalStack = new Stack<Node>();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println("...........................");
		
		while (!isRowEmpty) {
			
			Stack<Node> localStack = new Stack<Node>();
			isRowEmpty = true;
			
			for (int i = 0; i < nBlanks; i++) {
				System.out.println(" ");
			}
			
			while (!globalStack.isEmpty()) {
				
				Node temp = globalStack.pop();
				
				if(temp != null) {
					System.out.println(temp.iData);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);
					
					if(temp.leftChild != null || temp.rightChild != null)
						isRowEmpty = false;
					
				} else {
					System.out.println("---");
					localStack.push(null);
					localStack.push(null);
					
				}
				
				for (int i = 0; i < nBlanks*2 - 2; i++) {
					System.out.println(" ");
				}
			}
			System.out.println();
			nBlanks /= 2;
			while (!localStack.isEmpty()) {
				globalStack.push(localStack.pop());
			}
		}
		
		System.out.println("..............................");
		
	}
	
}
