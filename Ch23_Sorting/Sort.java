public class Sort
{
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