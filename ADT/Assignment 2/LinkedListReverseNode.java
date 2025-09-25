class LinkedListReverseNode{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data =d;
			next = null;
		}
	
	}
	
	void reverse(){
		Node newHead = null;  
        Node temp = head;

        while (temp != null) {
            Node nextNode = temp.next; 
            temp.next = newHead;       
            newHead = temp;            
            temp = nextNode;          
        }

        head = newHead;
		
	}
		void display(){
		if (head == null) {
            System.out.println("(empty)");
            return;
        }
		
			Node temp = head;
			while(temp != null){
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
		}
	
	public static void main(String args[]){
		LinkedListReverseNode l1 = new LinkedListReverseNode();
		
		l1.head = new Node(10);
		l1.head.next = new Node(20);
		l1.head.next.next = new Node(30);
		l1.head.next.next.next = new Node(40);
		
		l1.display();
		l1.reverse();
		System.out.println();
		l1.display();
	}
}