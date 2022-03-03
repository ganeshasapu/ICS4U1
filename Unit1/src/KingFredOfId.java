//Ganesh A.
//February 17, 2022
//Translates words according to the law of King Fred of Id
import java.util.Scanner;

public class KingFredOfId {
    //Creating scanner
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Prompting User
        System.out.print("Enter a word/sentence: ");
        //Taking in word/sentence
        String inputString =  sc.nextLine();

        //Getting rid of extra whitspace, turning into all uppercase, and splitting each word
        String[] words = inputString.strip().toUpperCase().split(" ");
        //for each word
        for (int i = 0; i < words.length; i++) {
            //get the word from .split() array
            String word = words[i];
            //Rule 2: all 4 letter words
            if (word.length() == 4){
                //Set word in word array to "FRED"
                words[i] = "FRED";
            }
            //making sure it is possible to check last 2 rules (must have at least 2 characters)
            if(word.length() >= 2){
                //Rule 3: if the last 2 letters equal "ED" (also making sure not overwriting rule 2)
                if(word.substring(word.length() - 2).equals("ED") && !word.equals("FRED")){
                    //Turn last 2 letters into "ID"
                    words[i] = word.substring(0, word.length() - 2) + "ID";
                }
                //Rule 5: If the first 2 letters equal DI
                if(word.substring(0, 2).equals("DI")){
                    //Turn the first 2 letters into ID
                    words[i] = "ID" + word.substring(2, word.length());
                }
            }
        }
        //Go through updated word array and join them together
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
