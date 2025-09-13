class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i + ":" + Thread.currentThread().getName());
        }
    }
}

public class ThreadDemo5 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " Started");

        MyThread t1 = new MyThread();
        t1.setName("T1");

        MyThread t2 = new MyThread();
        t2.setName("T2");

        MyThread t3 = new MyThread();
        t3.setName("T3");

        MyThread t4 = new MyThread();
        t4.setName("T4");

        t1.start();
        t2.start();
        t3.start();

        // join(): Ensures that t3 thread completes execution before t4
        try {
            t3.join(); // waits for t3 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Executed...");
        }

        t4.start();

        System.out.println(Thread.currentThread().getName() + " Ended");
    }
}
