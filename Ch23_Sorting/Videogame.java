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
   
   public GregorianCalendar getDate(){ return this.date; }
   public String getTitle(){ return this.title; }
   
   @Override
   public int compareTo(Videogame v)
   {
      if( this.title.compareTo(v.getTitle()) != 0 )
         return this.title.compareTo( v.getTitle() );
      else
         return this.date.compareTo( v.getDate() );
   }
   
   @Override
   public String toString()
   {
      return this.title + ", " + this.sDate;
   }
}