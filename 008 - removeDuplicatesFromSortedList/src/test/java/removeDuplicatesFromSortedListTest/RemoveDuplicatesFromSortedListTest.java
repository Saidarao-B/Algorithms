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
