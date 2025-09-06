class Vehicle{
	
	void displaySpeed(){
		System.out.println("Vehicle speed unknown");
	}

}

class Car extends Vehicle{
	
	@Override
	void displaySpeed(){
		System.out.println("Car speed 120 km/h");
	}
}

class Bike extends Vehicle{
	
	@Override
	void displaySpeed(){
		System.out.println("Bike speed 80 km/h");
	}
}

class VehicleSpeedDisplay{
	public static void main(String args[]){
		Car c1 = new Car();
		c1.displaySpeed();
	    Bike b1 = new Bike();
		b1.displaySpeed();
	}
}