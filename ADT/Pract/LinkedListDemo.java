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
		System.out.print(temp.data+ " -> ");
		temp = temp.next;
	}
}	
	void insert(int new_data){
		Node newNode = new Node(new_data);
		newNode.next = head;
		head = newNode;		
}
	
	void append(int data){
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		
		Node newNode = new Node(data);
		temp.next = newNode;
		newNode.next = null;
		
	}
	
	void delete(int key){
		Node temp = head;
		Node prev = null;
		
		if(temp != null && temp.data == key){
			head = temp.next;
			return;
		}
		
		while(temp != null && temp.data != key){
			prev = temp;
			temp = temp.next;
		}
		if(temp == null)
			return;
		
		prev.next = temp.next;		
	}
	
	
	public static void main(String args[]){
		LinkedListDemo l1 = new LinkedListDemo();
		
		l1.head = new Node(12);
		
		Node second = new Node(13);
		Node third = new Node(14);
		
		l1.head.next = second;
		second.next = third;
		
		l1.append(15);
		l1.append(16);
		l1.append(17);
		
		l1.display();
		System.out.println();
		l1.delete(16);
		
		
		l1.display();
	}
}