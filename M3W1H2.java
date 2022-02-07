import java.util.Scanner;

class M3W1H2{
    public static void main(String[] args){

        //  1. Write Fibonnaci series (Links to an external site.)
        //  for the first n numbers in the series (n is a user entered value)

            int uNum, sum, fNum = 0, nNum = 1 ;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter how may fibonnaci numbers to print");
            uNum = scan.nextInt();
            System.out.print("The Fibonacci numbers are: ");
            for (int i = 1; i <= uNum; ++i){

                sum = fNum + nNum;
                fNum = nNum;
                nNum = sum;
                System.out.print(" " + sum);

            }


        //  2. Write a program to see if a user entered string 
        //  is a palindrome (Links to an external site.) or not

        String uInput, rInput = "",iResult, rResult;
        System.out.println("Enter a word to see if its a palindrome :");
        uInput = scan.nextLine();
        int length= uInput.length();
        for (int i = length - 1; i >= 0; i--){
            rInput = rInput + uInput.charAt(i);
        }
        iResult = uInput.toUpperCase();
        rResult = rInput.toUpperCase();

        System.out.println(iResult == rResult);



        //  3. Determine whether a user entered number is an Armstrong number

    }
}