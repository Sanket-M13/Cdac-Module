interface LandVehicle{
	void driveOnLand();
}

interface WaterVehicle{
	void driveOnWater();
}

class AmphibiousVehicle implements LandVehicle,WaterVehicle{
	String name;
	
	AmphibiousVehicle(String name){
		this.name = name;
		
	}
	
	@Override
	public void driveOnLand(){
		System.out.println(name+" Drive on land");
	}
	
	@Override
	public 
	void driveOnWater(){
		System.out.println(name+" Drive on Water");
	}
	
}
class VehicleTypesLandWater{
	public static void main(String args[]){
		AmphibiousVehicle a = new AmphibiousVehicle("HydroCar");
		
		a.driveOnLand();
		a.driveOnWater();
	}
}