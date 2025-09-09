class A{}

class B extends A{}

class ExceptionTryCatch{
	public static void main(String args[]){
		
		System.out.println("Start");
		
		A a = new A();
		try{
			B b = (B)a;
		}catch(ClassCastException e){
			System.out.println(e.getMessage());
			System.out.println("Invalid Downcasting");
		}finally{
			System.out.println("End");
			
		}
	}
	
}