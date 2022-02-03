// 1. Write an if/else statement for the following requirements:
// If student gets 90 or higher: console log  A
// If students get 80 or above: console log B
// If students get 70 or above: console log C
// If students get 55 or above: console log D
// Any grade lower than 55 is F


public class Mod3hw1q1 {
  public static void main(String[] args) {

int num = 95;

if(num >= 90){
System.out.println("A");
}
 else if(num >= 80){
    System.out.println("B"); 
 }
else if(num >= 70){
    System.out.println("C"); 
 }
 else if(num >= 55){
    System.out.println("D"); 
 }
else{
   System.out.println("F"); 
}

  }
}