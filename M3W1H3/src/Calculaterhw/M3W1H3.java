package Calculaterhw;
import java.util.*;

public class M3W1H3 {
	
	static void add(int num1, int num2){
        System.out.print(num1 + " + " + num2 + " = "+ (num1 + num2));
    }

    static void subtract(int num1, int num2){
        System.out.print(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    static void multiply(int num1, int num2){
        System.out.print(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    static void divide(int num1, int num2){
        System.out.print(num1 + " / " + num2 + " = " + (num1 / num2));
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num1, num2;
		 Scanner scan = new Scanner(System.in);
		
		 System.out.println("Enter one of these numbers to choose  an operation: ");
		 System.out.println("1. Add");
		 System.out.println("2. Subtract");
		 System.out.println("3. Multiply");
		 System.out.println("4. Divide");
		 System.out.println("5. Exit");
		
		int input = scan.nextInt();
		
		
		switch(input) {
			
	        case 1: 
	        	System.out.println("Enter first number: ");
	            num1 = scan.nextInt();
	            System.out.println("Enter secound number: ");
	            num2 = scan.nextInt();
	        	add(num1, num2);
	            break;
	            
	        case 2: 
	        	System.out.println("Enter first number: ");
	            num1 = scan.nextInt();
	            System.out.println("Enter secound number: ");
	            num2 = scan.nextInt();
	        	subtract(num1, num2);
	            break;
	            
	        case 3:
	        	System.out.println("Enter first number: ");
	            num1 = scan.nextInt();
	            System.out.println("Enter secound number: ");
	            num2 = scan.nextInt();
	        	multiply(num1, num2);
	            break;
	            
	        case 4:
	        	System.out.println("Enter first number: ");
	            num1 = scan.nextInt();
	            System.out.println("Enter secound number: ");
	            num2 = scan.nextInt();
	        	divide(num1, num2);
	            break;
	            
	        case 5: 
	        	System.out.println("BYE, BYE");
	        	System.exit(0);
	        	break;
	        		
	        default: System.out.println("Wrong input");  
	        	break;
			}
		
	}

}
