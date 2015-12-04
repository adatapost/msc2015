package in.abc;

public class Student {
   private int roll;
   private String name;
   //Method encapsulation - getter & setter

   public void setRoll(int roll) {
      if(roll>=1 && roll<=100) {
        this.roll = roll;
      }
   }
   public int getRoll() {  return roll; }
  
   public void setName(String name) {
      if(name == null) {
        this.name = "";
        return;
      }
      if(name.length()>=3 && name.length()<=30) {
        this.name = name;
      }
   }
  public String getName() {  return name; }
   
  //Constructors
   public Student() {
    roll = 1;
    name = "Not Set";
   }

   public Student(int roll, String name) {
       setRoll(roll);
       setName(name);
   }
}
