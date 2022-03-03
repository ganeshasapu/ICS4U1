//Ganesh A.
//February 22, 2022
//Generates a random word with either 1 or 2 vowels

public class RandomWord {
    public static void main(String[] args) {
        //character array of vowels
        char[] vowels =  {'a', 'e', 'i', 'o', 'u'};
        //character array of consonanats
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};

        //where the generated word will be stored
        String generatedString = new String("");

        //50% chance for either option (deciding 1 or 2 vowels)
        if(Math.random() < 0.5){
            //two vowels
            //generating first index for vowel
            int indexOne = (int) (Math.random() * 6);
            //creating variable for index
            int indexTwo;
            //create a loop
            while (true){
                //setting indexTwo to another random index 
                indexTwo = (int) (Math.random() * 6);
                //if the two indexes don't equal each other
                if(indexTwo != indexOne){
                    //get out of the loop
                    break;
                }
                //otherwise, continue loop and generated new second index
            }
            //for each letter in the generated word
            for (int i = 0; i < 6; i++) {
                //if the index is one of the randomly generated vowel indexes
                if(i == indexOne || i == indexTwo){
                    //generate a random index that is within the vowel character array length
                    int randomVowelIndex = (int) (Math.random() * 5);
                    //add a vowel to the generated word
                    generatedString = generatedString + vowels[randomVowelIndex];
                }
                else{
                    //generate a random index that is within the consonant character array length
                    int randomConsanantIndex = (int) (Math.random() * 20);
                    //add a consonant to the generated word
                    generatedString = generatedString + consonants[randomConsanantIndex];
                }
            }
        }
        else{
            //one vowel
            //generating first index for vowel
            int indexOne = (int) (Math.random() * 6);
            //for each letter in the generated word
            for (int i = 0; i < 6; i++) {
                //if the index is one of the randomly generated vowel indexes
                if(i == indexOne){
                    //generate a random index that is within the vowel character array length
                    int randomVowelIndex = (int) (Math.random() * 5);
                    //add a vowel to the generated word
                    generatedString = generatedString + vowels[randomVowelIndex];
                }
                else{
                    //generate a random index that is within the consonant character array length
                    int randomConsanantIndex = (int) (Math.random() * 20);
                    //add a consonant to the generated word
                    generatedString = generatedString + consonants[randomConsanantIndex];
                }
            }
        }
        //print out the generated word
        System.out.println(generatedString);
    }
}
