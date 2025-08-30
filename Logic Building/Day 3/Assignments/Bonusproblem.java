import java.util.Scanner;
class Bonusproblem{
		byte a;
        short b ;
        int c ;
        long d ;
        float e ;
        double f;
        char g;
        boolean h;

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Problem Number");
		System.out.println("Problem 1: Grade Evaluation System");
		System.out.println("Problem 2: Leap Year Check");
		System.out.println("Problem 3: Day of the week ");
		System.out.println("Problem 4: Identify Default Values of Variables");
		System.out.println("Case 5: Exit");
		int num = sc.nextInt();
		
		switch(num){
	case 1:
	System.out.println("Enter the subject Marks of Maths, Scince and History");
		int Maths = sc.nextInt();
		int Science = sc.nextInt();
		int History = sc.nextInt();
		
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
	break;
	case 2:
	System.out.println("Enter the year");
	    int year = sc.nextInt();
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			System.out.println(year+" is a leap year");
		}else{
			System.out.println(year + " is not a leap year");
		}
	break;
	case 3:
		System.out.println("Enter the Number of the day");
	    int day = sc.nextInt();
		switch(day){
		case 1:
		System.out.println("The day is Monday");
		break;
		case 2:
		System.out.println("The day is Tuesday");
		break;
		case 3:
		System.out.println("The day is Wednesday");
		break;
		case 4:
		System.out.println("The day is Thursday");
		break;
		case 5:
		System.out.println("The day is Friday");
		break;
		case 6:
		System.out.println("The day is Saturday");
		break;
		case 7:
		System.out.println("The day is Sunday");
		break;
		default:
		System.out.println("Invalid day number");
		}
	break;
	case 4:
		Bonusproblem obj = new Bonusproblem();
          System.out.println("byte: " + obj.a);
        System.out.println("short: " + obj.b);
        System.out.println("int: " + obj.c);
        System.out.println("long: " + obj.d);
        System.out.println("float: " + obj.e);
        System.out.println("double: " + obj.f);
        System.out.println("char: [" + obj.g + "]");
        // System.out.println("boolean: " + obj.h);

    
	break;
	default:
	System.out.println("Exited");
	}
	}

}