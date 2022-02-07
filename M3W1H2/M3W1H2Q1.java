import java.util.Scanner;

class M3W1H2Q1{
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


        

    }
}