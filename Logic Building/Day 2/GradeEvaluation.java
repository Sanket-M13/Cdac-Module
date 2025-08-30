class GradeEvaluation{
     public static void main(String args[]){
		int Maths = 80;
		int Science = 85;
		int History = 90;
		
		int averageMarks = (Maths + Science + History)/3;
		
		if(averageMarks >= 90){
			System.out.println("Grade A");
		}else if(averageMarks > 70 && averageMarks <89){
			System.out.println("Grade B");
		}else if(averageMarks > 50 && averageMarks <69){
			System.out.println("Grade C");
		}else if(averageMarks > 30 && averageMarks < 49){
			System.out.println("Grade D");
		}else{
			System.out.println("Fail");
		}
		 
	 }
}