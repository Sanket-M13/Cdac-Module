interface Callable{
	void makeCall(String number);
}
interface Messaging{
	void send(String number, String message);
}
interface Internet{
	void browse(String website);
}

class SmartPhone implements Callable,Messaging,Internet{
	@Override
	public void makeCall(String num){
		System.out.println("Calling "+ num);
	}

	@Override
	public void send(String num, String message){
		System.out.println("Sending message to "+ num+ ": "+ message);
	} 
	
	@Override
	public void browse(String website){
		System.out.println("Browsing website: "+ website);
	} 
}

class SmartDevices{
	public static void main(String args[]){
		SmartPhone sp = new SmartPhone();
		sp.makeCall("9876543210");
		sp.send("8478751213","Hello!");
		sp.browse("www.google.com");
	}
}
