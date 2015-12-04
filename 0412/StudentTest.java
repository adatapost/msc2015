package in.abc;

public class StudentTest {
   public static void main(String []args) {
       //Test-1
       Student s = new Student();
       s.setRoll(-40);
       s.setName("asdasd asdas d");
       System.out.println(s.getRoll() + " " + s.getName()); 

       //Test-2
       Student t = new Student(-20,"ASASDASD ASDASd asdasdasd asdasdasasdasdas");
        System.out.println(t.getRoll() + " " + t.getName()); 


   }
}