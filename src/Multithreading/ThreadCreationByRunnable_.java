package Multithreading;

public class ThreadCreationByRunnable_ {

        public static void main(String[] args) {

            Runnable task = new Runnable() {

                @Override
                public void run() {
                    System.out.println("Child Thread is Running...");
                }

            };

            Thread t = new Thread(task);

            t.start();

            System.out.println("Main Thread is Running...");
        }
    }

