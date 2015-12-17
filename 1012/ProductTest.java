package in.abc;

public class ProductTest {
  public static void main(String []args){
   
     String str1 = "raj";
     String str2 = "raj";

     System.out.println(str1.hashCode() + " " + str2.hashCode());


    Product p1 = new Product(10,"Pencil");
    Product p2 = new Product(10,"pencil");

    if(p1.equals(p2)) {
       System.out.println("Eq");
    } else {
       System.out.println("Not Eq");
    }

   System.out.println(p1 + " " + p2);  
   
    System.out.println(p1.hashCode() + " " + p2.hashCode());
    if(p1.hashCode()>p2.hashCode() {
      //code
    }

  }
}