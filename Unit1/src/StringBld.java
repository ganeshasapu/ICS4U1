//Ganesh A.
//February 22, 2022
//Testing out the StringBuilder class by trying out 3 methods
import java.lang.StringBuilder;

public class StringBld{
    public static void main(String[] args) {
        //Creating a StringBuilder object (string 1)
        StringBuilder testString = new StringBuilder("Hello");
        //Creating another StringBuilder object (string 2)
        StringBuilder testString2 = new StringBuilder(" World!");

        //Adding second StringBuilder to first and prints
        System.out.println(testString.append(testString2));
        //Prints out the # of character allocated to the StringBuilder obejct
        System.out.println(testString.capacity());
        //Replaces the indexes 1- (5-1) with new String 
        //Hello -> Hey
        System.out.println(testString.replace(1, 5, "ey"));

        //Converts testString StringBuilder object to String object
        String newTestString = testString.toString();

        //newTestString.append("Test");
        //Note that the above line of code will no longer work since it is a String, not a StringBuilder object
    }
}