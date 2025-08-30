class ArrayRealExample{
    public static void main(String[] args){
	  double []heights = {5.11,5.3,6,5.2,6.5,5.5,4.2,3.8,6.8};
	  int countofStudent = heights.length;
	  double sum = 0;
	  for(double ele: heights){
		  sum += ele;
	  }
	  double avg = sum/countofStudent;
	  System.out.println(avg);
	}
	
}