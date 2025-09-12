class Generic<T,U>{
	T t1;
	U v1;
	
	Generic(T t, U u){
	this.t1 = t;
	this.v1 = u;
	}
	
	void show(){
		System.out.println(this.t1);
		System.out.println(this.v1);
	}
	
}
public class GenericDemo{
	public static void main(String args[]){
		Generic<Integer,String> t2 = new Generic<>(4,"Jam");
		
		t2.show();
	}
}