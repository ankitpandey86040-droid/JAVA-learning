 class Mohan{
    int x=2 ;        // instance(object ) member variable 
    int y ;
    void fun1(){                 // names = instance member function,non static fun, object member fun 
System.out.println("a");
    }
    void fun2(){
System.out.println("b");
    }
 }
 
 
 class object {
    public static void main(String []args){
        Mohan m1 = new Mohan();
        m1.fun1();
        m1.fun2();
        
        System.out.println(m1.y);
        System.out.println(m1.x);


    }
    
}
