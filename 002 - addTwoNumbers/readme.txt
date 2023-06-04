Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.



Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.




Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]




Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.

-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-

Solution:

package addTwoNumbers;

import linkedList.ListNode;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int extraDigit = 0;
        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;
        while(l1 !=null || l2 !=null){
            if(l1 != null){
                extraDigit += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                extraDigit += l2.val;
                l2 = l2.next;
            }
            l3.next = new ListNode(extraDigit%10);
            l3= l3.next;
            extraDigit /= 10;
        }
        if(extraDigit == 1){
            l3.next=new ListNode(1);
        }
        return dummy.next;
    }
}

---------------------------------------------------------------------------------------------------

package linkedList;

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

package addTwoNumbers;

import static org.junit.Assert.*;

import org.junit.Test;

import linkedList.SinglyLinkedList;

public class AddTwoNumbersTest {
	
	SinglyLinkedList l1 = new SinglyLinkedList();
	SinglyLinkedList l2 = new SinglyLinkedList();
	SinglyLinkedList res = new SinglyLinkedList();
	AddTwoNumbers add = new AddTwoNumbers();

	@Test
	public void test() {
		l1.listToLinkedList(new int[] {0});
		l2.listToLinkedList(new int[] {0});
		res.setHead(add.addTwoNumbers(l1.getHead(), l2.getHead()));
		
		assertEquals("[0]",res.toString());
	}
	
	@Test
	public void test2() {

		l1.listToLinkedList(new int[] {2,4,3});
		l2.listToLinkedList(new int[] {5,6,4});
		res.setHead(add.addTwoNumbers(l1.getHead(), l2.getHead()));
		
		assertEquals("[7,0,8]",res.toString());
	}
	
	
	@Test
	public void test3() {
		l1.listToLinkedList(new int[] {9,9,9,9,9,9,9});
		l2.listToLinkedList(new int[] {9,9,9,9});		
		res.setHead(add.addTwoNumbers(l1.getHead(), l2.getHead()));
		
		assertEquals("[8,9,9,9,0,0,0,1]",res.toString());
	}

	@Test
	public void test4() {
		l1.listToLinkedList(new int[] {1,1,1,1,1,1,1});		
		l2.listToLinkedList(new int[] {9,9,9,9,9,9,9});		
		res.setHead(add.addTwoNumbers(l1.getHead(), l2.getHead()));
		
		assertEquals("[0,1,1,1,1,1,1,1]",res.toString());
	}
}
