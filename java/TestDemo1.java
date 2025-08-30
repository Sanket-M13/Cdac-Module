class Test{
	
}

class TestDemo1{
	
	{//Instance Block
		int x = 200;//Instance variable
			
	}
	
	int x2=100;
	void display(){
	}
	public static void main(String args[]){
		int x =201;
		System.out.println("Outside block before entry: " + x);
		
		{
			x = 20;//Local variable
			System.out.println("Inside block: " + x);
			//System.out.println("Inside block: " + x);
		}
		
		//System.out.println("Outside block: " + x);//Error: x scope khatam ho gaya hai
		System.out.println("Outside block: " + x);
		
	}
}