class Test{
	static int counter = 0;
	
	void show(){
		System.out.println("Additng counter:" +counter++);
		
	}
	
}

class TestDemo{
	int a;
	private String name;
	
	void display(){
		int x=100;
		System.out.println("Local variable="+x);
		System.out.println("a = "+a);
		System.out.println("Name = "+name);
		
		
	}
	void setnum(int num){//parameters (local scope)
		this.a = num;
		System.out.println("a = "+a);
		
	}
	
	
	public static void main(String args[]){
		TestDemo t1 = new TestDemo();
		t1.a = 100;
		t1.name = "Prajwal";
		t1.display();
		
		//System.out.println("Local variable="+x);//Error
		System.out.println(Test.counter);
		//Test.show();//Error: non-static method
		
		Test t2 = new Test();
		t2.show();
		
		t1.setnum(1000);
		t1.display();
		
		t1.setnum(2000);
		t1.display();
		
	}
}