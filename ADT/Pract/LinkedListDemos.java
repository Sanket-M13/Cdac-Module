class LinkedListDemos{
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
		this.data = data;
		next = null;
		}
	}
	
	void insertAtFirst(int new_Data){
		
		Node new_Node = new Node(new_Data);
		new_Node.next = head;
		head = new_Node;
	}
	
	void insertAtLast(int data){
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		
		Node last_node = new Node(data);
		last_node.next = null;
		temp.next = last_node;
	}
	
	void insertInBetween(int data, int position){
		Node newNode = new Node(data);
		
		if(position == 1){
			newNode.next = head;
			head = newNode;
		}
		
		Node temp = head;
		int count = 1;
		while(temp != null && count < position -1){
			temp = temp.next;
			count++;
		}
		
		if(temp == null){
			System.out.println("Out of range");
			return;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
		
		
	}
	
	void display(){
		Node temp = head;
		
		while(temp != null){
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}
	
	public static void main(String args[]){
		
		LinkedListDemos l1 = new LinkedListDemos();
		
		l1.head = new Node(11);
		
		Node second = new Node(12);
		
		Node third = new Node(13);
		
		l1.head.next = second;
		second.next = third;
		
		l1.display();
		
		l1.insertAtFirst(15);
		
		System.out.println("\nInsert At first");
		
		l1.display();
		
		l1.insertAtLast(23);
		System.out.println("\nInsert At last");
		l1.display();
		
		l1.insertInBetween(500,3);
		System.out.println("\nInsert In between");
		l1.display();
		
		
		
		
	}
}