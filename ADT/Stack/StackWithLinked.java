
class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
		
}


class StackWithLinked{
	
    Node head;
	
	StackWithLinked(){
		this.head = null;
	}
	
	boolean isEmpty(){
		return (head == null);
	}
	
	void push(int data){
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	void pop(){
		if(isEmpty()){
			System.out.println("Undeflow!!");
		}else{
			Node temp = head;
			head = head.next;
			temp.next = null;
			temp = null;
		}
	}
	
	int peek(){
		if(isEmpty()){
			System.out.println("Undeflow!!");
			return 0;
		}else{
			return head.data;
		}
	}
	
	public static void main(String args[]){
		StackWithLinked s1 = new StackWithLinked();
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.push(60);
		
		System.out.println("Top element: "+ s1.peek());
		s1.pop();
		s1.pop();
		System.out.println("Top element: "+ s1.peek());

	}
}