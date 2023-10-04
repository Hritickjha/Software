package Java_practices;

public class MethodExample {
	/* program execution always starts from the main method. That is form line 8 in this example.*/

	public static void display() {
		System.out.println("Hello world");
	}
	
	public static void main(String[] args) {
		display();//class the display method
		display();//calls it again.
		System.out.println("End.");
	}
}

