package learn;

public class Stack {
	private int[] stack;
	private int capacity;
	private int top;

	Stack(int size) {
		this.stack = new int[size];
		this.capacity = 5;
		this.top = -1;
	}

	public void push(int item) {
		if (isFull()) {
			throw new RuntimeException("Stack overflow");
		} else {
			stack[++top] = item;
			System.out.println("Pushed : " + item);
		}
	}

	public void pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack underflow");
		} else {
			int item = stack[top--];
			System.out.println("Popped : " + item);
		}
	}

	public void peek() {
		if (isEmpty()) {
			throw new RuntimeException("Stack underflow");
		} else {
			System.out.println("top element is : " + stack[top]);
		}
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == capacity - 1;
	}

	public static void main(String[] args) {
		Stack myStack = new Stack(7);
		myStack.push(1);
		myStack.push(5);
		myStack.push(3);
		myStack.peek();
		myStack.pop();
		myStack.peek();
		myStack.pop();
		myStack.peek();
	}
}
