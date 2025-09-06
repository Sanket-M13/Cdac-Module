abstract class Shape{
	abstract void draw();
}

class Circle extends Shape{
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	void draw(){
		System.out.println("Drawing Circle of radius "+ radius);	
	}
}

class Rectangle extends Shape{
	double length;
	double breadth;
	
	Rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	void draw(){
		System.out.println("Drawing Rectangle of length "+ length +" and breadth "+ breadth);	
	}
}

class ShapeDrawing{
	public static void main(String args[]){
		Circle c = new Circle(7);
		c.draw();
		
		Rectangle r = new Rectangle(5,10);
		r.draw();
	}
}