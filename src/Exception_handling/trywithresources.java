package Exception_handling;

import java.io.FileReader;

class trywithresources {
    public static void main(String[] args){
        try(FileReader file = new FileReader("data.txt")){
            System.out.println(" File Opened ");
        }
        catch( Exception e){
            System.out.println("exception");
        }
    }
}