package in.abc;

public class Main {

    public static void main(String[] args) {
          Data<String> s1=new Data<>();
          Data<Integer> s2 = new Data<>();
          Data<Gujarati> s3=new Data<>();
          s1.setValue("Hello");
          s2.setValue(100);
          s3.setValue(new Gujarati());
          System.out.println(s1.getValue() + " " + s2.getValue());
          s3.getValue().speak();
    }
}
