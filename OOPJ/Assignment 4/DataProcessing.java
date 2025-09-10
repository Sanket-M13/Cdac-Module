class DataProcessing{
	public static void main(String args[]){
		
		try{
			throw new ArithmeticException("Exception occurred: Invalid input");
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("Data Processing completed");
		}
	}
}