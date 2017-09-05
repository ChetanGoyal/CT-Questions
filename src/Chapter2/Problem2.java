package Chapter2;

public class Problem2 {
	
	private Node head;
	
	private static class Node{
		private Node next;
		private int value;
		
		Node(int value){
			this.value = value;
		}
	}

	public static void main(String[] args) {
		Problem2 list = new Problem2();
		Node head = new Node(4);
		list.addToLast(head);
		list.addToLast(new Node(1));
		list.addToLast(new Node(3));
		list.addToLast(new Node(5));
		list.addToLast(new Node(6));
		list.addToLast(new Node(8));
		list.printList(head);
		Node element = list.kthElementFromList(head, 3);
		System.out.println();
		System.out.println("Third element in the list is:" + element.value);
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
	
	public void printList(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public Node kthElementFromList(Node node, int k) {
		Node firstPointer, secondPointer ;
		firstPointer = secondPointer = head;
		
		for(int i=0;i<k;i++) {
			firstPointer = firstPointer.next;
		}
		
		while(firstPointer!=null) {
			secondPointer = secondPointer.next;
			firstPointer = firstPointer.next;
		}
		return secondPointer;
	}

}
