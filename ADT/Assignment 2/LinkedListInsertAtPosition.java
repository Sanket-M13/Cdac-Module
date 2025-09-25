class LinkedListInsertAtPosition{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data =d;
			next = null;
		}
	
	}
	
	void insertAtPosition(int d, int n){
		Node new_Node = new Node(d);
		
		if(n == 0){
			new_Node.next = head;
			head = new_Node;
			return;
		}
		Node temp = head;
		for(int i=0; i< n-1; i++){
			
			if(temp == null){
				System.out.println("Out of bound");
			}
			temp = temp.next;
		}
		new_Node.next = temp.next;
		temp.next = new_Node;
		
	}
		void display(){
			Node temp = head;
			while(temp != null){
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
			
		}
	
	public static void main(String args[]){
		LinkedListInsertAtPosition l1 = new LinkedListInsertAtPosition();
		
		l1.head = new Node(10);
		l1.head.next = new Node(20);
		l1.head.next.next = new Node(30);
		l1.head.next.next.next = new Node(40);
		
		System.out.println("Before Insertion");
		l1.display();
		
		l1.insertAtPosition(25,2);
		System.out.println("\nAfter Insertion");
		l1.display();
		
		
		
		
		
	}
}