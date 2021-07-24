package com.doudou.list;

public class ReverseLinkedList {

}

/**
 * 迭代方式反转链表
 */
class ReverseLinkedListSolution1 {
    static ListNode reverseBetween(ListNode head) {
        // 双指针
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            // 取出当前结点的下一个结点
            ListNode next = curr.next;
            // 当前结点下一个结点指向前一位
            curr.next = prev;
            // 结点移动
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}