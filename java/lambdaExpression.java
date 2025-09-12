interface Greetings{
	void sayHello();
}

public class lambdaExpression{
	public static void main(String args[]){
		Greetings g = () -> System.out.println("Hello");
		g.sayHello();
	}
}