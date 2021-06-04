import java.util.Scanner;
public class roots
{
   public static void main(String[] args)
   {
      float n1, n2, n3;
      float r1, r2, r3;

      Scanner kb = new Scanner(System.in);
      System.out.println("enter three coefficients: ");
      n1 = kb.nextFloat();
      kb.nextLine();
      n2 = kb.nextFloat();
      kb.nextLine();
      n3 = kb.nextFloat();
      kb.nextLine();

      r1 = (-n2 + (n2^2 - 4*n1*n3)^.5)/(2*n1);
      r2 = (-n2 - (n^2 - 4*n1*n3)^.5)/(2*n1);

      System.out.println("The two roots are %.4f %.4f", r1, r2);
     }
}
