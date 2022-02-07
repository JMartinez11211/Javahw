import java.util.Scanner;

class M3W1H2Q2{
    public static void main(String[] args){

        //  2. Write a program to see if a user entered string 
        //  is a palindrome (Links to an external site.) or not

        String uInput, rInput = "",iResult, rResult;
         Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word to see if its a palindrome :");
        uInput = scan.nextLine();
        int length= uInput.length();
        for (int i = length - 1; i >= 0; i--){
            rInput = rInput + uInput.charAt(i);
        }
        iResult = uInput.toUpperCase();
        rResult = rInput.toUpperCase();

        System.out.println(iResult.equals(rResult) );



        
    }
}