interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius; 
    }
}

class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

class ShapeAreaCalculator{
	public static void main(String args[]){
		Circle circle = new Circle(5);
		System.out.println("Circle Area ="+ circle.calculateArea());
		Rectangle rect = new Rectangle(10,5);
		System.out.println("Rectangle Area = " + rect.calculateArea());
		Square sq = new Square(4);
		System.out.println("Square Area = " + sq.calculateArea());
	}
}
