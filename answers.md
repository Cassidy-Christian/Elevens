1. Explain in your own words the relationship between a deck and a card.
Cards make up the components of the deck. The deck is an arraylist of cards. In a single deck, there will be 52 cards. A card can be by itself, but for a deck to exist, there must be multiple cards. 

2. Consider the deck initialized with the statements below. How many cards does the deck contain?
 String[] ranks = {"jack", "queen", "king"};
 String[] suits = {"blue", "red"};
 int[] pointValues = {11, 12, 13};
 Deck d = new Deck(ranks, suits, pointValues);

From the looks of it, the programmer was planning to create three separate cards. However, the fact there are only two suits, instead of three to correlate with the number of ranks and point values, would cause an index out of bounds error. Right now, there would be no cards in the deck because the code would not be able to compile. In order for the code to run, the programmer would need to add another cell to the suit array for the command line to say there are three separate cards.  

3. The game of Twenty-One is played with a deck of 52 cards. Ranks run from ac (highest) down to 2 (lowest). Suits are spades, hearts, diamonds, and clubs as in many other games. A face card has point value 10; an ace has point value 11; point values for 2, …, 10 are 2, …, 10, respectively. Specify the
contents of the ranks, suits, and pointValues arrays so that the statement:
 Deck d = new Deck(ranks, suits, pointValues);
initializes a deck for a Twenty-One game.

String[] ranks = {“2”, “3”, “4”, “5”, “6”, “7”, “8”, “9”, “10”, “Jack”, “Queen”, “King”, “Ace”};
String[] suits = {“Spades”, “Diamonds”, “Clubs”, “Hearts”};
int [] pointValues = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

4. Does the order of elements of the ranks, suits, and pointValues arrays matter? 
Yes! The order of elements of the ranks, suits, and pointValues arrays do matter! The cells correlate with each other. All the information in cell 0 for ranks, suits, and pointValues would make one specific card. The programmer needs to make a pattern with the arrays to create the cards that he or she wants. 

It might not matter as much when the user is first initializing the information. However, the cells for sure need to correlate when we are testing our code. 