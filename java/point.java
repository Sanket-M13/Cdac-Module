
class point1{
	
	static int x = 10;
}

class point{
	
	int x;
	String str;
	
	point() {
        this("Unknown", 45); // calls parameterized constructor
    }
	point(String str, int g){
		// this(g,str); //Chaining 
		this.x = g;
		this.str = str;
				
	}
	
	public static void main(String args[]){
		// point p = new point(54,"Hello"); 
		point p1 = new point();
		System.out.println(point1.x);
		// System.out.println(p.x + " "+ p.str);
		System.out.println(p1.x + " "+ p1.str);
	}
}