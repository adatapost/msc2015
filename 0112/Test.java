package in.abc;

class Foo {
   int no;
}
class Test {
  public static void test1(Foo t) {
    t.no = 100;
  }
  public static void test2(Foo t) {
    t = new Foo();
    t.no = 200;
  }
  public static void main(String []args) {
      Foo a = new Foo();
      Foo b = new Foo();

      System.out.println(a.no); // 0
      test1(a);      
      System.out.println(a.no); // 100

      System.out.println(b.no); // 0
      test2(b);      
      System.out.println(b.no); // 0
  }
}