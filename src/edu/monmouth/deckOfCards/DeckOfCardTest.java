package edu.monmouth.deckOfCards;

import java.util.Arrays;

public class DeckOfCardTest {

		public static void main(String args[] ) {
			//DeckConstants shouldFail = new DeckConstants();
			// verify Card constructor
			Card c1 = new Card(Rank.EIGHT, Suit.HEART);
			Card c2 = new Card(Rank.TWO, Suit.HEART);
			Card c3 = new Card(Rank.NINE, Suit.HEART);
			System.out.println("Card c1: " + c1);
			System.out.println("Card c2: " + c2);
			System.out.println("Card c3: " + c3);
			
			// verify Deck constructor & toString
			Deck deck = new Deck();
			System.out.println("Newly created deck:\n" + deck);
			deck.shuffle();
			System.out.println("Shuffled deck:\n" + deck);
			
			Card player1Hand[] = deck.deal(53);
			Card player2Hand[] = deck.deal(7);
			Card player3Hand[] = deck.deal(7);
			Card player4Hand[] = deck.deal(7);
			
			System.out.println(Arrays.toString(player1Hand));
			System.out.println(Arrays.toString(player2Hand));
			System.out.println(Arrays.toString(player3Hand));
			System.out.println(Arrays.toString(player4Hand));
			
			System.out.println(deck.cardsLeft());

//			
//			System.out.println("Draw card: " + deck.draw());
//			System.out.println("Draw card: " + deck.draw());
//			System.out.println("Draw card: " + deck.draw());
//			int cardsLeft = deck.cardsLeft();
//			System.out.println("cardsLeft: " + cardsLeft);
//			
//			
//			for(int i=0; i < cardsLeft; i++) {
//				System.out.println("Draw card: " + deck.draw());
//			}
//			System.out.println("Complete");
		}

	}

