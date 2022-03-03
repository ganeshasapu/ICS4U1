//Ganesh A.
//February 22, 2022
//Takes in sentence and prints words with 3 of the same letter repeated
import java.util.Scanner;

public class Triplets {
    //Creating scanner
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Prompting User
        System.out.print("Enter a word/sentence: ");
        //Taking in word/sentence and turning into word array
        String[] inputStringArray =  sc.nextLine().split(" ");
        //going through all the words
        for (int i = 0; i < inputStringArray.length; i++) {
            //getting word from word array
            String word = inputStringArray[i];
            //setting variable to keep track of current character
            //"|" as a default 
            char currentChar = '|';
            //keepign count of # of times a character appears in a row
            int count = 1;
            //going through each character of the word
            for (int j = 0; j < word.length(); j++) {

                //if the character is equal to the previous character
                if(word.charAt(j) == currentChar){
                    //increase the count by 1
                    count++;
                    //if the # of repeated characters equals 3
                    if(count == 3){
                        //print the word
                        System.out.println(word);
                        //get out of word
                        break;
                    }
                }
                //a new character appears
                else{
                    //changes current character to the one at index
                    currentChar = word.charAt(j);
                    //resets counts
                    count = 1;
                }
            }
        }
    }
}
