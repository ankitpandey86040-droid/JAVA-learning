import java.util.Scanner;
 class inputscaneer {
    public static void main(String []args){
        Scanner SC1 = new Scanner(System.in);
        System.out.print(" NAM DAL NA : ");
        String name = SC1.nextLine();

        System.out.print("Enter the umaar : ");
        int age = SC1.nextInt();

        System.out.println(" name : "+name);
        System.out.println(" age : "+age);

    }
    
}
