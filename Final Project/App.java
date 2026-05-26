import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;
import javafx.scene.control.*;

public class App extends Application
{
   TextArea textArea = new TextArea();
   ScrollPane scroll = new ScrollPane(textArea);
   BorderPane pane = new BorderPane();
   Scene scene = new Scene(pane, 600, 400);
   ArrayList<President> presidents = new ArrayList<>();
   String filename = "presidents.txt";
   
   @Override
   public void start(Stage stage)
   {
      setup();
      stage.setScene(scene);
      stage.show();
   }
   
   public void setup()
   {
      readData();
      scroll.setFitToHeight(true);
      for( President p : presidents )
      {
         textArea.appendText( p.getName() );
         textArea.appendText( "\n" );
      }
      pane.setCenter( scroll );
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
}