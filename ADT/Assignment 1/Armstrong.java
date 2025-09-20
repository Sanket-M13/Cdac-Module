import java.util.*;
class Armstrong{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> num = new ArrayList<>();
		
		int original = n;
		int temp = n;
		int len = 0;

		while (temp > 0) {
		len++;
		temp /= 10;
		}

		for (int i = 0; i < len; i++) {
			int digit = n % 10;
			num.add(digit);
			n /= 10;
		}
		System.out.println(num);
		
		Iterator<Integer> it = num.iterator();
		int sum = 0;
		while(it.hasNext()){
			int mult = 1;
			int m = it.next();
			for(int i = 0; i< len; i++){
				mult *= m;
			}
			sum += mult;
		}
		if(sum == original){
			System.out.println(original+" is an Armstrong number");
		}else{
			System.out.println(original+ " is not an Armstrong number");	
		}
		
	}

}