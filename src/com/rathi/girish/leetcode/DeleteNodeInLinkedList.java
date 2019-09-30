package com.rathi.girish.leetcode;

public class DeleteNodeInLinkedList {

	public static void main(String[] args) {
	
	}
	
	public static void deleteNode(ListNode node) {
        while(node != null) {
        	if(node.next == null) break;
        	node.val = node.next.val;
        	if(node.next.next == null) node.next = null;
        	node = node.next;
        }
    }

}

/*
 * class ListNode { int val; ListNode next;
 * 
 * ListNode(int x) { val = x; } }
 */
