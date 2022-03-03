//Ganesh A.
//February 17, 2022
//Obtains the second word in a sentence without split()

public class SecondWord {
    public static void main(String[] args) {
        //input string
        String sentence = new String(" the yellow");
        //gets rid of leading spaces that will confuse the algorithm
        sentence = sentence.strip();
        //variable for the index of the first space in sentence
        int firstSpaceIndex = -1;
        //variable to store the second word
        String secondWord = new String("");
        //going through each character in sentence
        for (int i = 0; i < sentence.length(); i++) {
            //if the character is a space
            if(sentence.charAt(i) == ' '){
                //if one space has already been found
                if(firstSpaceIndex != -1){
                    //take the substring from the first space found to the current space found
                    secondWord  = sentence.substring(firstSpaceIndex + 1, i);
                    System.out.println(secondWord);
                    //break out of loop
                    break;
                }
                //set firstSpaceIndex to the current index
                firstSpaceIndex = i;
            }
        }
        //if the second word variable is empty but one space was found (in the case of only 2 words)
        if(secondWord.equals("") && firstSpaceIndex != 0){
            //print out the substring from the first space to the end of sentence
            System.out.println(sentence.substring(firstSpaceIndex + 1, sentence.length()));
        }
    }
}
