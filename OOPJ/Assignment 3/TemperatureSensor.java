class TemperatureSensor{
	private int temperature;
	
	void setTemperature(int T){
		if(T <=100 && T >= 0){
			this.temperature = T;
		}else{
			System.out.println("Temperature out of range");
		}
	}
	
	
	int getTemperature(){
		return temperature;
	}
	
	public static void main(String args[]){
	
		TemperatureSensor t1 = new TemperatureSensor();
		
		t1.setTemperature(80);
		System.out.println("Temperature = "+ t1.getTemperature());
	}
}