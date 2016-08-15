package org.learn.Question;

import org.learn.List.Node;

public class CountElement {

	public static int countElement(Node head, int search) {

		int elementCount = 0;
		// 1 -> 2 -> 3
		while (head != null) {
			if (head.data == search) {
				elementCount++;
			}
			head = head.next;
		}
		return elementCount;
	}

	public static void insert(Node head, int data) {
		while (head.next != null)
			head = head.next;
		head.next = new Node(data);
	}

	public static void print(Node head) {
		while (head != null) {
			System.out.printf("%d ", head.data);
			head = head.next;
		}
		System.out.println("");
	}
}
