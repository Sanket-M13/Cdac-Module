//Linkedlist Implementation
class Node{
	int data;
	Node next;
	
	Node(int d){
		this.data =d;
		this.next = null;
	}
	
}
class Stack{
	Node head;
	Stack(){
		this.head = null;
	}
	
	boolean isEmpty(){
		return head == null;
	}
	
	void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	void pop(){
		if(isEmpty()){
			System.out.println("Stack Underflow");
			return;
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
		temp = null;
	}
	int peek(){
		if(isEmpty()){
			System.out.println("Stack Underflow");
			return 0;
		}else{
			return head.data;
		}
	}
	
	
}

public class StackDemo1{
	public static void main(String args[]){
		Stack s1 = new Stack();
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		
		System.out.println(s1.peek()+" : Peek element");
		s1.pop();
		// System.out.println(s1.pop()+" : Element Popped");
		System.out.println(s1.peek()+" : Peek element");
		
		
	}
}