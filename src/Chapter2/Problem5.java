package Chapter2;

public class Problem5 {
	private Node head;
	private static class Node{
		private int value;
		private Node next;
		
		Node(int value){
			this.value = value;
		}
		Node(){
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem5 problem5 = new Problem5();
		Node head = new Node(6);
		problem5.addToLast(head);
		problem5.addToLast(new Node(1));
		problem5.addToLast(new Node(7));
		
		Node secondHead = new Node(2);
		problem5.addToLast(secondHead);
		problem5.addToLast(new Node(9));
		problem5.addToLast(new Node(5));
		
		problem5.addList(head, secondHead, 0);
		
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
	
	public Node addList(Node l1, Node l2, int carry) {
		if(l1==null && l2==null && carry == 0) {
			return null;
		}
		Node result = new Node();
		int value = carry;
		if(l1!=null) {
			value+=l1.value;
		}
		if(l2!=null) {
			value+=l2.value;
		}
		
		result.value = value%10;
		
		if(l1!=null || l2!=null) {
			Node node = addList(l1==null?null:l1.next, l2==null?null:l2.next, value>10?1:0);
		}
		return result;
	}

}
