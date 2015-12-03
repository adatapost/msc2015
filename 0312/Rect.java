package in.avd;

public class Rect {
   private Point start,end;
   public Rect(){
       start = new Point();
       end = new Point();
   }
   public Rect(Point start, Point end) {
      this.start = start;
      this.end = end;
   }
   public Point getStart() { return start;}
   public Point getEnd() { return end;}
   public void setStart(Point start) { this.start = start; }
   public void setEnd(Point end) { this.end = end;}
}
