package Multithreading;

class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println("Child Thread Started...");

        try {

            Thread.sleep(3000);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        System.out.println("Child Thread Finished...");

    }
}

public class ThreadMethodsDemo2 {

    public static void main(String[] args) throws InterruptedException {

        MyThread t = new MyThread();

        // isAlive() before start
        System.out.println("Before start : " + t.isAlive());

        // start()
        t.start();

        // isAlive() after start
        System.out.println("After start : " + t.isAlive());

        // join()
        t.join();

        // isAlive() after completion
        System.out.println("After join : " + t.isAlive());

    }
}