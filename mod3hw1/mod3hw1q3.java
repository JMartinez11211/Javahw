//3 Store a number in a variable called num and write an if statement: 
// If num is odd, display "Cool"
// If num is even and between 2-5, display "Not Cool"
// If num is even and between 6-20, display "Cool"
// If num is even and greater than 20, display "Not Cool



public class Mod3hw1q3 {
  public static void main(String[] args) {

int num = 22;

if(num % 2 != 0 ){
    System.out.println("Cool");
}
else {
    if(num >=2 && num <=5 ){
        System.out.println("Not Cool");
    }
    else if(num >=6 && num <=20){
        System.out.println("Cool");
    }
    else if (num > 20){
        System.out.println("Not Cool");
    }

}



  }
}
