public class ThreadDemo {
    public static void main(String[] args) {
        // Creating and starting a thread using Thread class
        MyThread t1 = new MyThread();
        t1.start();

        // Creating and starting a thread using Runnable interface
        MyRunnable r1 = new MyRunnable();
        Thread t2 = new Thread(r1);
        t2.start();
    }
}

// First way: extending Thread class
class MyThread extends Thread {
    public void run() {  // Note: method must be 'run', not 'Run'
        System.out.println("Thread is running using Thread class");
    }
}

// Second way: implementing Runnable interface
class MyRunnable implements Runnable {
    public void run() {  // Note: method must be 'run', not 'Run1'
        System.out.println("Thread is running using MyRunnable class");
    }
}