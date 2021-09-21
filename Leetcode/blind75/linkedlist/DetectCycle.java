package Leetcode.blind75.linkedlist;

import Leetcode.blind75.linkedlist.ListNode;

public class DetectCycle {
    public boolean hasCycle(ListNode head) {

        if(head == null || head.next == null)
            return false;

        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while(true){

            slowPtr = slowPtr.next;

            if(fastPtr.next != null)
                fastPtr = fastPtr.next.next;
            else
                return false;

            if(slowPtr == null || fastPtr == null){
                return false;
            }

            if(slowPtr == fastPtr)
                return true;
        }
    }
}
