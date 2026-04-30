import java.util.TreeSet;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Words
{
   public static String text = "";
   public static TreeSet<String> words = new TreeSet<>();
   
   public static void main(String[] args)
   {
      readFile("TwinParadox.txt");
   }
   
   public static boolean readFile( String filename )
   {
      try
      {
         File f = new File(filename);
         Scanner scan = new Scanner(f);
         System.out.println( scan.nextLine() );
         return true;
      }catch( FileNotFoundException e )
      {
         return false;
      }
   }
   
   public static void displayAscending( String filename )
   {
   }
   
   public static void displayDescending( String filename )
   {
   }
}