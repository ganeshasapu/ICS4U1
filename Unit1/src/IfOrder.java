//Ganesh A.
//February 13, 2022
//Practice the importance of the order of If statements
import java.util.Scanner;
public class IfOrder {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //Obtaining number
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        //Method 1:
        //if the number is greater than 5...
        if(num > 5){
            //unless the number is greater than 10...
            if(num > 10){
                //The number is >10
                System.out.println("never");
            }
            else{
                //The number is >5 and <10
                System.out.println("yes");
            }
        }
        //otherwise...
        else{
            //The number is < 5
            System.out.println("maybe");
        }

        //Method 2:
        if(num > 5 && num <= 10){
            System.out.println("yes");
        }

        if(num > 10){
                //The number is >10
                System.out.println("never");
        }
        //otherwise...
        if (num <= 5){
            //The number is < 5
            System.out.println("maybe");
        }

    }
}
