import java.util.*;
import java.io.*;

public class ReadUserAndPassword
{
   public static void main(String[] args)
   {
      File f = new File("UserAndPass.txt");      
      try
      {
         Scanner scan = new Scanner(f);
         String expectedUser = scan.nextLine();    //read from file
         String expectedPass = scan.nextLine();    //read from file
         
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a username: ");
         String user = input.nextLine();
         System.out.print("Enter a password: ");
         String pass = input.nextLine();
         
         
         System.out.println( expectedUser + " " + expectedPass);
      }catch( FileNotFoundException e )      //checked exception
      {
         System.out.println("File not found.");
      }
   }
}