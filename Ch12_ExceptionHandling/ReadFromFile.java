import java.util.*;
import java.io.*;

public class ReadFromFile
{
   public static void main(String[] args)
   {
      File f = new File("HarryPotter.txt");
      try
      {
         Scanner scan = new Scanner(f);
         String data = "";
         while( scan.hasNextLine() )
            data += scan.nextLine() + "\n";
         System.out.println( data );
      }catch( FileNotFoundException e )      //checked exception
      {
         System.out.println("File not found.");
      }
   }
}