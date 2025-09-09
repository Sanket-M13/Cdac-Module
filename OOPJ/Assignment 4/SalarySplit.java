class SalarySplit{

	static void CalculateBonus(int bonus, int employee){
	
	try{
		int share = bonus / employee;
		System.out.println("Each employee gets: "+ share);
	}catch(ArithmeticException e){
		System.out.println("Error: Division by zero not allowed ");
	}
	}
	
	public static void main(String args[]){
		CalculateBonus(10000, 0);
	}
}