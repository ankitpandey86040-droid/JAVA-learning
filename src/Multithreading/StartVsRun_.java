package Multithreading;

public class StartVsRun_ extends Thread {

    @Override
    public void run() {
        System.out.println("Child Thread is Running...");
    }

    public static void main(String[] args) {

        StartVsRun_ t = new StartVsRun_();

        // Method 1
        t.run();

        System.out.println("----------------");

        // Method 2
        t.start();
    }
}

