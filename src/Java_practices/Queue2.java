package Java_practices;

import java.util.Arrays;

public class Queue2 {
	static int arr[] = new int[3], head = 0,tail=-1;
	public static void main (String args[]) {
		enqueue(1); enqueue(2);
		dequeue(); enqueue(3);
		enqueue(4); dequeue();
		dequeue(); dequeue();
		enqueue(5);
	}
	public static void enqueue(int num) {
		if(tail == arr.length -1) {
			System.out.println("queue is full");
		}else {
			arr[++tail] = num;
			System.out.println(Arrays.toString(arr));
		}
	}
	public static void dequeue() {
		if(tail < head) {
			System.out.println("queue is empty");
		} else {
			arr[head] = 0;
			head++;
			System.out.println(Arrays.toString(arr));
		}
	}
}

