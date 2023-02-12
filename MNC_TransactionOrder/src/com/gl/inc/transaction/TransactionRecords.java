package com.gl.inc.transaction;


public class TransactionRecords {

	public static void main(String[] args) {
		
		/*  Given tree  
		        50
	            /\ 
	          30  60
	         /     \
	        10      55
	       
		 */
		Main tree = new Main();
	     tree.node = new Tree(50);
	     tree.node.leftNode = new Tree(30);
	     tree.node.rightNode = new Tree(60);
	     tree.node.leftNode.leftNode = new Tree(10);
	    tree.node.rightNode.leftNode= new Tree(55);
	    
	    Main.BstToSkewed(tree);
	    System.out.println("The transaction order is:");
	    Main.inOrder();
	}

}
