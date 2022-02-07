import java.util.Scanner;

class Mod3D3L{
    public static void main(String[] args){
     int inum;
    Scanner scan = new Scanner(System.in);
    System.out.println("enter number of rows : ");
    inum = scan.nextInt(); 

    for (int r=1; r <= inum; r++){
        for(int c=1; c <= r; c++ ){

            System.out.println(c);
        }
    }


    }

}