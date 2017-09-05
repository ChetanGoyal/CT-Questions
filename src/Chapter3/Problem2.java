package Chapter3;

import java.util.Stack;

public class Problem2 {
	
	Stack<Integer> s;
	Integer minEle;
	
	Problem2(){
		s = new Stack<>();
	}
	
	public void push(Integer x) {
		if(s.isEmpty()) {
			minEle = x;
			s.push(x);
			return;
		}
		if(x<minEle) {
			s.push(2*x-minEle);
			minEle = x;
		}
		else {
			s.push(x);
		}
		
	}
	
	public void pop() {
		if(s.isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		Integer t = s.pop();
		if(t<minEle) {
			minEle = 2*minEle - t;
		}
		else {
			System.out.println(t);
		}
	}
	
	public void getMin() {
		if(s.isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Min Element is:" + minEle);
		}
	}

	public static void main(String[] args) {
		Problem2 stack = new Problem2();
		stack.push(4);
		stack.push(5);
		stack.push(8);
		stack.push(2);
		stack.push(9);
		stack.push(6);
		stack.push(1);
		stack.getMin();
		stack.pop();
		stack.pop();
		stack.getMin();
	}

}
