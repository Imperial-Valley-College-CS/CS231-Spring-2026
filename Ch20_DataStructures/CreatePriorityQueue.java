import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class CreatePriorityQueue
{
   public static void main(String[] args)
   {
      ArrayList<Student> roster = new ArrayList<Student>();
      //PriorityQueue<Student> roster = new PriorityQueue<>();
      roster.add( new Student("Alex Ortiz",38) );
      roster.add( new Student("Oliva Marie",20) );
      roster.add( new Student("Pams Lopez",16) );
      roster.add( new Student("Bianca Rai",25) );
      
      Comparator comp = new CompareNameAscending();
      Collections.sort( roster, comp );
      for( Student s : roster )
         System.out.println( s );
      
      System.out.println("******************************");  
      Comparator camp = new CompareNameDescending();
      Collections.sort( roster, camp );
      for( Student s : roster )
         System.out.println( s );
   }
   
   static class CompareNameAscending implements Comparator<Student>
   {
      @Override
      public int compare(Student s1, Student s2)
      {
         return s1.getName().compareTo(s2.getName());
      }
   }
   
   static class CompareNameDescending implements Comparator<Student>
   {
      @Override
      public int compare(Student s1, Student s2)
      {
         return s2.getName().compareTo(s1.getName());
      }
   }
}