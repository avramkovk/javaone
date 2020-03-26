package forTest.example;

public class Class3 {
    public static void main(String[] args) {
        Thread.currentThread().setName("Thread_main");

        OtherThread otherThread = new OtherThread();
        Thread threadRunnable = new Thread(new MyRunnable());

        threadRunnable.start();
        otherThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class OtherThread extends Thread {
    @Override
    public void run() {
        Thread.currentThread().setName("Thread_otherTread");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("Thread_myRunnable");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}