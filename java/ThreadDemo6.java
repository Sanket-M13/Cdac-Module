class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i + ":" + Thread.currentThread().getName());
        }
		System.out.println(Thread.currentThread().getName()+" Sleeping...");
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" ");
    }
}

public class ThreadDemo6 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " Started");

        MyThread t1 = new MyThread();
        

        MyThread t2 = new MyThread();
       

        MyThread t3 = new MyThread();
       

        MyThread t4 = new MyThread();
       

        t1.start();
		t2.start();
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
		
		
        t3.start();
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
		t4.start();
       
        System.out.println(Thread.currentThread().getName() + " Ended");
    }
}
