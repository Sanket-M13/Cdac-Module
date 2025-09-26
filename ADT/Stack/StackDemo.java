//Array Implementation
class Stack{
	static final int MAX = 10;
	int top;
	
	int a[] = new int[MAX];
	
	Stack(){
		top = -1;
	}
	
	boolean isEmpty(){
		return (top<0);
	}
	
	boolean isFull(){
		return (top >= MAX-1);
	}
	
	boolean push(int x){
		if(isFull()){
			System.out.println("Stack Overflow!!!");
			return false;
		}else{
			a[++top] = x;
			System.out.println(x+" : Element is pushed");
			return true;
		}
			
	}
	
	int pop(){
		if(isEmpty()){
			System.out.println("Stack UnderFlow");
			return 0;
		}else{
			int x =	a[top--];
			return x;
		}
		
	}
	
	int peek(){
		if(isEmpty()){
			System.out.println("Stack UnderFlow");
			return 0;
		}else{
			int x =	a[top];
			return x;
		}
	}		
}

public class StackDemo{
	public static void main(String args[]){
		Stack s1 = new Stack();
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		
		System.out.println(s1.pop()+" : Element Popped");
		System.out.println(s1.peek()+" : Peek element");
		
		
		
		
	}
}