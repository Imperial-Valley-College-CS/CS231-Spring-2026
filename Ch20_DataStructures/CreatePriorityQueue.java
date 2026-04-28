import java.util.Collections;
import java.util.ArrayList;

public class CreatePriorityQueue
{
   public static void main(String[] args)
   {
      ArrayList<Student> roster = new ArrayList<Student>();
      roster.add( new Student("Alex Ortiz",38) );
      roster.add( new Student("Oliva Marie",20) );
      roster.add( new Student("Pams Lopez",16) );
      roster.add( new Student("Bianca Rai",25) );
      
      Collections.sort( roster );
      for( Student s : roster )
         System.out.println( s );
   }
}