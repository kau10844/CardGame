
package wordcardgame;

import java.util.Random;
import java.util.Scanner;

/**
 * This class models a simple card guessing game
 * 
 * @author Arshdeep Kaur
 */
public class WordCardGame {

    
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);


        // Create an array to hold 7 cards
       Card[] hand = new Card[7];

        // We'll use Random to generate random numbers
        Random random = new Random();

        //for (int i = 0; i < hand.length; i++) {
          //  int value = random.nextInt(13) + 1;
           //String suit = CardTrick.suits[random.nextInt(4)];

            //CardTrick card = new CardTrick(suit,value);
            //hand[i] = card;
        //}

        // print them out for debugging purposes
        System.out.println("Here are the cards in the hand");
        //for (CardTrick card : hand) {
        //    System.out.printf("%d of %s\n", card.getValue(), card.getSuit());
        //}

        // Now ask the user for a card
        System.out.println("Pick a suit for your card");
        //for (int i = 0; i < CardTrick.suits.length; i++) {
           // System.out.println((i + 1) + ": " + CardTrick.suits[i]);
       //}
        int suitInput = input.nextInt();

        System.out.println("Enter a value (1 to 13)");
        int valueInput = input.nextInt();

      // CardTrick userGuess = new CardTrick(CardTrick.suits[suitInput - 1],valueInput);

        boolean match = false;
        //for (CardTrick card : hand) {
          //  if (card.getValue() == userGuess.getValue()
            //        && card.getSuit().equals(userGuess.getSuit())) {
              //  match = true;
                //break;
           //}
        //}
    
        String response = match ? "Right guess": "No match";
        
        System.out.println(response);
        
        
    }

}
