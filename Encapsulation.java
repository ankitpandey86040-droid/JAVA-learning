class Student{
    private String name;   // DATA HIDING


    public void setName(String name){     //   SETTER METHOD 
        this.name = name;
    }
   
    public String getName(){             //GETTER METHOD 
        return name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
      
        Student s1 = new Student();

        //s1.student= "ankit";   compile error Because data is hide with private variable
       
        s1.setName("ankit"); // SET VALUE 
        
        System.out.println(s1.getName());  // GET VALUE 
    }
}