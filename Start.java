class Area {
     static void fun1(){
        System.out.println("blablabla");
    }
}



class Example {
    static  void fun1(){
    System.out.println("A");
    }
    static  void fun2(){
    System.out.println("b");
    }
    public static void main(String[] args) {
        System.out.println("ankit");
    Example.fun1 ();
    Example.fun2 ();
    Area.fun1();
    }
}