import javafx.animation.AnimationTimer;

public class Octopus extends Invader
{
   private Timer timer = new Timer();
   
   public Octopus(int x, int y)
   {
      super(x,y);    //gives x & y to Invader constructor
   }

   @Override
   public void move()
   {
   }
   
   @Override
   public boolean hit()
   {
      hit();      //invoke inherited hit() method
      timer.start();            //invoke start() method in AnimationTimer
      //the handle method in Timer is invoked on every computational frame
      return super.isAlive;
   }
   
   private void regenerate()
   {
      super.health = 3;
      super.filename = "OctopusMatrix.txt";
      super.setBody();
      timer.stop();
   }
   
   class Timer extends AnimationTimer
   {
      long last = 0; 
      @Override
      public void handle(long now)
      {
         double time = (now-last)*Math.pow(10,-9);
         if( now-last > 10 )
         {
            if( isAlive )
            {
               regenerate();
            }
            last = now;
         }
      }
   }
}