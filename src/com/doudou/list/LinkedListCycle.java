package com.doudou.list;

public class LinkedListCycle {

}

class LinkedListCycleSolution {
    static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        // 快慢指正
        ListNode slow = head;
        ListNode fast = head;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}

class CycleListNode {
    int val;
    ListNode next;

    CycleListNode(int x) {
        val = x;
        next = null;
    }
}

