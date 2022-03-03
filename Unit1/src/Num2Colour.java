//Ganesh A.
//February 13, 2022
//Takes in a number and outputs name of colour dependning on value
import java.util.Scanner;
public class Num2Colour {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //obtaining first number
        System.out.println("Enter in number 1: ");
        int a = sc.nextInt();

        //obtaining first number
        System.out.println("Enter in number 2: ");
        int b = sc.nextInt();

        //if either value is negative
        //could also do if (a + b < a || a + b < b)
        //or if(Math.abs(a) != a || Math.abs(b) != b)
        if (a  < 0 || b < 0){
            //if both values are negative
            if(a <0 && b <0){
                //both values are negative
                System.out.println("navy");
            }
            //at least one value is negative
            System.out.println("green");
        }
        //if a is even
        if(a % 2 == 0){
            //if b is greater than a
            if(b > a){
                //a is even and b is greater than a
                System.out.println("crimson");
            }
            else{
                //a is even and b is not greater than a (<=)
                System.out.println("pink");
            }
        }
        //if the sum of a and b is either less than 10 or greater than 100
        if(a + b < 10 || a + b > 100){
            System.out.println("yellow");
        }
    }
}