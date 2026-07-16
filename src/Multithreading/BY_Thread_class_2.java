package Multithreading;

import java.net.SocketOption;
import java.net.SocketTimeoutException;

class Mythread1 extends Thread{

    public void run(){

        System.out.println(" Ihave to go ");
    }

}

class Mythread2 extends Thread{
    public void run(){
        System.out.println("i have to rest");
    }

}
public class BY_Thread_class_2 {

    public static void main(String[] args){
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();

        t1.start();
        t2.start();

    }
}
