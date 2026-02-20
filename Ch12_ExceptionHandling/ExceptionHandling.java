import java.util.*;

public class ExceptionHandling
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      boolean validInput = false;
      while(!validInput)
      {
         System.out.print("How old are you? ");
         try
         {
            int age = scan.nextInt();            
            validInput = true;
         }catch(InputMismatchException e)
         {
            System.out.println( "Invalid Input. Try again.");
            scan.next();      //not sure why, but we need it
         }
      }
   }
}