
class ExceptionDemo3{
	
	
	public static void main(String[] args){
		
		System.out.println("1: start");
		String arr[] = {"12","2"};
		
		try{
			String s1 = arr[0];//str
			String s2 = arr[11];//str: ArrayIndexOutOfBound Exception
			
			int i = Integer.parseInt(s1);//12
			int j = Integer.parseInt(s2);//2 : NumberFormatException
			int k = i/j;//throws Arithmetic Exception
			System.out.println(k);
		
		}catch(RuntimeException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}catch(Throwable e){
			e.printStackTrace();
		}finally{
			System.out.println("Yes, everything is fine!!!");
		}
		
		
		
		System.out.println("100: Completed");
			
	}

}

