package com.gl.inc.transaction;

public class Main {
	
	public Tree node;
    public static Tree preNode = null;
    public static Tree currNode = null;
   
    // binary search tree into a skewed tree in increasing order
    public static void BstToSkewed(Main tree)
    {
    	BstToSkewed(tree.node);
    }
    static void BstToSkewed(Tree root)
    {
       
        // Base Case
        if(root == null)
        {
            return;
        }
        
        BstToSkewed(root.leftNode);
       
        Tree rightNode = root.rightNode;
       
        
        
        // Condition to check if the root Node
        // of the skewed tree is not defined
        if(currNode == null)
        {
            currNode = root;
            root.leftNode  = null;
            preNode = root;
        }
        else
        {
            preNode.rightNode = root;
            root.leftNode = null;
            preNode = root;
        }
       
        
        BstToSkewed(rightNode);
       
    }
    public static void inOrder()
    {
    	inOrder(currNode);
    }
    
    //traversal and printing skewed tree
	static void inOrder(Tree root)
    {
        if(root == null)
        {
            return;
        }
        
        if(root.rightNode!= null) {
        	System.out.print(root.val + " ->");
        } else {
        	System.out.print(root.val + " ");
        }
        
        inOrder(root.rightNode);       
    }

}
