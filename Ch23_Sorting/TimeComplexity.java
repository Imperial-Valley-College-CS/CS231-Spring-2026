public class TimeComplexity
{
   String[] algorithms = {"merge", "insertion", "selection", "bubble"};
   
   public static void main(String[] args)
   {
      Number[][] bubbleSort = timeComplexity(3);
      
   }
   
   public static Number[][] timeComplexity(int algo)
   {
      Number[][] sortingData = new Number[5][2];   //{{1000, 0.1}, {2000, 0.18}, {4000, 0.24}...}
      
   }
   
   public static Integer[] generateArray(Integer size)
   {  
      Integer[] arr = new Integer[size];
      for( int i = 0; i < size; i++ )
         arr[i] = (int)((10*size+1)*Math.random());
      return arr;
   }
}