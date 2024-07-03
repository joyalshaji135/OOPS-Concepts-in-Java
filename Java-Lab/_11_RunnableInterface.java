// Define a class that implements Runnable
class MyRunnable implements Runnable {
    public void run() {
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + Thread.currentThread().getId() + " Count: " + i);
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class _11_RunnableInterface {
    public static void main(String[] args) {
        
        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();

        
        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);

       
        thread1.start();
        thread2.start();
    }
}
