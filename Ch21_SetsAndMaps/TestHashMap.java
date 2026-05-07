import java.util.HashMap;

public class TestHashMap
{
   public static void main(String[] args)
   {
      HashMap<Integer, String> roster = new HashMap<>();
      roster.put(1, "Tim");
      roster.put(2, "Austin");
      roster.put(2, "Daniel");
      
      for( Integer i : roster.keySet() )
         System.out.println( roster.get(i) );
   }
}