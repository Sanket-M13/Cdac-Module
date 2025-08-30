class largestNum{
  public static void main(String args[]){
    int firstNum =  13;
	int SecondNum = 16;
	int ThirdNum = 15;
	
	if(firstNum >= SecondNum && firstNum >= ThirdNum){
	    System.out.println("First num is Largest");
	}else if(SecondNum >= firstNum && SecondNum >= ThirdNum){
	      System.out.println("Second num is Largest");
	}else{
	      System.out.println("Third num is Largest");
	}
  }
	
}