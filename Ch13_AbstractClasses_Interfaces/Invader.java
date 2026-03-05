import javafx.scene.paint.Color;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public abstract class Invader
{
   private int health, speedX, speedY;
   private Color color;
   private Position position;
   private boolean isAlive, body[][];
   private String matDir = "InvaderMatrices/";         
   private String filename;      //SquidMatrix.txt, CrabMatrix.txt, HurtCrabMatrix.txt
   
   public Invader( int x, int y )
   {
      this.position = new Position(x,y, Constants.ALIEN_WIDTH, Constants.ALIEN_HEIGHT);
      this.color = Color.GREEN;
      this.health = 1;
      this.isAlive = true;
      this.speedY = Constants.ALIEN_SPEED;
      this.body = new boolean[Constants.ALIEN_ROWS][Constants.ALIEN_COLS];
      setBody();
   }
   
   public abstract void move();     //abstract method - to be overridden by subclasses
   
   public void setBody()
   {
      File f = new File( matDir + filename );      // InvaderMatrices/SquidMatrix.txt
      
      try
      {
         Scanner scan = new Scanner(f);
         int i = 0;
         while( i < Constants.ALIEN_ROWS )
         {
            String line = scan.nextLine();      // "0,0,1,1,0,1....
            String[] tokens = line.split(",");     // ["0", "0", "1", "1", "0", "1"...]
            
            for( int j = 0; j < tokens.length; j++ )
            {
               if( tokens[j].equals("1") )
                  this.body[i][j]  = true;
               else                  
                  this.body[i][j]  = false;
            }
            i++;
         }
         
      }catch( FileNotFoundException e)
      {
         System.out.println(filename + " not found.");
      }
   }
}