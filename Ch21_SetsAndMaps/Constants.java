import java.util.*;
import java.io.*;

public class Constants
{  
   /*Application Constants*/
   public static String[] CIVElist = {"CIVE-SDSU", "STRUCT-UCSD"}; 
   public static String[] ECElist = {"EE-SDSU", "COMPE-SDSU", "EE-UCSD", "COMPE(ECE)-UCSD", "COMPE(CSE)-UCSD"};
   public static String[] MAElist = {"AE-SDSU", "ME-SDSU", "AE-UCSD", "ME-UCSD"};
   public static HashSet<String> MAEset = new HashSet<String>(Arrays.asList(MAElist));
   public static HashSet<String> ECEset = new HashSet<String>(Arrays.asList(ECElist));
   public static HashSet<String> CIVEset = new HashSet<String>(Arrays.asList(CIVElist));
   public static String dir = System.getProperty("user.dir");
   public static String fileMAEmajors = dir+"/DataFiles/MAE.txt";
   public static String fileECEmajors = dir+"/DataFiles/ECE.txt";
   public static String fileCIVEmajors = dir+"/DataFiles/CIVE.txt";
   public static String fileMajors = dir+"/DataFiles/majors.csv";
   public static String fileCourses = dir+"/DataFiles/courses.csv";   
   public static String outputFileMajors = dir+"/DataFiles/Majors.txt";  
   public static String outputFileCourses = dir+"/DataFiles/Courses.txt";
   public static File fMajors = new File(fileMajors);
   public static File fCourses = new File(fileCourses);
   public static HashMap<String, Major> majors = new HashMap<>(); 
   public static ArrayList<Course> courses = new ArrayList<>();
   public static ArrayList<String> schools = new ArrayList<>(Arrays.asList("IVC", "SDSU", "UCSD"));
}