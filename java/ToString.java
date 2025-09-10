class Employee{
    String name;
    int id;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override   //Overridding toString() method
    // toString provides a String representation of an object 
    public String toString(){
        return name+" "+id;
    }
}

public class ToString {
    public static void main(String[] args) {
     
        System.out.println("Start");

        Employee e1 = new Employee("Arsh", 111);
        System.out.println(e1); //call to toString()
    }
}
