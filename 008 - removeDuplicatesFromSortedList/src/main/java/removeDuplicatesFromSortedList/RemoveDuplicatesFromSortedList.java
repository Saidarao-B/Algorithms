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
