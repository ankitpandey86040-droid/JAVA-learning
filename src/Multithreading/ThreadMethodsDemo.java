package Multithreading;

class MyThread1 extends Thread {

    @Override
    public void run() {

        try {

            Thread.sleep(2000);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

    }
}

public class ThreadMethodsDemo {

    public static void main(String[] args) throws InterruptedException {

        // currentThread()

        Thread current = Thread.currentThread();

        System.out.println(current);

        // getName()

        System.out.println("Default Name : " + current.getName());

        // setName()

        current.setName("Main Thread");

        System.out.println("New Name : " + current.getName());

        // sleep()

        System.out.println("Sleep Starts...");

        Thread.sleep(3000);

        System.out.println("Sleep Ends...");

        // isAlive()

        MyThread t = new MyThread();

        System.out.println("Before Start : " + t.isAlive());

        t.start();

        System.out.println("After Start : " + t.isAlive());

        // join()

        t.join();

        System.out.println("After Join : " + t.isAlive());

    }
}
