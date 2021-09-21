package Leetcode.blind75.linkedlist;

import Leetcode.blind75.linkedlist.ListNode;

public class FindStartOfCycle {

    public static ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode third = head;
        boolean foundLoop = false;

        while(true){
            slow = slow.next;

            if(fast.next != null)
                fast = fast.next.next;
            else
                break;

            if(slow == null || fast == null){
                break;
            }

            if(slow == fast){
                foundLoop = true;
                break;
            }
        }

       /* while(slow != null && fast.next != null){
            slow = slow.next;

            if(fast.next != null)
                fast = fast.next.next;

            if(slow == fast){
                foundLoop = true;
                break;
            }
        }*/

        if(foundLoop){
            while(slow != third){
                slow = slow.next;
                third = third.next;
            }
            return slow;
        } else{
            return null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        head = detectCycle(head);

        if(head == null)
            System.out.println("no cycle");
    }
}
