import java.util.Scanner;
public class StringComparison
{
   public static void main(String[] args)
   public static ArrayList<String>
   {
      Scanner kb = new Scanner(System.in);
      System.out.println("Please enter "
                     + "three strings: ");

      String s1 = kb.nextLine();
      String s2 = kb.nextLine();
      String s3 = kb.nextLine();
      
if (s1.compareTo(s2)<0) && (s2.compareTo(s3)<0)
{
   System.out.println(s1 + s2 + s3);
 }
else
{ if (s2.compareTo(s1)<0) && (s1.compareTo(s3)<0)
 {
  System.out.println(s2 + s1 + s3);
}
else
{ if (s3.compareTo(s2)<0) && (s2.compareTo(s1)<0)
{ 
System.out.println(s3 + s2 + s1);
}
}
     
}
}
