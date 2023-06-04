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

	public void setHead(ListNode head) {
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
