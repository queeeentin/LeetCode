
public class MergeTwoSortedLists {

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */

	//Merge two sorted linked lists and return it as a new list. 
	//The new list should be made by splicing together the nodes of the first two lists.

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null && l2 == null){
			return null;
		}else if (l1 == null){
			return l2;
		}else if (l2 == null){
			return l1;
		}

		ListNode mergedList  = null;


		if (l1.val <= l2.val){
			mergedList = new ListNode(l1.val);
			l1 = l1.next;
		}else {
			mergedList = new ListNode(l2.val);
			l2 = l2.next;
		}
		ListNode headOfMergedList = mergedList;

		while (l1 != null || l2 != null){

			if (l1 != null && l2 != null){
				if (l1 == null && l2 != null) {
					mergedList.next = new ListNode(l2.val);
					l2 = l2.next;
				}else if (l2== null && l1 != null){
					mergedList.next = new ListNode(l1.val);
					l1 = l1.next;

				} else if (l1.val <= l2.val ){
					mergedList.next = new ListNode(l1.val);
					l1 = l1.next;
				}else{
					mergedList.next = new ListNode(l2.val);
					l2 = l2.next;
				}
				mergedList = mergedList.next;
				mergedList.next = null; 
			} 



		}
		return headOfMergedList; 
	}    	 
}



public static void main(String[] args) {
	MergeTwoSortedLists  ml = new MergeTwoSortedLists();
	System.out.println(ml.mergeTwoLists(null, null));





}

public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}


}

