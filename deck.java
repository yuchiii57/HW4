import java.util.ArrayList;
import java.util.Random;

public class deck {
	private ArrayList<Card> cards;
	private ArrayList<Card> usedcard;
	ArrayList name = cards;
	Random i = new Random();
	public int used = 0;
	public int nUsed;
	private ArrayList<Card> openCard; 

	public deck(int ndeck){
		cards = new ArrayList<Card>();
		for (int i = 0; i <= ndeck; i++) {
			for (Card.Suit s : Card.Suit.values()) {
				for (int k = 1; k <= 13; k++) {
					Card  card = new Card(s,k);
					cards.add(card);
				}

			}
		}
		shuffle();
	}

	public void printDeck() {
		for (Card d : cards) {
			d.PrintCard();
		}
	}

	public ArrayList<Card> getAllCards() {
		return cards;
	}

	public void shuffle() {
		cards= new ArrayList<Card>();
		used = 0;
		ArrayList<Card> openCard= new ArrayList<Card>();
		for (Card shufflecard : cards) {
			int change = i.nextInt(52);
			Card changed = cards.get(change);
			cards.set(cards.indexOf(shufflecard), changed);
			cards.set(cards.indexOf(change), shufflecard);
			
		}
	}

	public Card getOneCard(boolean isOpened){
		if (used == 52) {
			shuffle();
		}
		Card gettenCard = cards.get(used);
		usedcard.add(gettenCard);
		used++;
		return gettenCard;
	}
	public ArrayList<Card> getOpenedCard(){return getOpenedCard();}
	
		
		
		

}
