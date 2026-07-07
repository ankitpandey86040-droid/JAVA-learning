package Exception_handling;

public class trycatchexceptionhandling {

    public static void main(String[] args){
        System.out.println("Program Started");
        try{
            int a =10;
            int b=0;
            int result = (a/b);
            System.out.println(result);

        }
        catch( ArithmeticException e ){
            System.out.println("cannot divided by zero");

        }
        System.out.println("program end ");
    }
}
