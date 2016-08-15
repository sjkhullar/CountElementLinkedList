package org.learn.Client;

import org.learn.List.Node;
import org.learn.Question.CountElement;

public class App {
	public static void main(String[] args) {
		int[] data = { 10, 20, 10, 20, 50, 20, 50 };
		Node head = new Node(data[0]);
		for (int count = 1; count < data.length; count++)
			CountElement.insert(head, data[count]);

		System.out.printf("Linked list is : ");
		CountElement.print(head);

		int search = 10;
		int count = CountElement.countElement(head, search);
		System.out.printf("Element %d exists %d times in linked list", search, count);

		search = 20;
		count = CountElement.countElement(head, search);
		System.out.printf("\nElement %d exists %d times in linked list", search, count);

		search = 50;
		count = CountElement.countElement(head, search);
		System.out.printf("\nElement %d exists %d times in linked list", search, count);
	}
}