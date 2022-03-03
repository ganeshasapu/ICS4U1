//Ganesh A.
//February 15, 2022
//Accepts a, b, c values of a quadratic equation and outputs the roots
import java.util.Scanner;

public class Quadratic {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //Getting the a, b, and c values
        System.out.print("Enter a value: ");
        double a = sc.nextDouble();
        System.out.print("Enter b value : ");
        double b = sc.nextDouble();
        System.out.print("Enter c value: ");
        double c = sc.nextDouble();

        //calculating the discriminant
        double discriminant = (b * b) - (4 * a * c);

        //the discriminant is negative (cannot be calculated)
        if(discriminant < 0){
            System.out.println("No roots");
        }

        //the discriminant is 0 (only 1 root)
        else if(discriminant == 0){
            System.out.printf("One Root: %4.3f %n", (-b / (2 * a)));
        }

        //the discriminant is positive (2 roots)
        else{
            System.out.printf("Root1: %4.3f %n", (-b + Math.sqrt(discriminant)) / (2 * a));
            System.out.printf("Root2: %4.3f %n", (-b - Math.sqrt(discriminant)) / (2 * a));
        }
    }
    
}