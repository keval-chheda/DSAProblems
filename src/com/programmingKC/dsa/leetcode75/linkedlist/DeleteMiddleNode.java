package com.programmingKC.dsa.leetcode75.linkedlist;

//  Definition for singly-linked list.

public class DeleteMiddleNode {
	public ListNode deleteMiddle(ListNode head) {
		if (head == null || head.next == null)
			return null;
		ListNode slow = head, fast = head, prev = null;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			prev = slow;
			slow = slow.next;
		}
		prev.next = slow.next;

		return head;
	}

	// Helper method to print the list
	public static void printList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.val);
			if (current.next != null) {
				System.out.print(" -> ");
			}
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Create a sample list: 1 -> 2 -> 3 -> 4 -> 5
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		// Create an instance of DeleteMiddleNode
		DeleteMiddleNode solution = new DeleteMiddleNode();
		ListNode result = solution.deleteMiddle(head);

		// Print the resulting list
		printList(result);
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