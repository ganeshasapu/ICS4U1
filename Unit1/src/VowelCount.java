//Ganesh A.
//February 17, 2022
//Counts the amount of vowels in the testString variable


public class VowelCount {
    public static void main(String[] args) {
        //Creating a String with all vowels to check each character against
        String vowels = new String("aeiou");
        //creating "input" string variable
        String testString = new String("whatistheoverump");
        //turning the input string into lowercase
        testString = testString.toLowerCase();
        //variable to keep track of the # of vowels
        int vowelCount = 0;
        //looping through each character in testString
        for (int i = 0; i < testString.length(); i++) {
            //if the character has an index in the String of vowels (character == vowel)
            if (vowels.indexOf(testString.charAt(i)) != -1){
                //increase vowel count
                vowelCount += 1;
            }
        }
        //print out characters
        System.out.println(vowelCount);
    }
}
