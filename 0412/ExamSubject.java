package in.abc;

public class ExamSubject {
  private Exam exam;
  private Subject subject;
  private int totalMarks;

  //getter
  public Exam getExam() { return exam; }
  public Subject getSubject() { return subject; } 
  public int getTotalMarks() { return totalMarks; }

  //setter
  public void setExam(Exam exam) { this.exam = exam; }
  public void setSubject(Subject subject) { this.subject = subject; }
  public void setTotalMarks(int totalMarks) { this.totalMarks = totalMarks; }

  //constructors
  public ExamSubject() {
    exam = new Exam();
    subject = new Subject();
    totalMarks = 100;
  }
  public ExamSubject(Exam exam, Subject subject, int totalMarks) {
    this.exam = exam;
    this.subject = subject;
    this.totalMarks = totalMarks;
  }
}//End