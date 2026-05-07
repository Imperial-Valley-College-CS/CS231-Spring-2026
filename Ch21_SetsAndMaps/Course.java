import java.util.ArrayList;

public class Course
{
   //data fields
   private String course, desc, school, ivcEquivalent;
   private ArrayList<Major> majors;
   private boolean articulates;
   
   //Constructor
   public Course(String c, String d, String s, String majors, boolean a, String e)
   {
      this.course = c; this.desc = d; this.school = s;
      this.ivcEquivalent = e; this.articulates = a;
      setMajors( majors );
   }
   
   public void setMajors( String m )
   {
   }
   
   
}