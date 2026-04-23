import java.util.Collections;
import java.util.List;

public class CreatePriorityQueue
{
   public static void main(String[] args)
   {
      List<Student> roster = new ArrayList<>();
      roster.add( new Student("Alex Ortiz",38) );
      roster.add( new Student("Oliva Marie",20) );
      roster.add( new Student("Pams Lopez",16) );
      roster.add( new Student("Bianca Rai",25) );
      
      Collections.sort( roster );
      System.out.print( roster );
   }
}