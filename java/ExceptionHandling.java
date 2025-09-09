class ExceptionHandling{

	public static void main(String args[]){
		String arr[] ={"1","2","3"};
		try{
			String s1 = arr[4];
			int i = 5/0;
		}catch(ArithmeticException e){
			System.out.println(e.getStackTrace());
		}catch(ArrayIndexOutOfBoundsException e1){
				System.out.println(e1.getMessage());
		}
		finally{
			System.out.println("Khatam");
		}		
	}
}