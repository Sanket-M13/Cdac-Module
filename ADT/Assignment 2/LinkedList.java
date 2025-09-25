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

	
	public static void main(String args[]){
		LinkedLis
	}
}