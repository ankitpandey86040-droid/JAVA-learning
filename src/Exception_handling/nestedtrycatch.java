 public static void main( String [] args) {
    try{
        System.out.println("Outer Try Starts");
        try{
            int a = 10/0;

        }
        catch(ArithmeticException e){
            System.out.println("inner catch not divi" +
                    "3254\d" +
                    "]=[-   `1  34567-0[" +
                    "4ed ");
        }

        System.out.println(" outer try continues ");

    }
    catch(Exception e){
        System.out.println("outer catch starts  ");

    }
    System.out.println(" program ends ");
}

