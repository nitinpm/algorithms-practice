package Leetcode.blind75.linkedlist;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;

        ListNode result;

        if(l1.val < l2.val){
            result = l1;
            l1.next = mergeTwoLists(l1.next, l2);
        } else{
            result = l2;
            l2.next = mergeTwoLists(l1, l2.next);
        }

        return result;
    }
}
