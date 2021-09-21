package Leetcode.blind75.linkedlist;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode reverseListRecurse(ListNode head){

        if(head == null || head.next == null)
            return head;

        ListNode temp = reverseListRecurse(head.next);
        head.next.next = head;
        head.next = null;

        return temp;
    }
}
