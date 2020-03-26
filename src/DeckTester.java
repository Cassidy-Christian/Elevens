/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] rank1 = {"Queen", "Ace", "2"};
		String[] suit1 = {"Clubs", "Hearts", "Spades"};
		int[] value1 = {12, 1, 2};
	    Deck deck1 = new Deck(rank1, suit1, value1);
		System.out.println("Deck1 size should be 3: " + deck1.size());
		System.out.println("Deck1 should not be empty: " + !deck1.isEmpty());
		System.out.println("Deck1 dealt card is: " + deck1.deal());
		
	    String[] rank2 = {"5", "6", "7"};
	    String[] suit2 = {"Clubs", "Spades", "Diamonds"};
	    int[] value2 = {5, 6, 7};
		Deck deck2 = new Deck(rank2, suit2, value2);
		System.out.println("Deck2 size should be 3: " + deck2.size());
	    System.out.println("Deck2 should not be empty: " + !deck2.isEmpty());
		System.out.println("Deck2 dealt card is: " + deck2.deal());
		
	    String[] rank3 = {"1", "Jack", "Queen"};
	    String[] suit3 = {"Diamonds", "Spades", "Clubs"};
	    int[] value3 = {1, 11, 12};
		Deck deck3 = new Deck(rank3, suit3, value3);
		System.out.println("Deck3 size should be 3: " + deck3.size());
		System.out.println("Deck3 should not be empty: " + !deck3.isEmpty());
	    System.out.println("Deck3 dealt card is: " + deck3.deal());

	}
}
