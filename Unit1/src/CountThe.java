//Ganesh A.
//March 3, 2022
//Counts the # of "the"s in a word

public class CountThe {
    public static void main(String[] args) {
        //Creates input string
        String testString = new String("thedsadasthedasdsathesd");
        
        //turns it into lower case
        testString = testString.toLowerCase();

        //Count variable to check # of the
        int count= 0;
        //Looping through all character except last 2  (so it does not give outofbounds exception)
        for (int i = 0; i < testString.length() - 2; i++) {
            //if current character + next 2 characters == "the"
            if(testString.substring(i, i+3).equals("the")){
                //inrease count
                count++;
            }   
        }
        //print out final count
        System.out.println(count);
    }

}
