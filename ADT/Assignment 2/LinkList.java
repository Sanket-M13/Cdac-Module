class LinkList{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void insertAtlast(int data){
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		Node new_node= new Node(data);
		temp.next = new_node;
	}
	
	void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+ " -> ");
			temp = temp.next;
		}
	}
	
	public static void main(String args[]){
		LinkList l1 = new LinkList();
		l1.head = new Node(15);
		l1.head.next = new Node(25);
		l1.head.next.next = new Node(35);
		l1.insertAtlast(45);
		l1.insertAtlast(55);
		
		l1.display();
		
		
		
		
		
	}

}