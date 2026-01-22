/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier Junchao Fan id: 991825624
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int cardValue = random.nextInt(1, 14);
            int cardSuit = random.nextInt(4);
            //c.setValue(insert call to random number generator here)
            c.setValue(cardValue);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[cardSuit]);
            magicHand[i] = c;
            System.out.println(c.getSuit()+ " " +c.getValue());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a card value (1-13): ");
        int userValue =in.nextInt();
        System.out.println("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=SPADES, 3=Clubs): ");
        int userSuit =in.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);
        boolean result = false;
        for (Card card:magicHand) {
            if (userCard.equals(card)) {
                result = true;
            }
        }
        //Then report the result here
        if (result) {
            System.out.println("Nice! your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
        // add one luckcard hard code 2,clubs
    }
    
}
