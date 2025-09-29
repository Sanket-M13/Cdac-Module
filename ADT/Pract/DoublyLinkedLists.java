class DoublyLinkedLists{
	static Node head;
	static class Node{
		int data;
		Node prev;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
			prev = null;
		}
}
		void insertAtBegning(int data){
			Node new_node = new Node(data);
			if(head == null){
				head = new_node;
			}else{
				new_node.next = head;
				head.prev = new_node;
				new_node.prev = null;
				head = new_node;
			}
		}
		void insertAtlast(int data){
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			Node newNode = new Node(data);
			temp.next = newNode;
			newNode.prev = temp;
		}
		
		void AtPsotion(int data, int position){
			if (position < 1) {
            System.out.println("Invalid position! Position must be >= 1.");
            return;
        }
		 Node newNode = new Node(data);
		 if (position == 1) {
            insertAtBegning(data);
            return;
        }
		
		Node temp = head;
		int currentpos = 1;
		
		while(temp!= null && currentpos < position -1){
			temp = temp.next;
			currentpos++;
		}
		 if (temp == null) {
            System.out.println("Position out of bounds!");
            return;
        }
		newNode.next = temp.next;
		newNode.prev = temp;
		
		if(temp!= null){
			temp.next.prev = newNode;
		}
		temp.next = newNode;
		}
	
	void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+ " -> ");
			temp = temp.next;
		}
	}
	

	public static void main(String args[]){
		DoublyLinkedLists dl = new DoublyLinkedLists();
		
		dl.head = new Node(10);
		dl.head.next = new Node(20);
		dl.insertAtBegning(40);
		dl.insertAtlast(45);
		dl.insertAtlast(78);
		dl.AtPsotion(98,3);
		dl.display();
		
	}
}			
