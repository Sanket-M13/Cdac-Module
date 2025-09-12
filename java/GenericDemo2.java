class Test<T>{
	T t1;
	Test(T t1){
		this.t1 = t1;
	}
	
	public T getData(){
		return this.t1;
	}
	
}

public class GenericDemo2 {
	public static void main(String args[]) {
	Test<Integer> to1 = new Test<>(15);
	System.out.println("Intdata="+to1.getData());
	
	Test<String> to2 = new Test<>("Learning Generics");
	System.out.println("Stringdata="+to2.getData());
	
	Test<Double> to3 = new Test<>(222.23456);
	System.out.println("Doubledata="+to3.getData());
	
	}
}
