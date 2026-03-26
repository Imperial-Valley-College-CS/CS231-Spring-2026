import java.util.GregorianCalendar;

public class Videogame implements Comparable<Videogame>
{
   //data fields
   private String title, language, sDate;
   private int copies;
   private GregorianCalendar date;
   //constructors
   public Videogame(String title, String date, int copies, String language)
   {
      this.title = title;
      this.sDate = date;
      this.copies = copies;
      this.language = language;
      setDate();  //initializes this.date
   }
   //methods
   public void setDate()
   {
      String[] tokens = this.sDate.split("/");
      int month = Integer.parseInt(tokens[0]) - 1;
      int day = Integer.parseInt( tokens[1] );
      int year = Integer.parseInt( tokens[2] );
      this.date = new GregorianCalendar(year, month, day);
   }
   
   public int getCopies(){ return this.copies; }   
   public String getTitle(){ return this.title; }
   
   @Override
   public int compareTo( Videogame v )
   {
      int x = this.copies - v.getCopies();
      if( x != 0 )
         return x;
      else
      {
         return this.title.compareTo( v.getTitle() );
      }
   }
   
   @Override
   public String toString()
   {
      return this.title + " " + this.copies;
   }
}