 class Animal {       // PARENT CLASS
    void eat(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{      ///CHILD CLASS
    
    void run(){
        System.out.println("bhag");
    }


public static void main(String[] args){
    Dog d = new Dog();
    d.eat();
    d.run();
            
}
}

