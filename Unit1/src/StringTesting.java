//Ganesh A.
//February 17, 2022
//Tests 3 methods of the String object

public class StringTesting{
    public static void main(String[] args) {
        //creating string where number is same as index
        String testString = new String("0123456789");
        //looking at index 2, prints out 2
        System.out.println(testString.charAt(2));
        //finds index of 3, prints out 3
        System.out.println(testString.indexOf("3"));
        //returns characters from index 3 to index 7-1
        System.out.println(testString.substring(3, 7));
    }
}