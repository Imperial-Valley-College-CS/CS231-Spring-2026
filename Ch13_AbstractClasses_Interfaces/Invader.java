import javafx.scene.paint.Color;

public class Invader
{
   private int health, speedX, speedY;
   private Color color;
   private Position position;
   private boolean isAlive, body[][];
   private String matDir;
   
   public Invader( int x, int y )
   {
      this.position = new Position(x,y, Constants.ALIEN_WIDTH, Constants.ALIEN_HEIGHT);
      this.color = Color.GREEN;
      this.health = 1;
   }
}