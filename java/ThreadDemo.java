class MyThread extends Thread{
	public void run(){
		for(int i = 0; i<5; i++){
			System.out.println(i+":"+Thread.currentThread().getName());
		}
	}
}

public class ThreadDemo{
	public static void main(String args[]){
		
		MyThread t1 = new MyThread();//Thread created
		// t1.setName("T1");//Assign name to thread
		
		MyThread t2 = new MyThread();//Thread created
		// t2.setName("T2");
		
		MyThread t3 = new MyThread();//Thread created
		// t3.setName("T3");
		
		MyThread t4 = new MyThread();//Thread created
		// t4.setName("T3");
		
		t1.start();//New --> Ready
		t2.start();
		t3.start();
		t4.start();
		
		
	}
}