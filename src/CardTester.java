/**
 * This is a class that tests the Card class.
 */
public class CardTester {
 
    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        Card one = new Card("Queen", "Hearts", 3);
        Card two = new Card("9", "Spades",4);
        Card three = new Card("4", "Clubs", 5);
          
        System.out.println("Suit of Card one: " + one.suit());
        System.out.println("Suit of Card two: " + two.suit());
        System.out.println("Suit of Card three: " + three.suit());
        System.out.println("Rank of Card one: " + one.rank());
        System.out.println("Rank of Card two: " + two.rank());
        System.out.println("Rank of Card three: " + three.rank());
        System.out.println("Point Value of Card one: " + one.pointValue());
        System.out.println("Point Value of Card two: " + two.pointValue());
        System.out.println("Point Value of Card three: " + three.pointValue());
        System.out.println("Does one match two? " + one.matches(two));
        System.out.println("Does one match three? " + one.matches(three));
        System.out.println("Does two match three? " + two.matches(three));    
        System.out.println("Card one: " + one.toString());
        System.out.println("Card two: " + two.toString());
        System.out.println("Card three: " + three.toString());
 
    }
}
