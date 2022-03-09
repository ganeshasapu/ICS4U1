//Ganesh A.
//March 8, 2022
//Creating, Shuffling, and Printing an array representing a deck of cards

import java.util.ArrayList;

public class Cards{
    //Creating a Card Class
    private static class Card{
        //The two values we need stored for each card
        //Suits: 0=Spades, 1=Hearts, 2=Clubs, 3=Diamonds
        public int suit;
        //Value: 0=Ace, 10=Jack, 11=Queen, 12=King
        public int value;
        Card(int cardSuit, int cardValue){
            suit = cardSuit;
            value = cardValue;
        }
        //Method to convert the int into the appropriate card character
        public char getCardSuit() {
            //Spades
            if(suit == 0){
                return 'S';
            }
            //Hearts
            if(suit == 1){
                return 'H';
            }
            //Clubs
            if(suit == 2){
                return 'C';
            }
            //Diamonds
            else{
                return 'D';
            }
        }
        //Method to covnert value of card to the appropriate card value
        public String getCardValue() {
            //Jacks
            if(value == 10){
                return "J";
            }
            //Queens
            if(value == 11){
                return "Q";
            }
            //Kings
            if(value == 12){
                return "K";
            }
            //Ace
            if(value == 0){
                return "A";
            }
            //Normal number card
            else{
                return Integer.toString(value);
            }
        }
    }
    
    public static char getSuit(int cardSuit){
          //Spades
            if(cardSuit == 0){
                return 'S';
            }
            //Hearts
            if(cardSuit == 1){
                return 'H';
            }
            //Clubs
            if(cardSuit == 2){
                return 'C';
            }
            //Diamonds
            else{
                return 'D';
            }
    }

    public static String getValue(int cardValue){
          //Jacks
            if(cardValue == 10){
                return "J";
            }
            //Queens
            if(cardValue == 11){
                return "Q";
            }
            //Kings
            if(cardValue == 12){
                return "K";
            }
            //Ace
            if(cardValue == 0){
                return "A";
            }
            //Normal number card
            else{
                return Integer.toString(cardValue);
            }
    }
    
    //method to shuffle using 2D array
    public static void shuffle(int[][] deck){
        //going through each card
        for (int i = 0; i < deck.length; i++) {
            int tempValue = deck[i][0];
            int tempSuit = deck[i][1];

            //picking random card index
             int randIndex = (int) (Math.random() * 52);

             //swapping card values
            deck[i][0] = deck[randIndex][0];
            deck[i][1] = deck[randIndex][1];

             deck[randIndex][0] = tempValue;
             deck[randIndex][1] = tempSuit;
        }
    }
    
    public static void main(String[] args) {

        //METHOD 1: ARRAYLIST + OBJECTS
        System.out.println("METHOD 1: ARRAYLIST + OBJECTS");
        ArrayList<Card> cards = new ArrayList<Card>();

        //Instantiating Array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                //Creating Card object with the cardvalue and suit
                Card newCard = new Card(i, j);
                //Adding card to the cards array
                cards.add(newCard);
            }
        }

        //Printing array
        
        for (Card card : cards) {
            System.out.printf("%s%c %n", card.getCardValue(), card.getCardSuit());
        }

        //Shuffle Deck
        for (int i = 0; i < 52; i++) {
            Card card = cards.get(i);
            int randIndex = (int) (Math.random() * 52);
            //Getting the card at the generated index
            Card temp = cards.get(randIndex);

            //Swapping cards
            cards.set(randIndex, card);
            cards.set(i, temp);
        }

        System.out.println("\n\n\n");
        System.out.println("Shuffled: ");

        //Printing array
        for (Card card : cards) {
            System.out.printf("%s%c %n", card.getCardValue(), card.getCardSuit());
        }

        System.out.println("\n\n\n");

        //METHOD 2: 2D ARRAY + METHODS
        //Creating 2D array of ints
        //outer array is each card, the inner array is the value + suit repressented as ints
        int[][] cardDeck = new int[52][2];
        System.out.println("METHOD 2: 2D ARRAY + METHODS");
        //Instantiating Array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                //Calculating the index of card in the array
                int cardIndex = (i * 13) + j;
                //setting values in cardDeck array
                cardDeck[cardIndex][0] = j;
                cardDeck[cardIndex][1] = i;
            }
        }

        //Printing Array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                int cardIndex = (i * 13) + j;
                System.out.printf("%s%c%n", getValue(cardDeck[cardIndex][0]), getSuit(cardDeck[cardIndex][1]));
            }
        }

        shuffle(cardDeck);

        System.out.println("\n\n\n");
        System.out.println("Shuffled: ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                int cardIndex = (i * 13) + j;
                System.out.printf("%s%c%n", getValue(cardDeck[cardIndex][0]), getSuit(cardDeck[cardIndex][1]));
            }
        }
    }
}
