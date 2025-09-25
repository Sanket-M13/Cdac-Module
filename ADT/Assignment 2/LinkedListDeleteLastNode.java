class LinkedListDeleteLastNode{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data =d;
			next = null;
		}
	
	}
	
	void DeleteLastNode(){
		Node temp = head;
		while(temp.next.next != null){
			temp = temp.next;
		}
		
		temp.next = null;
		
	}
		void display(){
			Node temp = head;
			while(temp != null){
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
		}
	
	public static void main(String args[]){
		LinkedListDeleteLastNode l1 = new LinkedListDeleteLastNode();
		
		l1.head = new Node(10);
		l1.head.next = new Node(20);
		l1.head.next.next = new Node(30);
		l1.head.next.next.next = new Node(40);
		
		System.out.println("Before Deletion");
		l1.display();
		
		l1.DeleteLastNode();
		System.out.println("\nAfter Deletion");
		l1.display();
	}
}