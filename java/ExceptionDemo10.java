
class ExceptionDemo10{
	
	void m1(){
		System.out.println("m1() : executed");
	}
	public static void main(String[] args){
		
		System.out.println("start");
		
		
		//Method 2 :throw
		try{
			System.out.println("aaaaaaa");
			
			//int i =i/0; : Method1 
			throw new ArithmeticException();//Method 2
			
			//ExceptionDemo10 d1 = null;
			throw new NullPointerException();//d1 = null;(background)
			
			//System.out.println("bbbbbb");
			
		}catch(NullPointerException e){
			e.printStackTrace();
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Bhai Resources ko release kar do!!!");
		}
		System.out.println("stop");
		
			
	}

}

