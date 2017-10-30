import java.util.Arrays;
import java.util.List;

//Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.
//
//Example 1:
//Given tree s:
//
//     3
//    / \
//   4   5
//  / \
// 1   2
//Given tree t:
//   4 
//  / \
// 1   2
//Return true, because t has the same structure and node values with a subtree of s.
//Example 2:
//Given tree s:
//
//     3
//    / \
//   4   5
//  / \
// 1   2
//    /
//   0
//Given tree t:
//   4
//  / \
// 1   2
//Return false.


public class SubtreeOfAnotherTree {

	public TreeNode createTree(){

		TreeNode root = new TreeNode(1);

		TreeNode n1   = new TreeNode(1);
		TreeNode n11   = new TreeNode(1);
		TreeNode n2   = new TreeNode(2);
		TreeNode n3   = new TreeNode(3);
		TreeNode n31   = new TreeNode(3);
		TreeNode n4   = new TreeNode(4);
		TreeNode n5   = new TreeNode(5);
		TreeNode n6   = new TreeNode(6);
		TreeNode n7   = new TreeNode(7);
		TreeNode n8   = new TreeNode(8);

		root.left  = n1;
//		root.right = n4;

//		n3.left  = n1;
//		n3.right = n2;
//
//		n1.left=n31;
//		n1.right = n5;

		//		n31.left= null;
		//		n31.right= n4;

		//		n11.right = n31;
		//		n11.left  = n41;
		//
		//		n30.left = n50;
		//		n31.right = n51;

		return root;
	}


	private TreeNode createSubTree() {
		TreeNode root = new TreeNode(1);

		TreeNode n1   = new TreeNode(1);
		TreeNode n2   = new TreeNode(2);
		TreeNode n3   = new TreeNode(3);
		TreeNode n31   = new TreeNode(3);
		TreeNode n4   = new TreeNode(4);
		TreeNode n5   = new TreeNode(5);
		TreeNode n6   = new TreeNode(6);
		TreeNode n7   = new TreeNode(7);
		TreeNode n8   = new TreeNode(8);


//		root.left = n1;
//		root.right= n2;
//		
//		n1.left=n31;
//		n1.right = n5;

		return root;
	}

	public static void main(String[] args) {
		SubtreeOfAnotherTree sb = new SubtreeOfAnotherTree();
		TreeNode root = sb.createTree();
		TreeNode sub = sb.createSubTree();
		System.out.println(sb.isSubtree(root, sub));

	}


	public boolean isSubtree(TreeNode s, TreeNode t) {
		if(s == null && t == null){
			return true;
		}else if (s==null || t==null){
			return false;
		}
		
		
		if (sameTree(s, t)){
			return true;
		}else{
			return isSubtree(s.left, t) || isSubtree(s.right,t);
		}
		
		
	}

	public boolean sameTree(TreeNode s, TreeNode t){

		if (s==null && t== null){
			return true;
		}else if (s ==null || t== null){
			return false;
		}

		if(s.val == t.val){

			return (sameTree(s.left, t.left) && 
					sameTree(s.right,t.right));

		}else{
			return false;
		}
	}


}
