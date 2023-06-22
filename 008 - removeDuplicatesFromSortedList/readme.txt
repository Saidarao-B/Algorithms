Remove Duplicates from Sorted List

Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 

Example 1:
Input: head = [1,1,2]
Output: [1,2]


Example 2:
Input: head = [1,1,2,3,3]
Output: [1,2,3]
 

Constraints:
The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.

-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-

Solution:

package removeDuplicatesFromSortedList;

import linkedList.ListNode;


/*
 * @author Saidarao Boggavarapu
 */

public class RemoveDuplicatesFromSortedList {

	public ListNode deleteDuplicates(ListNode head) {
        ListNode lnHead = head;
        if(lnHead == null){
            return lnHead;
        }
        while(lnHead.next!=null){
            if(lnHead.val == lnHead.next.val){
                lnHead.next = lnHead.next.next;
            }else{
                lnHead= lnHead.next;   
            }
        }
        return head;

    }
}


---------------------------------------------------------------------------------------------------

package linkedList;

/*
 * @author Saidarao Boggavarapu
 */

public class ListNode {
	public int val;
	public ListNode next;
	public ListNode(){
		super();
	}
	public ListNode(int val){
		this.val = val;
	}
	public ListNode(int val, ListNode next){
		this.val = val;
		this.next = next;
	}
}

---------------------------------------------------------------------------------------------------

package linkedList;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Saidarao Boggavarapu
 */

public class SinglyLinkedList {
	private ListNode head;
	
	
	public SinglyLinkedList() {
		super();
	}

	public SinglyLinkedList(ListNode head) {
		super();
		this.head = head;
	}

	public ListNode getHead() {
		return head;
	}

	private ListNode tail() {
		ListNode tail = head; 
		
		while(tail.next != null){ 
			tail = tail.next; 
		} 
		return tail; 
	}

	public int length() { 
		int length = 0; 
		ListNode current = head; 
		while(current != null){ 
			length ++; 
			current = current.next; 
		}
		return length; 
	}
	
	public boolean isEmpty(){
		return length() == 0; 
	}
	
	
	public void append(int data){
		if(head == null){
			head = new ListNode(data);
			return; 
		} 
		tail().next = new ListNode(data);
	}
	
	public int[] linkedListToList(){
		List<Integer> list = new ArrayList<Integer>();
		ListNode current = head; 
		while(current != null){ 
			list.add(current.val);
			current = current.next; 
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
	
	public ListNode listToLinkedList(int[] list) {
		for(int i : list) {
			append(i);
		}
		return head;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		ListNode current = head; 
		while(current != null){ 
			sb.append(current.val+",");
			current = current.next; 
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append("]");
		return sb.toString();
	}
}


-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-

Test cases:

package removeDuplicatesFromSortedListTest;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import removeDuplicatesFromSortedList.RemoveDuplicatesFromSortedList;
import linkedList.SinglyLinkedList;


/*
 * @author Saidarao Boggavarapu
 */

class RemoveDuplicatesFromSortedListTest {
	
	SinglyLinkedList list = new SinglyLinkedList();
	SinglyLinkedList res = new SinglyLinkedList();
	RemoveDuplicatesFromSortedList remove = new RemoveDuplicatesFromSortedList();
	

	@Test
	public void test1() {
		list.listToLinkedList(new int[] {1,1,2});
		res.setHead(remove.deleteDuplicates(list.getHead()));
		assertEquals("[1,2]",res.toString());
	}
	
	@Test
	public void test2() {
		list.listToLinkedList(new int[] {1,1,2,3,3});
		res.setHead(remove.deleteDuplicates(list.getHead()));
		assertEquals("[1,2,3]",res.toString());
	}
	
	
	@Test
	public void test3() {
		list.listToLinkedList(new int[] {1,2,2,2,2,3,3,3,4,4});
		res.setHead(remove.deleteDuplicates(list.getHead()));
		assertEquals("[1,2,3,4]",res.toString());
	}
	
}
