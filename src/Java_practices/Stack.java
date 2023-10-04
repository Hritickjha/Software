package Java_practices;

public class Stack {
	private int array[];
	private int top = -1;
	//Index of the entry
	Stack(int size){ array = new int[size];}
	void push(int n) {
		if(top == array.length-1) {
			System.out.println("stack is full !");
		}else {
			array[++top] = n;
		}
	}
	void pop() {
		if (top == -1) {
			System.out.println("stack is empty !");
		}else { array [top --] = 0;}
		}
	void printStack() {
		System.out.println("[");
		for(int i=0; i<=top; i++) {
			System.out.println(array[i]+",");
		}
		System.out.println("\b]");
	}
}
class  main{
	public static void main (String args[]){
		 Stack s = new Stack(3);
		//stack size 3
		s.printStack();
		s.pop();
		s.printStack();
		s.push(10);
		s.printStack();
		s.push(20);
		s.printStack();
		s.pop();
		s.printStack();
		s.push(30);
		s.printStack();
		s.push(40);
		s.printStack();
		s.push(50);
		s.printStack();
	}
}
