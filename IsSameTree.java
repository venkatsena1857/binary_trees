package binary_trees;

public class IsSameTree extends TreeNode {
	IsSameTree(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	public static void main(String xt[]){
		TreeNode tree = new TreeNode(1);
	    //tree.root = new Node(1);
	    // tree.insertUnder only for leaf nodes
	    tree.insertUnder(tree,1,2);
	    tree.insertUnder(tree,1,3);
	    tree.insertUnder(tree,2,4);
	    tree.insertUnder(tree,2,5);
	    tree.insertUnder(tree,3,6);
	    tree.insertUnder(tree,3,7);
	    tree.insertUnder(tree,4,8);
	    tree.insertUnder(tree,7,14);
	    
	    TreeNode tree1 = new TreeNode(1);
	    
	    tree1.insertUnder(tree1,1,2);
	  /*  tree1.insertUnder(tree1,1,3);
	    tree1.insertUnder(tree1,2,4);
	    tree1.insertUnder(tree1,2,5);
	    tree1.insertUnder(tree1,3,6);
	    tree1.insertUnder(tree1,3,7);
	    tree1.insertUnder(tree1,4,8);
	    tree1.insertUnder(tree1,7,14);*/
	   // tree1.printPreorder(tree);
	    
	    System.out.println(isSameTree(tree, tree1));
	}
	
	
public static boolean isSameTree(TreeNode p, TreeNode q){
		if(q == null || p == null){
			if(q == null  && p != null){
				return false;
			}
			if(p == null  && q != null){
				return false;
			}
			return true;
		}
		else{
			System.out.println(p.val+" and "+q.val);
		if(p.val==q.val){
			System.out.println("in if");
			return isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
		}
		else{
			return false;
		}	
		}
    }
}