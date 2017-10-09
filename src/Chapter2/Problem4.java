package Chapter2;

public class Problem4 {
	private Node head;
	private static class Node{
		private int value;
		private Node next;
		
		Node(int value){
			this.value = value;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem4 list = new Problem4();
		Node head = new Node(3);
		list.addToLast(head);
		list.addToLast(new Node(5));
		list.addToLast(new Node(8));
		list.addToLast(new Node(5));
		list.addToLast(new Node(10));
		list.addToLast(new Node(2));
		list.addToLast(new Node(1));
		int x = 5;
		list.printList(head);
		Node partitionedList = list.linkedListPartition(head, x);
		list.printList(partitionedList);
	}
	
	public void addToLast(Node node) {
		if(head == null) {
			head = node;
		}
		else {
			Node temp = head;
			while(temp.next!=null)
				temp = temp.next;
			temp.next = node;
		}
	}
	
	public Node linkedListPartition(Node current,int val) {
		Node beforeStart = null;
		Node beforeEnd = null;
		Node afterStart = null;
		Node afterEnd = null;
		
		while(current!=null) {
			Node node = current.next;
			current.next = null;
			if(current.value<val) {
				if(beforeStart == null) {
					beforeStart = current;
					beforeEnd = beforeStart;
				}else {
					beforeEnd.next = current;
					beforeEnd = current;
				}
			}else {
				if(afterStart == null) {
					afterStart = current;
					afterEnd = afterStart;
				}
				else {
					afterEnd.next = current;
					afterEnd = current;
				}
			}
			current = node;
		}
		if(beforeStart == null) {
			return afterStart;
		}
		beforeEnd.next = afterStart;
		return beforeStart;
	}
	
	public void printList(Node current) {
		System.out.println("\n");
		while(current!=null) {
			System.out.println(current.value);
			current = current.next;
		}
	}

}
