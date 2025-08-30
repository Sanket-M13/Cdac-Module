class OOpClasses{
	int s = 32;
	int a;
	static int v = 21;
	
	OOpClasses(int b){
		a = b;
	}
	
	public static void main(String args[]){
		int c = 10;
		
		OOpClasses obj = new OOpClasses(c);
		System.out.print(obj.s);
		System.out.print(obj.a);
		v = c;
		System.out.print(v);
	}
}