package in.abc;

public class ExamSubjectTest {
   public static void main(String []args) {
      Subject guj = new Subject("Gujarati");
      Subject art = new Subject("Art");
      Subject maths = new Subject("Maths");

      Exam jan1 = new Exam("1-Jan-2016");
      Exam jan2 = new Exam("2-Jan-2016");
      Exam jan3 = new Exam("3-Jan-2016");

      ExamSubject []firstStd  = 
       {
           new ExamSubject(jan1,art,40),
           new ExamSubject(jan3,guj,40)
        };
     ExamSubject []secondStd  = 
       {
           new ExamSubject(jan1,maths,60),
           new ExamSubject(jan2,art,60),
           new ExamSubject(jan3,guj,60)
        };

    System.out.println("Time table : 1st Standard");
    for(ExamSubject e: firstStd) {
      System.out.println(e.getExam().getDate() + " " + e.getSubject().getName() + " " +  e.getTotalMarks());
    }

    System.out.println("Time table : 2nd Standard");
    for(ExamSubject e: secondStd) {
      System.out.printf("\n%-15s%-20s%-5d",
                     e.getExam().getDate(),
                     e.getSubject().getName(),
                     e.getTotalMarks());
    }
   }//End of  main
 



   public static void main1(String []args) {
         //Test - 1

        ExamSubject es = new ExamSubject();
        es.getExam().setDate("10-Jan-2016");
        es.getSubject().setName("Maths");
        es.setTotalMarks(30);
        System.out.println(es.getExam().getDate() + " " 
        + es.getSubject().getName() +  "  " + es.getTotalMarks());   

       //Test - 2
       Exam e = new Exam("10-Jan-2016");
       Subject s = new Subject("Maths");
       ExamSubject es1 = new ExamSubject();
       es1.setExam(e);
       es1.setSubject(s);  
       System.out.println(es1.getExam().getDate() + " " 
        + es1.getSubject().getName() +  "  " + es1.getTotalMarks());   
  
      //Test - 3
       ExamSubject es2 = new ExamSubject(e,s,40);
       
       System.out.println(es2.getExam().getDate() + " " 
        + es2.getSubject().getName() +  "  " + es2.getTotalMarks());   

      //Test - 4
       ExamSubject es3 = new ExamSubject(new Exam("11-Mar-2016"),new Subject("Chemistry"),140);
       
       System.out.println(es3.getExam().getDate() + " " 
        + es3.getSubject().getName() +  "  " + es3.getTotalMarks());   
     
   }
}