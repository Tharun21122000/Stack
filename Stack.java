class StackUnderFlow extends Exception {
	public String toString() {
		return "Stack is Empty";
	}
}

class StackOverFlow extends Exception {
	public String toString() {
		return "Stack is Full";
	}
}

public class Stack {
	public int size;
	public int top = -1;
	public int s[];

	public Stack(int i) {
		size = i;
		s = new int[size];
	}

	public void push(int i) throws StackOverFlow {
		if (top == size - 1)
			throw new StackOverFlow();
		top++;
		s[top] = i;
	}

	public int pop() throws StackUnderFlow {
		int x = -1;
		if (top == -1)
			throw new StackUnderFlow();
		x = s[top];
		top--;
		return x;
	}

	public static void main(String[] args) {

		Stack a = new Stack(5);

		try {
			a.push(19);
			a.push(2);
			a.push(66);
			a.push(44);
			a.push(32);
			a.push(24234);  // Stack is Full
		} catch (StackOverFlow e) {
			System.out.println(e);
		}
		
		try {
			a.pop();
			a.pop();
			a.pop();
			a.pop();
			a.pop();
			a.pop();
			a.pop();  // Stack is Empty
		} catch (StackUnderFlow e) {
			System.out.println(e);
		}

	}

}
