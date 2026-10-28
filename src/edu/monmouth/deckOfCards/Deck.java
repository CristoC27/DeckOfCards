package edu.monmouth.deckOfCards;
import java.util.Arrays;
import java.util.Random;
import edu.monmouth.deckOfCards.DeckConstants;
public class Deck {
	Random rd = new Random();
	Card deck[];
	public Deck() {
		deck = new Card[DeckConstants.MAXCARDSINDECK];
		int deckIndex = 0;
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck[deckIndex] = new Card(r,s);
				deckIndex++;
			}
		}
	}
	
	public void shuffle() {
		for(int i = 0; i < 101; i++) {
			int temp1Location = rd.nextInt(cardsLeft());
			int temp2Location = rd.nextInt(cardsLeft());
			Card temp1 = deck[temp1Location];
			Card temp2 = deck[temp2Location];
			deck[temp1Location] = temp2;
			deck[temp2Location] = temp1;
		}
		System.out.println("Deck shuffled");
	}
	
	public Card draw() {
		Card drawn = deck[rd.nextInt(cardsLeft())];
		int newDeckIndex = 0;
		Card newDeck[] = new Card[cardsLeft()-1];
		for (Card c : deck) {
			if (drawn.equals(c)) {
				continue;
			}
			else {
				newDeck[newDeckIndex] = c;
				newDeckIndex++;
			}
		}
		deck = newDeck;
		return drawn;
	}
	
	public int cardsLeft() {
		return deck.length;
	}
	
	public Card[] deal(int numberOfCards) {
		if(numberOfCards > cardsLeft()) {
			System.err.println("Not enough cards in deck");
			return null;
		}
		int cardsToDeal = numberOfCards;
		Card hand[] = new Card[cardsToDeal];
		for (int i = 0; i < cardsToDeal;i++) {
			hand[i] = draw();
		}
		return hand;
	}
	@Override
	public String toString() {
//		StringBuilder sb = new StringBuilder();
//		for (Card c : deck) {
//			sb.append(c.toString() + "\n");
//		}
//		return sb.toString();
		return Arrays.toString((deck));
	}
}
