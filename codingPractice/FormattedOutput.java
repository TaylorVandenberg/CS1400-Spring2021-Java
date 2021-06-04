public class FormattedOutput
{
   public static void main(String[] args)
   {
      String name = "\"Taylor Vandenberg";
      String major = "\\Computer Science";
      String study_List = "CS '1400'";

      System.out.printf("Student:    %12s\" \n",name);
      System.out.printf("Major:      %12s\\ \n", major);
      System.out.printf("Study List: %s", study_List);
   }
}
