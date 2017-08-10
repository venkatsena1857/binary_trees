package binary_trees;

public class LeftLeavesSum {
	public static void main(String ag[]){
		BTreeNode head = new BTreeNode(1);
		BTreeNode.addNode(head,1,2,true);
		BTreeNode.addNode(head,1,3,false);
		BTreeNode.addNode(head,2,4,true);
		BTreeNode.addNode(head,2,5,false);
		BTreeNode.addNode(head,3,6,true);
		BTreeNode.addNode(head,3,7,false);
		BTreeNode.addNode(head,4,8,true);
		BTreeNode.addNode(head,4,9,false);
		//TreeNode.addNode(head,8,10,false);
	     
		System.out.println(leftLeavesSum(head));
		
	    }

	private static int leftLeavesSum(BTreeNode head) {
		boolean left = false;
		int sum = 0;
		sum = leftLeaveshelper(head,left,sum);
		return sum;
	}

	private static int leftLeaveshelper(BTreeNode head, boolean left,int sum) {
		if(head == null)
			return sum;
		
		if(head.left == null && head.right == null && left == true){
			return sum+head.val;
		}
		sum = leftLeaveshelper(head.left, true,sum);
		sum = leftLeaveshelper(head.right, false,sum);
		return sum;
		
	}

}
