package Java_practices;

public class linkedlist {
	Node head; //head of list
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	public void display() {
		Node n = head;
		while( n != null) {
			System.out.print(n.data+"\n");
			n = n.next;
		}
	}
	public static void main(String[] args) {
		linkedlist list = new linkedlist();
		
		list.head = new Node(100);
		Node second = new Node(200);
		Node third = new Node(300);
		
		list.head.next = second;// Link first node with the second node
		second.next = third;// link first node with the second node
		list.display();		
	}
}

