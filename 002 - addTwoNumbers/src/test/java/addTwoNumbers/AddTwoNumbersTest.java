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
