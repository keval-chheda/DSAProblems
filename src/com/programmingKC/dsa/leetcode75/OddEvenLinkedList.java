package com.programmingKC.dsa.leetcode75;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}
}

public class OddEvenLinkedList {

	public static ListNode oddEvenList(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenHead = even; // Save head of even list

		while (even != null && even.next != null) {
			odd.next = even.next;
			odd = odd.next;

			even.next = odd.next;
			even = even.next;
		}

		odd.next = evenHead; // Connect end of odd list to even list
		return head;
	}

	// Helper to create a list from array
	public static ListNode createList(int[] arr) {
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;
		for (int val : arr) {
			current.next = new ListNode(val);
			current = current.next;
		}
		return dummy.next;
	}

	// Helper to print the list
	public static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + (head.next != null ? " -> " : ""));
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5 }; // You can change this to {2,1,3,5,6,4,7}
		ListNode head = createList(input);

		System.out.println("Original List:");
		printList(head);

		ListNode result = oddEvenList(head);

		System.out.println("Reordered List (Odd-Even):");
		printList(result);
	}
}
