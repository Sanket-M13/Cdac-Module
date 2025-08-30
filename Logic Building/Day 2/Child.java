class Parent{

      public int age = 50;
	  public String name = "Papa";
	  public void print(){
		  System.out.println(age + name);
	  }
}

public class Child {
	
	public static void main(String args[]){
		Parent objParent = new Parent();
		objParent.print();
	}
}