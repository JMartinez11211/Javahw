import java.util.Scanner;
class StringClass{
    public static void main(String agrs[]){
     
    String fname;
    String lname;
    String fullname;
    String str1="Friday";
    String str2="friday";

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your first name: ");
    fname= scan.nextLine();
    System.out.println("Enter your last name: ");
    lname= scan.nextLine();
      
      fullname=fname.concat(lname);
      
      System.out.println(fullname);
      System.out.println(fullname.trim());

      System.out.println(fullname.length());

      System.out.println(fname.charAt(2));

      System.out.println(fname.indexOf('A'));

      System.out.println(fname.lastIndexOf('a'));

      System.out.println(fname.isEmpty());

      System.out.println(fname.contains("aa"));

      System.out.println(fname.substring(4));

      System.out.println(fname.substring(4,7));

      System.out.println(str1.equals(str2));

      System.out.println(str1.equalsIgnoreCase(str2));
    
 
    }
}