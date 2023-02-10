package com.example.RomainP01.algorithmstraining.leetcode.medium;

import java.util.List;

public class AddTwoNumbers {
    public class ListNode {
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

    public ListNode createListNode(int[] arr){
        ListNode node = new ListNode(arr[arr.length-1]);
        for(int i=arr.length-2; i>=0; i--){
            node = new ListNode(arr[i], node);
        }
        return node;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
        String num1 = "";
        String num2 ="";
        boolean end1= false;
        boolean end2= false;
        while(!end1){
            num1 = node1.val +num1;
            if(node1.next == null ){
                end1 = true;
            }else{
                node1 = node1.next;
            }
        }
        while(!end2){
            num2 = node2.val +num2;
            if(node2.next == null ){
                end2 = true;
            }
            else{
                node2 = node2.next;
            }
        }
        Long n1 = Long.parseLong(num1);
        Long n2 = Long.parseLong(num2);
        Long nf = n1 + n2;
        String nff = ""+nf;
        String[] nfff = nff.split("");
        int [] arr = new int [nfff.length];
        for(int i=0; i<nfff.length; i++) {
            arr[i] = Integer.parseInt(nfff[nfff.length-1-i]);
        }
        return createListNode(arr);
    }

    //make the same without summing the numbers
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode node3 = new ListNode();
        ListNode node4 = node3;
        int carry = 0;
        while(node1 != null || node2 != null){
            int x = (node1 != null) ? node1.val : 0;
            int y = (node2 != null) ? node2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            node3.next = new ListNode(sum % 10);
            node3 = node3.next;
            if(node1 != null) node1 = node1.next;
            if(node2 != null) node2 = node2.next;
        }
        if(carry > 0){
            node3.next = new ListNode(carry);
        }
        return node4.next;
    }
}
