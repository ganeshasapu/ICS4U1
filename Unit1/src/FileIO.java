//Ganesh A.
//March 7, 2022
//Printing out values using Scanner and Buffered Reader

import java.io.BufferedReader;
import java.net.URL;
import java.io.InputStreamReader;
import java.util.Scanner;


public class FileIO{
    public static void main(String[] args) {
        //try catch for getting input values
        try {
            //the url for the words
            URL myURL = new URL("http://quarkphysics.ca/ICS4U1/javaprogs/unit2/words_alpha.txt"); 

            //Creating Scanner
            Scanner sc = new Scanner(myURL.openStream());

            System.out.println("Printing Using Scanner: ");
            //Iterating 15 times
            for (int i = 0; i < 15; i++) {
                //Printing out the first 15 lines
                System.out.println(sc.next());
            }


            //Creating a BufferedReader
            BufferedReader brWeb = new BufferedReader(new InputStreamReader(myURL.openStream()));

            System.out.println("\n\n\n");
            System.out.println("Printing Using Buffered Reader: ");
            //Iterating 15 times
            for (int i = 0; i < 15; i++) {
                //Printing out the first 15 lines
                System.out.println(brWeb.readLine());
            }

        } catch (Exception e) {
            //Printing out exception
            System.out.println(e);
        }
    }
}