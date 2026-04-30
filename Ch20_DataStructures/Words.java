import java.util.TreeSet;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Words
{
   public static String text = "";
   public static TreeSet<String> words;
   
   public static void main(String[] args)
   {
      displayAscending("TwinParadox.txt", 1);      //0-ascending, 1-descending
   }
   
   public static boolean readFile( String filename )
   {
      try
      {
         File f = new File(filename);
         Scanner scan = new Scanner(f);
         text = scan.nextLine();
         return true;
      }catch( FileNotFoundException e )
      {
         System.out.println( filename + " not found." );
         return false;
      }
   }
   
   public static void displayAscending( String filename, int i )
   {
      readFile(filename);
      if( i == 1 )
         words = new TreeSet<>(Collections.reverseOrder() );
      else
         words = new TreeSet<>(); 
         
      String[] tokens = text.split("\\W+");
      for( String s : tokens )
         words.add( s.toLowerCase() );
         
      while( !words.isEmpty() )
         System.out.println( words.pollFirst() );
   }
   
   public static void displayDescending( String filename )
   {
   }
}