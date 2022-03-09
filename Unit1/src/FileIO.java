//Ganesh A.
//March 7, 2022
//Printing out values using Scanner and Buffered Reader

import java.io.BufferedReader;
import java.net.URL;
import java.io.InputStreamReader;
import java.util.Scanner;


public class FileIO{
    public static void main(String[] args) {
        try {
            URL myURL = new URL("http://quarkphysics.ca/ICS4U1/javaprogs/unit2/words_alpha.txt"); 

            //Scanner method
            Scanner sc = new Scanner(myURL.openStream());

            System.out.println("Printing Using Scanner: ");
            for (int i = 0; i < 15; i++) {
                //Printing out the first 15 lines
                System.out.println(sc.next());
            }


            //Creating a BufferedReader
            BufferedReader brWeb = new BufferedReader(new InputStreamReader(myURL.openStream()));

            System.out.println("\n\n\n");
            System.out.println("Printing Using Buffered Reader: ");
            for (int i = 0; i < 15; i++) {
                System.out.println(brWeb.readLine());
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}