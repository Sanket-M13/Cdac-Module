class Stackdemos{
	static int Max = 10;
	int top;
	
	int arr[] = new int[Max];
	
	Stackdemos(){
		top = -1;
	}
	
	boolean isEmpty(){
		return(top<0);
	}
	
	boolean isFull(){
		return (top>=Max-1);
	}
	
	boolean push(int n){
		if(isFull()){
			System.out.println("Overflow");
			return false;
		}else{
			arr[++top] = n;
			System.out.println(n+" Element Pushed");
			return true;
		}
	}
	
	int pop(){
		if(isEmpty()){
			System.out.println("Underflow");
			return 0;
		}else{
			int x = arr[top--];
			return x;
		}
	}
	
	void peek(){
		if(isEmpty()){
			System.out.println("Underflow");
		}else{
			System.out.println("Top element: "+ arr[top]);
		}
	}
	

	public static void main(String args[]){
		Stackdemos s1 = new Stackdemos();
		// s1.push(10);
		// s1.push(20);
		// s1.push(30);
		// s1.push(40);
		// s1.push(50);
		int p = s1.pop();
		// s1.peek();
		System.out.println(p+" : Element Popped");
		s1.peek();
		
		
	}
}