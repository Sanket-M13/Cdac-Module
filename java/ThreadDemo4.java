class Add implements Runnable{
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName());
		int sum = 0;
		for(int i = 0; i<20; i++){
			sum+=i;
		}
		System.out.println("Sum = "+sum+Thread.currentThread().getName());
	}
}

class Multiply implements Runnable{
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName());
		int rest = 1;
		for(int i = 1; i<10; i++){
			rest *= i;
		}
		System.out.println("Result = "+rest+Thread.currentThread().getName());
		
	}
}

public class ThreadDemo4{
	public static void main(String args[]){
		Thread t1 = new Thread(new Add(),"T1");
		Thread t2 = new Thread(new Multiply(),"T2");
		t1.start();
		t2.start();
		
		//Using Anonymous Runnable class
		
		Thread t3 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName()+"Started");
			int res= 0;
			for(int i =0; i<20;i++){
				if(i%2==0)
					res += i;
			}
			System.out.println(" Even Result = "+res+Thread.currentThread().getName());
		}," T3-Even ");
		t3.start();
	}

}