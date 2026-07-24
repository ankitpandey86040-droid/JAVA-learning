package Multithreading;

class Counter {

    private int count = 0;

    // Synchronized Method
    public synchronized void increment() {

        count++;

        System.out.println(
                Thread.currentThread().getName() +
                        " -> Count = " + count);

    }

    public int getCount() {
        return count;
    }
}

class MyThread extends Thread {

    Counter counter;

    MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            counter.increment();

        }

    }
}

public class SynchronizationDemo1 {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count = " + counter.getCount());

    }
}