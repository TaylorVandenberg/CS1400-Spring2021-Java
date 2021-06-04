//Taylor Vandenberg
//CS1400, section 03
//Project 7 - Employee Inheritance
//5-3-21
public class ProductionWorker extends Employee {
   private Integer shift;
   private Double hourlyRate;

   public ProductionWorker()
   {
      super();
      shift=1;
      hourlyRate=0.0;
   }
   public ProductionWorker(String employee, String employeeNum, String 
hireDate, int shift, double hourlyRate)
   {
      super(employee, employeeNum, hireDate);
      this.shift=shift;
      this.hourlyRate=hourlyRate;
   }
   public String toString()
   {
      String day = "INVALID SHIFT NUMBER";
      if(shift==1)
         day ="Day";
      else if(shift==2)
         day="Night";
      return String.format(super.toString()
      +"\nShift: "+day
      +"\nHourly Pay Rate: $%.2f",hourlyRate);
   }
   public int getShift()
   {
      return shift;
   }
   public double getHourlyRate()
   {
      return hourlyRate;
   }
   public void setShift(int shift)
   {
      this.shift=shift;
   }
   public void setHourlyRate(double hourlyRate)
   {
      this.hourlyRate=hourlyRate;
   }
}

