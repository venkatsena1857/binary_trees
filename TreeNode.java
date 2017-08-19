package binary_trees;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { this.val = x; }
	
	public void insertUnder(TreeNode root2, int i,int j) {
		// TODO Auto-generated method stub
		TreeNode dummy = new TreeNode(1000);
		if(root2 == null) return;
		else if(root2.val != i){
			insertUnder(root2.left,i,j);
			insertUnder(root2.right,i,j);
		}
		else if((root2.val == i)&&(root2.left != null)&&(root2.right != null)){
			dummy.val =j;
			dummy.right =root2.right;
			dummy.left = root2.left;
			root2.left = dummy;
			root2.right = null;
		}
		else if(root2.left ==null){
				root2.left = dummy;
				root2.left.val = j;
		}
		else if(root2.right ==null){
				root2.right = dummy;
				root2.right.val= j;
		}
	}
	
	public void printPreorder(TreeNode node)
    {
    	if(node == null)
    		return;
    	System.out.print(node.val+", ");
    	printPreorder(node.left);
    	printPreorder(node.right);
       
    }
}
