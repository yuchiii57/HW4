
public class Card {
	public enum Suit {
		Club, Diamond, Heart, Spade
	}

	private Suit suit;

	private int rank;

	public Card(Suit s, int r) {
		suit = s;
		rank = r;
	}

	public Suit getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}

	public void PrintCard() {

		System.out.print("(" + getSuit() + "," + (getRank() == 13 ? getRank() + ") \n" : getRank() + ") "));
	}
}
