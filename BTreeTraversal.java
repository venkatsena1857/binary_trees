package binary_trees;
import java.util.LinkedList;
import java.util.Queue;

// Java program for different tree traversals
 
/* Class containing left and right child of current
   node and key value*/
class Node
{
    int key;
    Node left, right;
 
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
 
public class BTreeTraversal extends BTreeNode
{
    // Root of Binary Tree

    Node root;
    BTreeTraversal()
    {
        root = null;
    }
    
	static int maxw =0;
 
    /* Given a binary tree, print its nodes according to the
      "bottom-up" postorder traversal. */
    void printPostorder(Node node)
    {
    	if(node == null)
    		return;
    	printPostorder(node.left);
    	printPostorder(node.right);
    	System.out.print(node.key+", ");
 
    }
 
    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(Node node)
    {
    	if(node == null)
    		return;
    	printInorder(node.left);
    	System.out.print(node.key+", ");
    	printInorder(node.right);
       
    }
 
    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(Node node)
    {
    	if(node == null)
    		return;
    	System.out.print(node.key+", ");
    	printPreorder(node.left);
    	printPreorder(node.right);
       
    }
 
 
    // Driver method
    public static void main(String[] args)
    {
    	
    	BTreeTraversal tree = new BTreeTraversal();
        tree.root = new Node(1);
        // tree.insertUnder only for leaf nodes
        tree.insertUnder(tree.root,1,2);
        tree.insertUnder(tree.root,1,3);
        tree.insertUnder(tree.root,2,4);
        tree.insertUnder(tree.root,2,5);
        tree.insertUnder(tree.root,3,6);
        tree.insertUnder(tree.root,3,7);
        tree.insertUnder(tree.root,4,8);
        tree.insertUnder(tree.root,7,14);
        tree.insertUnder(tree.root,7,15);
        tree.insertUnder(tree.root,8,16);
        tree.insertUnder(tree.root,8,17);
        tree.insertUnder(tree.root,17,18);
        tree.insertUnder(tree.root,17,19);
        //tree.insertUnder(tree.root,2,20);
        //tree.insertUnder(tree.root,2,21);
        
        
        
 
        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder(tree.root);
 
        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder(tree.root);
 
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder(tree.root);
        
        System.out.println("\nBFS traversal of binary tree is ");
        tree.printBFSearch(tree.root);
        
        System.out.println("\nMax height of tree is \n"+tree.maxHeight(tree.root));
        
        System.out.println("Max w is \n"+maxw);
        

        
        
        
    }

	private void insertUnder(Node root2, int i,int j) {
		// TODO Auto-generated method stub
		Node dummy = new Node(1000);
		if(root2 == null) return;
		else if(root2.key != i){
			insertUnder(root2.left,i,j);
			insertUnder(root2.right,i,j);
		}
		else if((root2.key == i)&&(root2.left != null)&&(root2.right != null)){
			dummy.key =j;
			dummy.right =root2.right;
			dummy.left = root2.left;
			root2.left = dummy;
			root2.right = null;
		}
		else if(root2.left ==null){
				root2.left = dummy;
				root2.left.key = j;
		}
		else if(root2.right ==null){
				root2.right = dummy;
				root2.right.key = j;
		}
	}

	private int maxHeight(Node root2) {
		// TODO Auto-generated method stub
		int ldepth = 0, rdepth= 0;
		if(root2 == null)
		return 0;
		else{
			ldepth = maxHeight(root2.left);
			rdepth = maxHeight(root2.right);
			
			if(ldepth > rdepth)
				return ldepth+1;
			else return rdepth+1;
		}
		
	}

	private void printBFSearch(Node root2) {
		// TODO Auto-generated method stub
		maxw = 0;
		Queue<Node> que = new LinkedList<Node>();
		if(root2 == null)
			return;
		que.add(root2);
		while(!que.isEmpty()){
			Node rem = que.remove();
			System.out.print(rem.key+", ");
			if(rem.left != null){
				que.add(rem.left);
			}
			if(rem.right != null){
				que.add(rem.right);
			}
			if(que.size() > maxw)
				maxw=que.size();
		}
		
		
		
	}
}