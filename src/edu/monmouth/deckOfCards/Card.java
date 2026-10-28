package edu.monmouth.deckOfCards;

public class Card {
	private Rank rank;
	private Suit suit;
	public Card(Rank rank, Suit suit) {
		setRank(rank);
		setSuit(suit);
	}
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
	@Override 
	public String toString() {
		return "Rank: "+getRank()+"|Suit: "+ getSuit();
	}
}
