class LinkedListInsertAtHead{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data =d;
			next = null;
		}
	
	}
	
	void insertAtHead(int d){
		Node new_Node = new Node(d);
		new_Node.next = head;
		head = new_Node;
		
	}
		void display(){
			Node temp = head;
			while(temp != null){
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
			
		}
	
	public static void main(String args[]){
		LinkedListInsertAtHead l1 = new LinkedListInsertAtHead();
		
		l1.head = new Node(10);
		l1.head.next = new Node(20);
		l1.head.next.next = new Node(30);
		
		System.out.println("Before Insertion");
		l1.display();
		
		l1.insertAtHead(5);
		System.out.println("\nAfter Insertion");
		l1.display();
		
		
		
		
		
	}
}