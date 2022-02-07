import java.util.Scanner;

class M3W1H2Q3{
    public static void main(String[] args){

        //  3. Determine whether a user entered number is an Armstrong number

        int uNum, tNum, total =0, rNum = 0, lNum ;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if its an Armstrong number: ");
        uNum = scan.nextInt();

    for(tNum = uNum; uNum > 0; uNum /= 10)
        total++;
      
      for(uNum = tNum; uNum > 0; uNum /= 10)
      {
         lNum = uNum%10;
         rNum = rNum + (int) Math.pow(lNum, total);
      }
      
      System.out.println(rNum == tNum);
        

    }
}