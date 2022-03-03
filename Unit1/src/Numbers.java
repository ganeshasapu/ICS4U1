//Ganesh A.
//February 22, 2022
//Takes in a string, and for each digit in the string, increment it by one.

public class Numbers {
    public static void main(String[] args) {
        //input string
        String inputString = new String("0Th1at's 2his 5th sneeze9");

        //where the new string will be placed
        //this program could also be rewritten to change in place
        String newString = new String("");
        //looping through each character in input string
        for (int i = 0; i < inputString.length(); i++) {
            //getting the chracter in the input string
            char currentChar = inputString.charAt(i);
            //Checking if the characteer is a digit with isDigit method of the Character class
            if(Character.isDigit(currentChar)){
                int intChar = (int) currentChar;
                //checking if the digit is '9'
                if(intChar == 9){
                    //Change it to 0
                    newString = newString + "0";
                }
                //If it's not 9
                else{
                    //Getting the new number we need
                    //Using Integer object to make sure we can use .toString() method later
                    Integer newNum = (Character.getNumericValue(currentChar) + 1);
                    //Adding that number to the string
                    newString = newString + newNum.toString();
                    String x = new String("test ");
                    int c= 5;
                }
            }
            else{
                //if not a digit, just add to the newString variable
                newString = newString + currentChar;
            }

        }
        //print out newString
        System.out.println(newString);
    }
}
