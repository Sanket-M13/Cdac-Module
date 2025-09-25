class LinkedListDeleteNodeByValue{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data =d;
			next = null;
		}
	
	}
	
	void DeleteNodeByValue(int n) {
    if (head == null) return; 

    
    if (head.data == n) {
        head = head.next;
        return;
    }

    Node temp = head;
    
    while (temp.next != null && temp.next.data != n) {
        temp = temp.next;
    }
    
    if (temp.next == null) return;

  
    temp.next = temp.next.next;
}
		void display(){
			Node temp = head;
			while(temp != null){
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
		}
	
	public static void main(String args[]){
		LinkedListDeleteNodeByValue l1 = new LinkedListDeleteNodeByValue();
		
		l1.head = new Node(10);
		l1.head.next = new Node(20);
		l1.head.next.next = new Node(30);
		l1.head.next.next.next = new Node(40);
		
		System.out.println("Before Deletion");
		l1.display();
		
		l1.DeleteNodeByValue(30);
		System.out.println("\nAfter Deletion");
		l1.display();
	}
}