package com.example.RomainP01.algorithmstraining.datastructures.linkedlist;

import com.example.RomainP01.algorithmstraining.model.ListNode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newOne = new ListNode(0);
        newOne.next = head;
        ListNode current = newOne;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return newOne.next;
    }
}
