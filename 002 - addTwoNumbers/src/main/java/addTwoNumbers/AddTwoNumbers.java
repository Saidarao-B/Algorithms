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
