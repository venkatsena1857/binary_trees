package binary_trees;

public class BTreeNode {
	int val;
	BTreeNode left;
	BTreeNode right;
	public BTreeNode(int x){
		this.val = x;
	}
	BTreeNode(){
		
	}
	
	
	public static void addNode(BTreeNode head, int target, int data, boolean left){
		if(head== null){
			return;
		}
		if(head.val == target){
			BTreeNode temp = new BTreeNode(data);
			if(left == true){
				head.left = temp;
			}
			else
				head.right = temp;
		}
		addNode(head.left,target, data, left);
		addNode(head.right,target, data, left);
	}
	public static void main(String ag[]){
		BTreeNode head = new BTreeNode(1);
		addNode(head,1,2,true);
		addNode(head,1,3,false);
		addNode(head,2,4,true);
		addNode(head,2,5,false);
		addNode(head,3,6,true);
		addNode(head,3,7,false);
		addNode(head,4,8,true);
		addNode(head,4,9,false);
		addNode(head,8,10,false);
		
		System.out.println(head.val);
		System.out.println(head.left.val);
		System.out.println(head.right.val);
		System.out.println(head.left.left.left.right.val);
		System.out.println(head.right.right.val);
	}
}
