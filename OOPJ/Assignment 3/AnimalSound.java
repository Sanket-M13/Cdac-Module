abstract class Animal{
	abstract void makeSound();
}

class Dog extends Animal{
	@Override
	void makeSound(){
		System.out.println("Dog: Barks");
	}
}

class Cat extends Animal{
	@Override
	void makeSound(){
		System.out.println("Cat: Meow");
	}
}

class AnimalSound{
	 public static void main(String[] args){
		Dog d1 = new Dog();
		d1.makeSound();
		
		Cat c1 = new Cat();
		c1.makeSound();
		
	}
}