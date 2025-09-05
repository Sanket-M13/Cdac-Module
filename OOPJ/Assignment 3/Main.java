class Shape{
	double area(){};
}

class Rectangle extends Shape{

	double length,breadth;
	
	Rectangle(double len, double breadth){
		this.length = len;
		this.breadth = breadth;
	}
	
	@Override
	double area(){
		return length * breadth;
	}
}

class Circle extends Shape{
	double radius;
	
	Circle(double radius) {
        this.radius = radius;
    }
	
	@Override
	double area(){
		return 3.14 * (radius * radius);
	}
	
}

class Main{
	public static void main(String args[]){
		Rectangle r1 = new Rectangle(5,10);
		
		System.out.println("Rectangle Area: "+ r1.area());
		
		Circle c1 = new Circle(7);
		
		System.out.println("Circle Area: "+ c1.area());
		
		
	}
	
}