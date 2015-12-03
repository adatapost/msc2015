package in.abc;
public class Student {
  private int roll;
  private String name;
  private Address localAddress;
  private Address postalAddress;
 
  public Student() {
    roll = 0;
    name = "";
    localAddress = new Address();
    postalAddress = new Address();
  }

  public void setRoll(int roll) { this.roll=roll; }
  public int getRoll() { return roll;}

  public void setName(String name) { this.name = name;}
  public String getName() { return name;}

  public void setLocalAddress(Address localAddress) { 
     this.localAddress = localAddress;
  }
  public Address getLocalAddress() {
     return localAddress;
   } 
  public void setPostalAddress(Address postalAddress) { 
     this.postalAddress = postalAddress;
  }
  public Address getPostalAddress() {
     return postalAddress;
   } 
}