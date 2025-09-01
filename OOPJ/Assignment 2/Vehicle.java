class Vehicle{
	String regNo;
	String ownerName;
	String vehicleType;
	
	static int vehicleCount = 0;
	
	Vehicle(String ownerName, String vehicleType){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		
		vehicleCount++;
		
		this.regNo = "MH-2025-" + vehicleCount;
	}
	
	String getRegNo(){
		return regNo;
	}
	
	String getOwnerName(){
		return ownerName;
	}
	
	String getVehicleType(){
		return vehicleType;
	}
	
	public static void main(String args[]){
		Vehicle car1 = new Vehicle("Rohan", "Sedan");
		Vehicle car2 = new Vehicle("Jhon", "SUV");
		
		System.out.println("Owner Name: "+ car1.getOwnerName()+ " Registration No: " + car1.getRegNo() + " Vehicle type:  "+ car1.getVehicleType());
		System.out.println("Owner Name: "+ car2.getOwnerName()+ " Registration No: " + car2.getRegNo() + " Vehicle type:  "+ car2.getVehicleType());
		
		
		
		
	}
	
	
}