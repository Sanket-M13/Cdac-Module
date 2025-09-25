class LinkedListTotalNode{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data =d;
			next = null;
		}
	
	}
	
	void TotalElement(){
		Node temp = head;
		int total = 0;
		while(temp != null){
			total++;
			temp = temp.next;
		}
		System.out.println("\nTotal Nodes: "+ total);
		
	}
		void display(){
			Node temp = head;
			while(temp != null){
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
		}
	
	public static void main(String args[]){
		LinkedListTotalNode l1 = new LinkedListTotalNode();
		
		l1.head = new Node(10);
		l1.head.next = new Node(20);
		l1.head.next.next = new Node(30);
		l1.head.next.next.next = new Node(40);
		
		l1.display();
		l1.TotalElement();
	}
}