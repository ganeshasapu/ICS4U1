//Ganesh A.
//February 17, 2022
//Takes in a sentence and prints out every third word (starting at the first word)

import java.util.Scanner;

public class ThirdWord {
    //creating scanner
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Obtaining sentence
        System.out.print("Enter a sentence: ");
        String sentence = new String(sc.nextLine());

        //creating string array of the words generated by split()
        String[] words = sentence.split(" ");

        //for every 3rd word (starting at the first) print out the value
        //increasing by 3 each time
        for(int i =0; i <words.length;i+=3){
            System.out.print(words[i] + " ");
        }
    }
    
}
