import java.lang.Math.*;

class Node{
int data;
Node left,right;
public Node(int val){
data = val;
}
}

class BT{
Node root;
public BT(int val){
root = new Node(val);
}
}


class Check_BalancedTree{

	public static int checkTree(Node c){
		if(c==null)
			return -1;
		if(c.left==null && c.right==null)
			return 0;
		
		int leftCnt = 1+checkTree(c.left);
		int rightCnt = 1+checkTree(c.right);

		int diff = leftCnt-rightCnt;
		if(diff < 0)	
			diff*=-1;
		if(diff>1)
			return 0;
		return 1;
	}	

	public static void main(String[] args){
		BT tree = new BT(10);
		tree.root.left = new Node(5);
		//tree.root.right = new Node(15);
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(7);
		//tree.root.right.left = new Node(12);
		//tree.root.right.right = new Node(17);
		System.out.println("Tree Balanced: "+checkTree(tree.root));	
	}
}