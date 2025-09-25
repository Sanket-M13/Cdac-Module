class LinkedListInsert{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data =d;
			next = null;
		}
	
	}
	
	void insert(int d){
		Node temp = head;
		
		while(temp.next != null){
			temp = temp.next;
		}
		
		Node new_Node = new Node(d);
		new_Node.next = null;
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
		LinkedListInsert l1 = new LinkedListInsert();
		
		l1.head = new Node(5);
		l1.head.next = new Node(10);
		l1.head.next.next = new Node(15);
		
		System.out.println("Before Insertion");
		l1.display();
		
		l1.insert(20);
		l1.insert(25);
		System.out.println("\nAfter Insertion");
		l1.display();
		
		
		
		
		
	}
}