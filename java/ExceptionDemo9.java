
class ExceptionDemo9{
	
	void m1(){
		System.out.println("m1() : executed");
	}
	public static void main(String[] args){
		
		System.out.println("start");
		ExceptionDemo9 d1 = null;
		
		//Method 1 :try-catch-finally
		try{
			System.out.println("aaaaaaa");
			d1.m1();//NPE throw new NullPointerException();
			System.out.println("bbbbbb");
		}catch(Throwable e){
			e.printStackTrace();
		}finally{
			System.out.println("Bhai Resources ko release kar do!!!");
		}
		System.out.println("stop");
		
			
	}

}

