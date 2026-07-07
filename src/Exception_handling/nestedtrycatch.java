 public static void main( String [] args) {
    try{
        System.out.println("Outer Try Starts");
        try{
            int a = 10/0;

        }
        catch(ArithmeticException e){
            System.out.println("inner not divieded");
        }

        System.out.println(" outer try continues ");

    }
    catch(Exception e){
        System.out.println("outer catch starts  ");

    }
    System.out.println(" program ends ");
}

