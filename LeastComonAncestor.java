package binary_trees;

public class LeastComonAncestor {

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
		BTreeNode.addNode(head,8,10,false);
	     
		System.out.println(leastCommonAncestor(head, 8,6).val);
		
	    }

	private static BTreeNode leastCommonAncestor(BTreeNode head, int i, int j) {

		if(head == null|| head.val == i||head.val == j) return head;
		BTreeNode ans_left = leastCommonAncestor(head.left,i,j);
		BTreeNode ans_right = leastCommonAncestor(head.right,i,j);
		if(ans_left != null && ans_right != null)return head;
		if(ans_left != null){
			return ans_left;
		}
		return ans_right;
	}
	
	
}
