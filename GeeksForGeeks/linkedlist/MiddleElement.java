package GeeksForGeeks.linkedlist;

import Leetcode.blind75.linkedlist.ListNode;

public class MiddleElement {
    public static void printMiddleElement(ListNode head){
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }


        System.out.println(slowPtr.val);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        printMiddleElement(head);
    }
}
