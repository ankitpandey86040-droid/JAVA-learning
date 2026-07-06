import java.io.FileReader;
class Main{
    public static void main(String[] args){
        try(FileReader file = new FileReader("data.txt")){
            System.out.println(" File Opened ");
        }
        catch( Exception e){
            System.out.println("exception");
        }
    }
}