class Mobile{
	String model;
	static int totalMobiles;
	
	Mobile(String model){
		this.model = model;
		totalMobiles++;
	}
	
	String getModel(){
		return model;
	}
	
	static void showTotalMobile(){
		System.out.println("Total mobile in stock: "+ totalMobiles);
	}
	
	
	public static void main(String args[]){
		Mobile mb1 = new Mobile("Samsung Galaxy M32");
		Mobile mb2 = new Mobile("Redmi Note 12");
		
		System.out.println("Mobile1 model: "+ mb1.getModel());
		System.out.println("Mobile1 model: "+ mb2.getModel());
		
		showTotalMobile();
	
	}
	
}