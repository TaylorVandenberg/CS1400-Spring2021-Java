//Taylor Vandenberg
//CS1400, section 03
//Project 7 - Employee Inheritance
//5-3-21
public class Employee {
   private String employee;
   private String employeeNum;
   private String hireDate;

   private String wrapper(String employeeNum)
   {
     if (employeeNum.length() == 5)
     {
       for (int i=0; i<2; i++)
       {
         if (!Character.isDigit(employeeNum.charAt(i)))
            return "INVALID EMPLOYEE NUMBER";
       }
       if (!(employeeNum.charAt(3)=='-'))
         return "INVALID EMPLOYEE NUMBER";
       else if (!Character.isLetter(employeeNum.charAt(4)))
         return "INVALID EMPLOYEE NUMBER";
       else
         return employeeNum;
     }
     else
         return "INVALID EMPLOYEE NUMBER";
   }
   public Employee()
   {
      employee="";
      employeeNum="";
      hireDate="";
   }
   public Employee(String employee, String employeeNum, String hireDate)
   {
      this.employee=employee;
      this.employeeNum=wrapper(employeeNum);
      this.hireDate=hireDate;
   }
   public String getEmployee()
   {
      return employee;
   }
   public String getEmployeeNum()
   {
      return employeeNum;
   }
   public String getHireDate()
   {
      return hireDate;
   }
   public void setEmployee(String employee)
   {
      this.employee=employee;
   }
   public void setEmployeeNum(String employeeNum)
   {
      this.employeeNum=employeeNum;
   }
   public void setHireDate(String hireDate)
   {
      this.hireDate=hireDate;
   }
   public String toString()
   {
      return "Name: "+employee
      +"\nEmployee Number: "+employeeNum
      +"\nHire Date: "+hireDate;
   }
}
