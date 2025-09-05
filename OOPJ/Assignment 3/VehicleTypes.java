class Vehicle {
    String brand;
    int speed;

    Vehicle(String b, int sp) {
        this.brand = b;
        this.speed = sp;
    }
}

class Car extends Vehicle {
    String modelType;

    Car(String brand, int sp, String modelType) {
        super(brand, sp);           
        this.modelType = modelType;
    }

    void display() {
        System.out.println("Car: " + brand + " " + modelType + " Speed = " + speed);
    }
}

class Bike extends Vehicle {
    String modelType;

    Bike(String brand, int sp, String modelType) {
        super(brand, sp);          
        this.modelType = modelType;
    }

    void display() {
        System.out.println("Bike: " + brand + " " + modelType + " Speed = " + speed);
    }
}

class VehicleTypes {
    public static void main(String args[]) {
        Car c1 = new Car("Honda", 180, "Civic");
        c1.display();

        Bike b1 = new Bike("Yamaha", 120, "R15");
        b1.display();
    }
}
