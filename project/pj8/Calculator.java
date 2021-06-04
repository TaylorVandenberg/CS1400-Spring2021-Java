// Taylor Vandenberg
// CS1400, section 03
// Project 8 - Calculator with Exception Handling
// 5/10/21
public class Calculator {
   private double result;
   public Calculator()
   {
      result=0.0;
   }
   public void doCalculation(String expression) throws NumberFormatException, UnknownOperatorException
   {
      char[] validCalculations={'/','+','-','%','*'};
      String cleanExpression = expression.trim();
      char operationType = cleanExpression.charAt(0);
      double userNum;
      for(int i=0; i<validCalculations.length; i++)
      {
            userNum=Double.parseDouble(cleanExpression.substring(1));
            if(operationType=='/')
            {
               result=result/userNum;
               return;
            }
            else if(operationType=='+')
            {
               result=result+userNum;
               return;
            }
            else if(operationType=='-')
            {
               result=result-userNum;
               return;
            }
            else if(operationType=='*')
            {
               result=result*userNum;
               return;
            }
            else
               throw new UnknownOperatorException(operationType);
      }
   }
   public double getResult()
   {
      return result;
   }
}

