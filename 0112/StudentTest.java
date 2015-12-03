package in.abc;

public class StudentTest {
 public static void main(String []args) {
       Student s = new Student();
       Address addr = new Address("Mehsana",384001);
       s.setRoll(10);
       s.setName("Raj");
       s.setPostalAddress(addr);
      // s.setLocalAddress(addr); 
      s.setLocalAddress(new Address("Pat",3333)); 

       System.out.println(s.getRoll() + " " + s.getName());
       System.out.println(s.getLocalAddress().getCity() + " " + s.getLocalAddress().getPin());
       System.out.println(s.getPostalAddress().getCity() + " " + s.getPostalAddress().getPin());
   }
 public static void main2(String []args) {
       Student s = new Student();
       s.setRoll(10);
       s.setName("Raj");
       s.setPostalAddress(new Address("Mumbai",4444));
       s.setLocalAddress(new Address("Visnagar",33333)); 

       System.out.println(s.getRoll() + " " + s.getName());
       System.out.println(s.getLocalAddress().getCity() + " " + s.getLocalAddress().getPin());
       System.out.println(s.getPostalAddress().getCity() + " " + s.getPostalAddress().getPin());
   }
   public static void main1(String []args) {
       Student s = new Student();
       s.setRoll(10);
       s.setName("Raj");
       s.getLocalAddress().setCity("Meh");
       s.getLocalAddress().setPin(444);
        s.getPostalAddress().setCity("Patan");
       s.getPostalAddress().setPin(33332);

       System.out.println(s.getRoll() + " " + s.getName());
       System.out.println(s.getLocalAddress().getCity() + " " + s.getLocalAddress().getPin());
       System.out.println(s.getPostalAddress().getCity() + " " + s.getPostalAddress().getPin());


   }
}