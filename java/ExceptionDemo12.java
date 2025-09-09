
class ExceptionDemo12{
	
	public static void main(String args[]){
		
	
	
	System.out.println("1");
		try{
			int i = 1/0;
		}catch(Exception e){
			System.out.println("2");
			e.printStackTrace();
			System.out.println("3");
			
			try{
				System.out.println("4");
				throw e;//Rethrowing of exception
			}catch(ArithmeticException e1){
				System.out.println("5");
				e.printStackTrace();
				System.out.println("6");
				throw e1;
			}
		}finally{
			System.out.println("Release resources");
		}
	
		System.out.println("stop");
		
			
	}

}

