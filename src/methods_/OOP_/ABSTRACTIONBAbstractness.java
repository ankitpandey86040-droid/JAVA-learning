package methods_.OOP_;

abstract class vehicle {
    abstract void start();
}
class Car extends vehicle{
    @Override

     void start(){
        System.out.println(" starts with key");
    }
}
class Scooter extends vehicle{
        @Override
    void start(){
            System.out.println(" starts with kick");

        }
}    public class ABSTRACTIONBAbstractness {
 public static void main(String []args){
        vehicle v = new Scooter();
        v.start();
        vehicle c = new Car();
        c.start();
 }
}
