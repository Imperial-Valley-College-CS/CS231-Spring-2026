import java.util.Arrays;

public class GenericMethods
{
   public static void main(String[] args)
   {
      int x = max(2,8);
      System.out.println( x );
      double y = max(9.1, 1.3);
      System.out.println( y );
      String z = max("Minnesota", "Idaho");
      System.out.println( z );
      Videogame vi = new Videogame("Street Fighter", "8/30/1987", 38000000,"java");
      Videogame vv = new Videogame("Residental Evil 2", "1/21/1988", 39000000, "c++");
      Videogame vu = max(vi, vv);
      System.out.println( vu );
      
      Integer[] arr = {2, 8, 1, 3, 4, 9};
      Integer[] newArr = sort( arr );
      System.out.println( Arrays.toString(newArr) );
   }
   
   public static <E extends Comparable<E>> E max( E obj1, E obj2)
   {
      if( obj1.compareTo(obj2) > 0 )
         return obj1;
      return obj2;
   }
   
   public static <E extends Comparable<E>> E[] sort(E[] list)
   {
      for( int i = 1; i < list.length; i++ )
      {
         int j = i-1;
         E temp = list[i];
         while( j >= 0 && temp.compareTo(list[j]) < 0 )
         {
            list[j+1] = list[j];    //shift elements to right
            j--;
         }
         list[j+1] = temp;
      }
      return list;
   }
}