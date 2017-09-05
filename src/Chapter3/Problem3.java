package Chapter3;

import java.util.LinkedList;
import java.util.Stack;

public class Problem3 {

	private static final int STACK_SIZE = 3;
	private LinkedList<Stack<Integer>> list = new LinkedList<Stack<Integer>>();

	public void push(int item) {
		if (list.isEmpty() || list.getLast().size() >= STACK_SIZE) {
			Stack<Integer> stack = new Stack<>();
			stack.push(item);
			list.add(stack);
		} else {
			list.getLast().push(item);
		}
	}

	public Integer pop() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		Stack<Integer> last = list.getLast();
		int item = last.pop();
		if (last.isEmpty()) {
			list.removeLast();
		}
		return item;
	}

	public Integer popAt(int index) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List empty");
		}
		if (index < 0 || index >= STACK_SIZE) {
			throw new IllegalStateException("Invalid index");
		}
		int item = list.get(index).pop();
		for (int i = index; i < list.size() - 1; ++i) {
			Stack<Integer> curr = list.get(i);
			Stack<Integer> next = list.get(i + 1);
			curr.push(next.remove(0));
		}
		if (list.getLast().isEmpty()) {
			list.removeLast();
		}
		return item;
	}

	public void printStacks() {
		for (Stack<Integer> stack : list) {
			for (int item : stack)
				System.out.print(item + " ");
			System.out.println("[TOP]");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem3 setOfStacks = new Problem3();
		setOfStacks.push(1);
		setOfStacks.push(2);
		setOfStacks.push(3);
		setOfStacks.push(4);
		setOfStacks.push(5);
		setOfStacks.push(6);
		setOfStacks.push(7);
		setOfStacks.push(8);
		setOfStacks.push(9);
		setOfStacks.printStacks();
		System.out.println();
		setOfStacks.popAt(1);
		setOfStacks.popAt(0);
		setOfStacks.printStacks();
	}

}
