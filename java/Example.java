class Example{
	int x = 10;
	int y = 20;
	static int i = 50;
	
	Example(){
		System.out.print("Variables: "+x+y+i);
	}
	
	
	public static void main(String args[]){
		Example e1 = new Example();
		System.out.print(e1);
		
		
	}
}