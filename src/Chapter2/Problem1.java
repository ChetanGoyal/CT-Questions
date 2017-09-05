package Chapter2;

import java.util.HashSet;

public class Problem1 {
	
	private Node head;
	private static class Node{
		private Node next;
		private int element;
		
		Node(int val){
			this.element = val;
		}
	}

	public static void main(String[] args) {
		Problem1 list = new Problem1();
		Node head = new Node(4);
		list.addToLast(head);
		list.addToLast(new Node(6));
		list.addToLast(new Node(1));
		list.addToLast(new Node(3));
		list.addToLast(new Node(2));
		list.addToLast(new Node(2));
		list.addToLast(new Node(3));
		list.addToLast(new Node(8));
		list.printList(head);
		list.RemoveDupValue(head);
		System.out.println("After removal");
		list.printList(head);
	}
	
	public void addToLast(Node node) {
		if(head == null) {
			head = node;
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public void RemoveDupValue(Node head) {
		Node previous = null;
		HashSet<Integer> set = new HashSet<>();
		while(head!=null) {
			if(set.contains(head.element)) {
				previous.next = head.next;
			}
			else {
				set.add(head.element);
				previous=head;
			}
			head = head.next;
		}
	}
	
	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.element);
			temp = temp.next;
		}
	}

}
