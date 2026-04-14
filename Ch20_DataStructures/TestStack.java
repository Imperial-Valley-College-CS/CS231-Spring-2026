public class TestStack
{
   public static void main(String[] args)
   {
      testPostfix();
   }
   
   public static void testPostfix()
   {
      Postfix p = new Postfix("40 2 * 3 * 5 +");
      System.out.println( p.evaluate() == 245.0 );
   }
}