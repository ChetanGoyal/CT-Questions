package Chapter2;


public class Problem8 {

	private Node head;

	private static class Node {
		private Node next;
		private int value;

		Node(int value) {
			this.value = value;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem8 list = new Problem8();
		Node head = new Node(1);
		list.addToLast(new Node(2));
		list.addToLast(new Node(3));
		list.addToLast(new Node(4));
		list.addToLast(head);
		list.addToLast(new Node(7));
		list.addToLast(new Node(8));
		list.addToLast(new Node(9));
		list.addToLast(head);
		boolean result = list.loopExist();
		System.out.println(result);
		Node val = list.loopElement();
		System.out.println(val.value);

	}

	public void addToLast(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = node;
		}
	}
	
	public boolean loopExist() {
		Node fp = head;
		Node sp = head;
		
		while(fp!=null) {
			fp = fp.next;
			if(fp!=null && fp.next!=null) {
				fp = fp.next;
				sp = sp.next;
				if(fp== sp) {
					return true;
				}
			}
		}
		return false;
	}
	
	public Node loopElement() {

		Node fp = head;
		Node sp = head;
		while (fp != null) {
			fp = fp.next;
			if (fp != null && fp.next != null) {
				fp = fp.next;
				sp = sp.next;
				if (fp == sp) {
					break;
				}
			}
		}
		if(fp==null || fp.next==null) {
			return null;
		}
		sp = head;
		while(sp!=fp) {
			sp = sp.next;
			fp = fp.next;
		}
		return fp;
	}

}
