public class Block
{
   private int shares;
   private double price;
   
   public Block( int shares, double price )
   {
      this.shares = shares;
      this.price = price;
   }
   
   public void setShares( int shares )
   {
      this.shares = shares;
   }
   
   public int getShares(){ return this.shares; }
   public double getPrice(){ return this.price; }
   
   @Override
   public String toString()
   {
      return "--Block:: " + this.shares + " @ $" + this.price;
   }
}