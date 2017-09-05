package Chapter3;

import java.util.Arrays;
import java.util.Stack;

public class Problem5 {
	
	public static Stack<Integer> sortStack(Stack<Integer> stack){
		Stack<Integer> result = new Stack<Integer>();
		
		while(!stack.isEmpty()) {
			int item = stack.pop();
			while(!result.isEmpty() && item<result.peek()) {   // [8, 7, 6, 5, 4, 3, 2, 1]
				stack.push(result.pop());
			}
			result.push(item);
		}
		return result;
	}

	public static void main(String[] args) {
		Integer[] a = {2,6,5,4,1,3,8,7};
        Stack<Integer> stack = new Stack<Integer>();
        stack.addAll(Arrays.asList(a));
        System.out.print(sortStack(stack));
	}

}
