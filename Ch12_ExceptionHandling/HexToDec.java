public class HexToDec
{
   public static void main(String[] args)
   {
      try
      {
         long dec = hex2Dec("13F");
         System.out.println( dec );
      }catch( NumberFormatException e )
      {
         System.out.println("Invalid hex number.");
      }
   }
   
   public static long hex2Dec( String hex )
   {
      int i = hex.length()-1;
      int exp = 0;
      long sum = 0;
      
      while( i >= 0 )
      {
         char digit = hex.charAt(i);
         int coeff;
         if( digit >= '0' && digit <= '9' )
            coeff = digit - 48;
         else if( digit >= 'A' && digit <= 'F' )
            coeff = digit - 55;
         else
            throw new NumberFormatException();
            
         sum += coeff*Math.pow(16,exp);
         
         i--;
         exp++;         
      }
      return sum; 
   }
}