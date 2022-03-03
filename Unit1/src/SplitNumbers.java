//Ganesh A.
//February 11, 2022
//Takes a two digit number and spits out each digit seperately (3 methods)

import java.util.Scanner;

public class SplitNumbers{
static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
        System.out.print("Enter a two digit number: ");
        int numInput =  sc.nextInt();
        //Method 1
        System.out.println("Method 1");
        //getting input number

        //using modulos to get integer division and remainder
        int a  = numInput / 10;
        int b = numInput % 10;
        System.out.printf("A: %3d B: %3d %n %n", a, b);

        //Method 2
        System.out.println("Method 2");
        //converts to a string and finding char at index 0 and 1
        //converts back into an int
        a = Character.getNumericValue(("" + numInput).charAt(0));
        b = Character.getNumericValue(("" + numInput).charAt(1));
        System.out.printf("A: %3d B: %3d %n %n", a, b);

        //Method 3
        System.out.println("Method 3");
        //converts to a string and finds the substring from index 0-1, and 1-2
        //converts back to int
        a = Integer.parseInt(("" + numInput).substring(0, 1));
        b = Integer.parseInt(("" + numInput).substring(1, 2));
        System.out.printf("A: %3d B: %3d %n %n", a, b);

    }
}