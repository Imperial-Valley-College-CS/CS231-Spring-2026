public class ArrayList<E>
{
   private E[] arr = (E[])(new Object[2]);
   private int size = 0;
   
   public void add( E obj )
   {
      if( this.size == this.arr.length )
         resize();
         
      this.arr[size] = obj;
      size++;
   }
   
   private void resize()
   {
      E[] temp = arr;      //save arr in temp      
      this.arr = (E[])(new Object[2*this.size]);    //override arr to be twice bigger
         
      //copy elements from temp to arr
      for( int i = 0; i < temp.length; i++ )
         this.arr[i] = temp[i];
   }
   
   public void dispElements()
   {
      for( E elem: this.arr )
         System.out.println( elem );
   }
}