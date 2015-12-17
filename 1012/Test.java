package in.abc;

public class Test {
  public static void main(String []args) {
     String name1 = new String("Raj1");
     String name2 = new String("Raj");

     if(name1.equals(name2)) {
         System.out.println("Both strings are equal");
     } else {
         System.out.println("Unequal.");
     }

  }
}