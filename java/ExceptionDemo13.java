
class ExceptionDemo13{
	
	static void m3(){
		System.out.println("m3() : excutes");
		throw new ArithmeticException();
	}
	static void m2(){
		System.out.println("m2() : excutes");
		m3();
	}
	static void m1(){
		System.out.println("m1() : excutes");
		m2();
	}
	static void m(){
		System.out.println("m() : excutes");
		m1();
	}
	
	public static void main(String args[]){
		
	
	
	System.out.println("1");
	
	m();
	
	System.out.println("stop");
		
			
	}

}

