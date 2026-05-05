import java.util.ArrayList;

public class Major
{
   //data fields
   private String abv, major, dept, school;
   private ArrayList<Course> courses;
   
   //constructor
   public Major(String a, String m, String d, String s)
   {
      this.abv = a; this.major = m; this.dept = d;
      this.school = s;
      this.courses = new ArrayList<>();
   }
   
   public ArrayList<Course> getCourses()
   {
      return this.courses;
   }
   
   public void setCourse( Course c )
   {
      this.courses.add(c);
   }
   
   @Override
   public String toString()
   {
      String info = this.school + " :: " + this.dept + " :: " + this.major + "\n";
      for( Course c : this.courses )
         info += c.toString() + "\n";
      return info;
   }
}