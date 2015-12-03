package in.avd;

public class RectTest {

  //Test-1
  public static void test1() {
      Rect r = new Rect();
      r.getStart().setX(10);
      r.getStart().setY(20);
      r.getEnd().setX(200);
      r.getEnd().setY(400);
      System.out.println(r.getStart().getX() + " " 
           + r.getStart().getY() + " " 
           + r.getEnd().getX() + " " 
           + r.getEnd().getY());
  }

  //Test-2
  public static void test2() {
       Rect r = new Rect(new Point(10,20), new Point(200,400));
       System.out.println(r.getStart().getX() + " " 
           + r.getStart().getY() + " " 
           + r.getEnd().getX() + " " 
           + r.getEnd().getY());
  }
  //Test-3
  public static void test3() {
        Point p1 = new Point(10,20);
        Point p2 = new Point(200,400);
        Rect r = new Rect(p1,p2);
       System.out.println(r.getStart().getX() + " " 
           + r.getStart().getY() + " " 
           + r.getEnd().getX() + " " 
           + r.getEnd().getY());
   }
 //Test-4
 public static void test4() {
       Rect r = new Rect();
       r.setStart(new Point(10,20));
       r.setEnd(new Point(200,400));
        System.out.println(r.getStart().getX() + " " 
           + r.getStart().getY() + " " 
           + r.getEnd().getX() + " " 
           + r.getEnd().getY());
 }
 public static void main(String []args) {
     test1();
     test2();
     test3();
     test4();
  }
}//end of class RectTest