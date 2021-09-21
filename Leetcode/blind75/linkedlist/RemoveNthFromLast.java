package Leetcode.blind75.linkedlist;

public class RemoveNthFromLast {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next == null)
            return head;

        ListNode curr = head;
        ListNode lateStart = head, prev = null;

        /**
         * Move FWD curr ptr untill n == 0 or curr == null
         */
        while(curr != null){
            if(n == 0)
                break;

            curr = curr.next;
            n--;
        }

        /**
         * if reached end of list for becoming n == 0
         * then n = len of list i.e. remove first from the list
         */
        if(curr == null)
            return head.next;

        /**
         * if curr has not yet reached till end
         * move lateStart from the start simultaneously with curr
         * until curr reaches end.
         * lateStart will now point to the node to be removed.
         */
        while(curr != null){
            prev = lateStart;
            curr = curr.next;
            lateStart = lateStart.next;
        }

        prev.next = lateStart.next;


        return head;
    }
}
