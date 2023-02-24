package com.example.RomainP01.algorithmstraining.datastructures.linkedlist;

import com.example.RomainP01.algorithmstraining.model.ListNode;

import java.util.List;

public class LinkedListCycle {



    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
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
