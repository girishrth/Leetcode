package com.rathi.girish.leetcode;

public class RemoveLinkedListElement {

	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(3);
		listNode.next.next.next = new ListNode(4);
		printList(removeElements(listNode , 2));
	}
	
	public static void printList(ListNode listNode) {
		while(listNode != null) {
			System.out.println(listNode.val);
			listNode = listNode.next;
		}
	}

    public static ListNode removeElements(ListNode head, int val) {
    	if(head == null) return null;
    	
    	ListNode helper = new ListNode(0);
    	helper.next = head;
    	ListNode p = helper;
    	while(p.next != null) {
    		if(p.next.val == val){
    			p.next = p.next.next;
    		}else {
    			p = p.next;
    		}
    	}
    	
    	return helper.next;
    }
}

/*
 * class ListNode { int val; ListNode next;
 * 
 * ListNode(int x) { val = x; } }
 */
