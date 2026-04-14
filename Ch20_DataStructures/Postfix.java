import java.util.Stack;

public class Postfix
{
   String expression;
   Stack<Double> stack = new Stack<>();
   
   public Postfix( String exp )
   {  
      this.expression = exp;
   }
   
   public double evaluate()
   {
      String[] tokens = this.expression.split(" ");
      for(String x : tokens)
      {
         if( x.charAt(0) >= 48 && x.charAt(0) <=57 )
            stack.push( Double.parseDouble(x) );
         else if( x.equals("+") || x.equals("*") || x.equals("-") || x.equals("/") )
         {
            Double num2 = stack.pop();
            Double num1 = stack.pop();
            switch(x)
            {
               case "+": stack.push(num1 + num2); break;
               case "*": stack.push(num1 * num2); break;
               case "-": stack.push(num1 - num2); break;
               case "/": stack.push(num1 / num2); break;
            }
         }else
            throw new NumberFormatException();
      }
      return stack.pop();
   }
}