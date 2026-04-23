import java.util.Queue;
import java.util.LinkedList;

public class Exchange
{
   private static Queue<Block> transactions = new LinkedList<>();
   
   public static void buy( int shares, int price )
   {
      Block block = new Block( shares, price );
      transactions.add( block );
   }

}