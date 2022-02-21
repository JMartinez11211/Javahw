package oopconcepts;

import java.util.Scanner;

public class Person implements PersonInterface {
   
	 String pname;
	   int page;
	   char pgender;
   
	   public Person(String name, int age, char gender )
	    {
	    	pname=name;
	    	page=age;
	    	pgender=gender;
	    	
	    }

	public void display() {
		System.out.println("Name: "+this.pname);
    	System.out.println("Gender: "+this.pgender);
    	System.out.println("Age: "+this.page);
		
	}

	@Override
	public double calculate(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		return (num1 + num2 + num3)/3 ;
	}

	@Override
	public double compute(double num1) {
		// TODO Auto-generated method stub
		return num1*.07;
	}   
	   
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Student stu1= Student.newStudent();
		Person1 email = new Person1();
		
		System.out.println("Enter email: ");
		 email.setEmail(scan.nextLine());
		stu1.display();
		email.display();
		System.out.println();

		

		Employee emp1 = Employee.newEmployee();
		emp1.display();
		System.out.println();
			
		
	}
	
	
	   
}
