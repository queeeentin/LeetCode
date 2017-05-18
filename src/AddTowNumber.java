import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Element;

//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
//
//Subscribe to see which companies asked this question.

public class AddTowNumber {
	List<Integer> list1 = new ArrayList<Integer>();
    List<Integer> list2 = new ArrayList<Integer>();
    List<Integer> list = new ArrayList<Integer>();
    
	 

	public static void main(String[] args) {
		AddTowNumber atn = new AddTowNumber();
		// TODO Auto-generated method stub
		ListNode ln1 = new ListNode(8);
		ln1.next = new ListNode(9);
		ln1.next.next = new ListNode(9);
		
		
		ListNode ln2 = new ListNode(2);
//		ln2.next = new ListNode(1);
//		ln2.next.next = new ListNode(1);
//		ln2.next.next.next = new ListNode(10);
		
		ListNode returnList = atn.addTwoNumbers(ln1,ln2);
		
		System.out.println(returnList);

	}
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode nd = null;
	        
	        
	        while( l1 != null){
	        	int curValue = l1.val;
	        	list1.add(curValue);
	        	l1 = l1.next;
	        	System.out.println(list1);
	        }
	        
	        while(l2 != null){
	        	int curValue = l2.val;
	        	list2.add(curValue);
	        	l2 = l2.next;
	        	System.out.println(list2);
	        }
	        
	      
	        int maxindeces = Math.max(list1.size(), list2.size());
	        if (maxindeces == list1.size()){
	        	list = addLists(list2, list1);
	        	
	        }else{
	        	list = addLists(list1,list2);
	        	
	        }
	        
	        nd = new ListNode(list.get(0));
	        ListNode temp = nd;
	        for (int i = 1; i < list.size(); i++) {
	        	nd.next = new ListNode(list.get(i));
	        	nd = nd.next;

			}
	        
	        System.out.println(temp);
	       
	      
	        return temp;
	    }
	 
	 public List<Integer> addLists (List<Integer> listWithFewerItem, List<Integer> listWithMoreItem ){
		 for (int i =0; i <listWithFewerItem.size() ;i++){
     		Integer value = listWithFewerItem.get(i) + listWithMoreItem.get(i);
     		if (value>=10){
     			if (i>=listWithMoreItem.size()-1)
     			{
     				listWithMoreItem.add(0);
     			}
     			int next = listWithMoreItem.get(i+1)+1;
     			listWithMoreItem.set(i+1, next);
     			
     		}
     		value = value%10;
     		listWithMoreItem.set(i, value);
		 }
		 for (int i = 0; i < listWithMoreItem.size(); i++) {
			int itemValue = listWithMoreItem.get(i);
			if (itemValue >=10){
				if (i>=listWithMoreItem.size()-1)
     			{
     				listWithMoreItem.add(0);
     			}
				itemValue = itemValue%10;
				int next = listWithMoreItem.get(i+1)+1;
     			listWithMoreItem.set(i+1, next);
				listWithMoreItem.set(i, itemValue);
				
			}
			
		}
		 System.out.println(listWithMoreItem);
		 return listWithMoreItem;
	 }
	
}

