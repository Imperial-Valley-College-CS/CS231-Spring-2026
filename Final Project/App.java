import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.event.*;

public class App extends Application
{
   String[] buttonsText = {"Sort Name Ascending", "Sort Name Descending"};
   TextArea textArea = new TextArea();
   ScrollPane scroll = new ScrollPane(textArea);
   BorderPane pane = new BorderPane();
   Scene scene = new Scene(pane, 600, 400, Color.BLUE);
   ArrayList<President> presidents = new ArrayList<>();
   TreeSet<President> sortedPresidents;
   VBox buttonsVbox = new VBox();
   Button[] sortButtons = new Button[2];
   String filename = "presidents.txt";
   Comparator<President> compareElements;
   SortButtonHandler handleSortBttn = new SortButtonHandler();
   
   @Override
   public void start(Stage stage)
   {
      setup();
      stage.setScene(scene);
      stage.show();
   }
   
   public void setup()
   {
      //read data from presidents.txt into ArrayList
      readData();
      
      //create buttons & add buttons to VBox
      int i = 0;
      for( String text : buttonsText )
      {
         sortButtons[i] = new Button( text );
         sortButtons[i].setOnAction( handleSortBttn );      //make button alive
         buttonsVbox.getChildren().add( sortButtons[i] );
         i++;
      }
      
      scroll.setFitToHeight(true);
      for( President p : presidents )
      {
         textArea.appendText( p.getName() + "\n" );
      }
      
      //add ScrollPane (with TextArea) to BorderPane
      pane.setCenter( scroll );
      //add VBox (with Buttons) to BorderPane
      pane.setRight( buttonsVbox );
   }
   
   public boolean readData()
   {
      try
      {
         File f = new File(filename);
         Scanner scan = new Scanner(f);
         while( scan.hasNextLine() )
         {
            String[] tokens = scan.nextLine().split(",");
            presidents.add( new President(tokens[0]) );
         }
         return true;
      }catch( FileNotFoundException e )
      {
         return false;
      }
   }
   
   class SortButtonHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent e)
      {
         Button b = (Button)e.getSource();
         String text = b.getText();
         switch( text )
         {
            case "Sort Name Ascending":
               compareElements = new CompareNameAscending();
               break;
            case "Sort Name Descending":
               compareElements = new CompareNameDescending();
               break;               
         }
         
         //create a new TreeSet using the appropriate Comparator
         sortedPresidents = new TreeSet<>(compareElements);
         
         //add all presidents in ArrayList to TreeSet
         for( President p : presidents )
            sortedPresidents.add( p );
           
         ///remove all text from text area 
         textArea.clear();
         
         //remove presidents from TreeSet and add to TextArea
         while( !sortedPresidents.isEmpty() )
            textArea.appendText( sortedPresidents.pollFirst().getName() + "\n");
      }
   }//end SortButtonHandler
   
   class CompareNameAscending implements Comparator<President>
   {
      @Override
      public int compare(President p1, President p2)
      {
         return p1.getName().compareTo( p2.getName() );     //name ascending
      }
   }//end CompareNameAscending
   
   class CompareNameDescending implements Comparator<President>
   {
      @Override
      public int compare(President p1, President p2)
      {
         return p2.getName().compareTo( p1.getName() );     //name descending
      }
   }//end CompareNameDescending
}