package oopconcepts;

import java.util.Scanner;

public class Student extends Person {
	
	int stud_id;
	int subject1,subject2,subject3;
	String major;
	
	Student(int id, String name,int age, char gender,int s1,int s2,int s3 )
	  {
		
		  super(name,age,gender);
		  
		  this.stud_id=id;
		  this.subject1=s1;
		  this.subject2=s2;
		  this.subject3=s3;
		  
		  
	  }
	
	 public void display() {
			System.out.println(organization+ ": Student");
			super.display();
			System.out.println("subject1 score is: "+subject1);
			System.out.println("subject2 score is: "+subject2);
			System.out.println("subject3 score is: "+subject3);
			System.out.println(" Avg: " + calculate(subject1, subject2, subject3));
		}
	
	
	
	
	public static Student newStudent()
	{
		 Scanner scan = new Scanner(System.in);
		  System.out.println("Enter student ID: ");
		  int stud_id= scan.nextInt();
		  scan.nextLine();
		  System.out.print("Enter name: ");
		  String pname = scan.nextLine();
		  System.out.print("Enter age: ");
		  int page = scan.nextInt();
		  System.out.print("Enter gender: ");
		  char pgender = scan.next().charAt(0);
		  System.out.println("Enter subject1 score: ");
		  int subject1 = scan.nextInt();
		  System.out.println("Enter subject2 score: ");
		  int subject2 = scan.nextInt();
		  System.out.println("Enter subject3 score: ");
		  int subject3 = scan.nextInt();
	  		System.out.println();
	  		
	  

	return new Student(stud_id, pname, page, pgender, subject1, subject2, subject3);
		
		
		
		
	
		
		
	}


	
}
	
	

