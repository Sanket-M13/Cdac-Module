class LinkedListSearchNode{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data =d;
			next = null;
		}
	
	}
	
	void SearchAnElement(int n){
		Node temp = head;
		int index = 0;
		while(temp != null){
			index++;
			if(temp.data == n){
				System.out.println("\nElement fount at index "+index);
			}
			temp = temp.next;
		}
		
	}
		void display(){
			Node temp = head;
			while(temp != null){
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
		}
	
	public static void main(String args[]){
		LinkedListSearchNode l1 = new LinkedListSearchNode();
		
		l1.head = new Node(10);
		l1.head.next = new Node(20);
		l1.head.next.next = new Node(30);
		l1.head.next.next.next = new Node(40);
		
		l1.display();
		l1.SearchAnElement(30);
	}
}