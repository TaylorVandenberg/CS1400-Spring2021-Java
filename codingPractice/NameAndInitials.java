public class NameAndInitials
{
   public static void main(String[] args)
   {
      String first = "Taylor";
      String middle = "Dean";
      String last = "Vandenberg";
      char first_Initial = first.charAt(0);
      char middle_Initial = middle.charAt(0);
      char last_Initial = last.charAt(0);

      System.out.println("Name = " + first + " " + middle + " " + last);

      System.out.println("Initials = " + first_Initial 
                         + middle_Initial + last_Initial);

      System.out.println("Short name = " + first + " " 
                         + middle_Initial + " " + last);

      System.out.println("Shorter name = " + first_Initial 
                         + " " + middle_Initial + " " + last);

      System.out.println("UpperCase name = " + first.toUpperCase() + " " 
                         + middle.toUpperCase() + " " + last.toUpperCase());

   }
}
