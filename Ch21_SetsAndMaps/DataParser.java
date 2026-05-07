import java.util.*;
import java.io.*;

public class DataParser
{
   public static void readMajorsAndCourses()
   {
      //parse data from majors.csv
      try
      {
         File f = new File(Constants.fileMajors);
         Scanner scan = new Scanner(f);
         scan.nextLine();     //scan over column titles line
         
         while( scan.hasNextLine() )
         {
            String line = scan.nextLine();   //"AE", "Aerospace Engineering", "SDSU", "Aerospace Engineering"
            String[] tokens = line.split(",");
            String key = tokens[0] + "-" + tokens[2];
            Major m = new Major(tokens[0], tokens[1], tokens[2], tokens[3]);
            Constants.majors.put(key, m);
         }
         
         for( String k : Constants.majors.keySet() )
            System.out.println( Constants.majors.get(k) );
         
      }catch(FileNotFoundException e )
      {
         System.out.println( Constants.fileMajors + " not found.");
      }
   }
}