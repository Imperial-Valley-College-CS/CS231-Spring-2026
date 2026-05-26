import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;

public class App extends Application
{
   BorderPane pane = new BorderPane();
   Scene scene = new Scene(pane);
   ArrayList<President> presidents = new ArrayList<>();
   String filename = "presidents.txt";
   
   @Override
   public void start(Stage stage)
   {
      stage.setScene(scene);
      stage.show();
   }
   
   public boolean readData()
   {
      try
      {
         File f = new File(filename);
         Scanner scan = new Scanner(f);
         return true;
      }catch( FileNotFoundException e )
      {
         return false;
      }
   }
}