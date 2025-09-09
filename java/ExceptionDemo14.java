
class ExceptionDemo14{
	
	static void m3(){
		System.out.println("m3() : excutes");
		try{
			int i=1/0;
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		System.out.println("m3() : excutes : before");
	}
	static void m2(){
		System.out.println("m2() : excutes");
		m3();
		System.out.println("m2() : excutes : before");
	}
	static void m1(){
		System.out.println("m1() : excutes");
		m2();
		System.out.println("m1() : excutes : before");
	}
	static void m(){
		System.out.println("m() : excutes");
		m1();
		System.out.println("m() : excutes : before");
	}
	
	public static void main(String args[]){
		
	
	
	System.out.println("1");
	
	m();
	
	System.out.println("stop");
		
			
	}

}

