package binary_trees;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { this.val = x; }
	
	public static void addNode(TreeNode head, int target, int data, boolean left){
		if(head== null){
			return;
		}
		if(head.val == target){
			TreeNode temp = new TreeNode(data);
			if(left == true){
				head.left = temp;
			}
			else
				head.right = temp;
		}
		addNode(head.left,target, data, left);
		addNode(head.right,target, data, left);
	}
}
