import java.util.Scanner;

public class SortVideogames
{
   public static void main(String[] args)
   {
      Videogame v = 
         new Videogame("Minecraft", "11/18/2011", 300000000, "Java");
      Videogame vv = 
         new Videogame("Resident Evil 2", "9/30/1998", 4960000, "C++");      
      Videogame vi = 
         new Videogame("Super Smash Bros", "1/21/1999", 5550000, "C");
         
      Videogame[] videogames = {v, vv, vi};
      Videogame[] newArr = bubbleSort(videogames);
      
      for( Videogame vo : newArr )
         System.out.println(vo);
   }
   
   public static <E extends Comparable<E>> E[] bubbleSort( E[] arr )
   {
      boolean sorted = false;
      while( !sorted )
      {
         sorted = true;    //assume array is sorted
         for( int i = 0; i < arr.length-1; i++ )
         {
            if( arr[i].compareTo(arr[i+1]) > 0 )   //need to swap - sorted = false
            {
               sorted = false;
               E temp = arr[i];
               arr[i] = arr[i+1];
               arr[i+1] = temp;
            }
         }
      }
      return arr;
   }
}