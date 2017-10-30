import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
//
//For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
//
//    1
//   / \
//  2   2
// / \ / \
//3  4 4  3
//But the following [1,2,2,null,3,null,3] is not:
//    1
//   / \
//  2   2
//   \   \
//   3    3
//Note:
//Bonus points if you could solve it both recursively and iteratively.

//Definition for a binary tree node.

//  public class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode(int x) { val = x; }
//  }


public class SymmetricTree {

	public static TreeNode createTree(){

		List<Integer> list = Arrays.asList(2,3,3,4,5,null,4);
		TreeNode root = new TreeNode(2);
		
		TreeNode n1   = new TreeNode(1);
		TreeNode n2   = new TreeNode(2);
		TreeNode n3   = new TreeNode(3);
		TreeNode n31   = new TreeNode(3);
		TreeNode n4   = new TreeNode(4);
		TreeNode n5   = new TreeNode(5);
		TreeNode n6   = new TreeNode(6);
		TreeNode n7   = new TreeNode(7);
		TreeNode n8   = new TreeNode(8);

		root.left  = n3;
		root.right = n31;

		n3.left  = n4;
		n3.right = n5;
		
		n31.left= null;
		n31.right= n4;

//		n11.right = n31;
//		n11.left  = n41;
//
//		n30.left = n50;
//		n31.right = n51;

		return root;
	}

	public static void main(String[] args) {

		System.out.println(isSymmetric (createTree()));

	}

	public static boolean isSymmetric(TreeNode root) {

		return twoTreeSymmetric(root, root);

	}

	private static boolean twoTreeSymmetric(TreeNode left, TreeNode right) {

		if (left == null && right == null){
			return true;
		}else if (left==null || right == null ){
			return false;
		}

		if (left.val == right.val){
			if(twoTreeSymmetric(left.left,right.right)){
				return twoTreeSymmetric(left.right,right.left);
			}else{
				return false;
			}
		}else{
			return false;
		}

	}




}
