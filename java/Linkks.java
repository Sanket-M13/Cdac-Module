class LinkedListDemo{
	Node head;
	
	static class Node{
	int data;
	Node next;
	
	Node(int n){
		this.data = n;
		this.next = null;
	}
}
	void display(){
	Node temp = head;
	while(temp != null){
		System.out.println(temp.data+ " -> ");
		temp = temp.next;
	}
	
	
	}

}

public class Linkks{

	public static void main(String args[]){
		LinkedListDemo l1 = new LinkedListDemo();
		
		l1.head = new Node(12);
		
		Node second = new Node(13);
		Node third = new Node(14);
		
		l1.head.next = second;
		second.next = third;
	}
}