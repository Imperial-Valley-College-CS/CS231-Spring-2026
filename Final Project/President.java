import java.util.ArrayList;
import java.util.GregorianCalendar;
import javafx.scene.image.Image;

public class President implements Comparable<President>
{
   private String name, party;
   private ArrayList<Integer> presNum;
   private GregorianCalendar dob, startPres, endPres;
   private double yearsOfService;
   private Image image;
   
   public President( String name )
   {
      this.name = name;
   }
   
   public String getName(){ return this.name;}
   
   @Override
   public int compareTo(President p)
   {  
      return this.name.compareTo( p.getName() );
   }
}