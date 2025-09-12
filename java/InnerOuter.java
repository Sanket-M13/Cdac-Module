import java.util.*;
import java.lang.reflect.*;

class Outer{
	
	int m = 5;
	static int x = 10;
	
	Outer(){}
	
	class Inner{
		int g = 100;
		Inner(){}
		void show(){
			System.out.println(m);
			System.out.println(x);
			System.out.println(g);
		}
	}
}

public class InnerOuter{
	public static void main(String args[]){
		Outer o1 = new Outer();
		
		Class<?> cls = o1.getClass();
		
		System.out.println(cls.getName());
		
		Outer.Inner in = o1.new Inner();
		
		
		Class <?> cls1 = in.getClass();
		
		System.out.println(cls1.getName());
		
		Constructor<?>[] m1 = Outer.class.getDeclaredConstructors();
		
		for(Constructor<?> m: m1){
			System.out.println(m.getName());
			
		}
		
		
		in.show();
	}
}