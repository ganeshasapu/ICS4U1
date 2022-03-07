//Ganesh A.
//March 2, 2022
//Takes in a list of word and checks if the multiplied ascii values of each characters is within the target +- cutoff range

import java.io.BufferedReader;
import java.net.URL;
import java.io.InputStreamReader;


public class MillionWord{
    //creating target and cutoff variables
    final static int target = 1_000_000;
    final static int cutoff = 500;
    public static void main(String[] args) {
        //try catch for getting input values
        try {
            //the url for the words
            URL myURL = new URL("http://quarkphysics.ca/ICS4U1/javaprogs/unit2/words_alpha.txt"); 
             BufferedReader brWeb = new BufferedReader(new InputStreamReader(myURL.openStream()));
            
             //Creating a string for the word on each line
            String word = new String("");

            //will stop at the end of file
            while ((word = brWeb.readLine()) != null) {
                    //starting the count at 1
                    int count = 1;
                    //Going through each letter
                    for (int j = 0; j <word.length() ; j++) {
                        //getting character
                        char currentChar = 'b';
                        //turning into ascii value
                        int charAscii = (int) currentChar;
                        //getting the designated value A=1, B=2...
                        //int letterValue = charAscii - 96;

                        //the above code can be replaced with:
                        int letterValue = 26 - (charAscii - 97);
                        //this allows a new value for each letter: A=26, B=25...


                        //changing the count variable accordingly
                        count = count * letterValue;
                    }
                    //Checking if count is within the target +- cutoff range
                    if (count >= (target - cutoff) && count <= (target + cutoff)){
                        //Printing out word and count
                        System.out.printf("%-10s   %8d %n", word, count);
                    }
                }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}