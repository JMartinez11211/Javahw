package oopconcepts;
import java.util.Scanner;

public class Employee extends Person{
	int emp_id;
	double emp_salary;
	  
	
	  
	  
	  Employee(int id, String name,int age, char pgender,double salary)
	  {
		 
		 super(name,age,pgender);
		 emp_id=id;
		 emp_salary=salary;
	  }
	  
	 
	  public void display() {
			System.out.println(organization + ": Employee");
			super.display();
			System.out.println("Salary is: " + emp_salary);
			System.out.println(" Bonus is: " + compute(emp_salary));
			
		}
	  



	public static Employee newEmployee()
	  {
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter employee ID: ");
		  int emp_id= scan.nextInt();
		  scan.nextLine();
		  System.out.print("Enter name: ");
		  String pname = scan.nextLine();
		  System.out.print("Enter age: ");
		  int page = scan.nextInt();
		  System.out.print("Enter gender: ");
		  char pgender = scan.next().charAt(0);
		  System.out.print("Enter salary: ");
		  double emp_salary = scan.nextDouble();
		  scan.nextLine();
		 
	  		System.out.println();
	  		
	  

	return new Employee(emp_id, pname, page, pgender, emp_salary);
	}
	  	
  
}
