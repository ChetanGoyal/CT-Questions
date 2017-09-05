package Chapter3;

import java.util.Stack;

public class Problem4 {
	Stack<Integer> s;
	Stack<Integer> temp;
	
	public Problem4() {
		s = new Stack<>();
		temp = new Stack<>();
	}
	
	public void push(int data) {
		if(s.isEmpty()) {
			s.push(data);
		}
		else {
			int l = s.size();
			for(int i=0;i<l;i++) {
				temp.push(s.pop());
			}
			s.push(data);
			for(int i=0;i<l;i++) {
				s.push(temp.pop());
			}
		}
	}
	
	public int remove() {
		if(s.isEmpty())
			throw new IllegalStateException("Queue empty");
		return s.pop();
	}
	
	public int peek() {
		if(s.isEmpty())
			throw new IllegalStateException("Queue empty");
		return s.peek();
	}
	
	public void display()
    {
        System.out.print("\nQueue = ");
        int l = s.size();
        if (l == 0)
            System.out.print("Empty\n");
        else
        {
            /* Iterator wont return for stack in order */            
            for (int i = l - 1; i >= 0; i--)
                System.out.print(s.get(i)+" ");                
            System.out.println();
        }
    }

	public static void main(String[] args) {
		Problem4 list = new Problem4();
		list.push(1);
		list.push(4);
		list.push(5);
		list.push(2);
		list.push(7);
		list.push(10);
		list.display();
		list.remove();
		list.display();
	}

}
