package in.abc;

public class Product {
   private int id;
   private String name;

   public Product(int id, String name) {
       this.id = id;
       this.name = name;
   }
   //getter & setters

   @Override
   public boolean equals(Object obj) {
      if(obj == null) return false;

     /*
      Product other = (Product) obj;
      if( id!=other.id) return false;
      if( !name.equals(other.name)) return false;
      return true;
      */

      //OR

       return hashCode() == obj.hashCode();
   }
 @Override
  public String toString() {
    return id + " " + name;
  }
 @Override
 public int hashCode() {
     return id + name.hashCode();
 }
}