import java.util.Scanner;
class UserInput{
    public static void main(String agrs[]){
        int inum;
        long lnum;
        float fnum;
        double dnum;
        char onechar;
        String name;
        String address;
        String zip;
        boolean choice;
        String str;

       Scanner scan = new Scanner(System.in);
       System.out.println("enter any integer number : ");
       inum = scan.nextInt();
        System.out.println("enter any long number : ");
       lnum = scan.nextLong();
        System.out.println("enter any decimal  number : ");
       fnum = scan.nextFloat();
        System.out.println("enter any big decimal number : ");
       dnum = scan.nextDouble();
        System.out.println("enter true or false : ");
       choice = scan.nextBoolean();
        System.out.println("enter your name : ");
        name = scan.next();

        scan.nextLine();

        System.out.println("enter your street address : ");
       address = scan.nextLine();

       System.out.println("enter your zip code : ");
       zip = scan.nextLine();

        System.out.println(" Enter 'y' or 'n' as your choice ");
        str= scan.next();
        onechar= str.charAt(0);
        System.out.println("one character is: " + onechar)

      
      System.out.println(inum);
      System.out.println(lnum);
      System.out.println(fnum);
      System.out.println(dnum);
      System.out.println(choice);
      System.out.println(name);
      System.out.println(address);
      System.out.println(zip);

      

     

    }
}