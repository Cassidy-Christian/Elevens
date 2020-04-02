1. What items would be necessary if you were playing a game of Elevens at your desk (not on the computer)? List the private instance  variables needed for the ElevensBoard class.
-need space for nine cards
-Deck consisting of 52 cards with ranks and suits.

2. Write an algorithm that describes the actions necessary to play the Elevens game
1. shuffle the deck 
2. draw 9 cards from the deck and place them into the slots
3. Check if the nine spaces are empty, if it is, the player wins!
4. check if any valid moves
5. If aren't any valid moves, player loses
6. If there are valid moves, select the first option
7. remove the cards from the spaces
8. If there are cards left in the deck, place them in the empty spaces
9. Go back to step 3

3. Now examine the partially implemented ElevensBoard.java file found in the Activity7Starter Code directory. Does the ElevensBoard class contain all the state and behavior
necessary to play the game?
1. shuffle the deck --- it is shuffled when calling a new game. 
2. draw 9 cards from the deck and place them into the slots---the same as deal my cards which is called at the start of a new game. 
3. Check if the nine spaces are empty, if it is, the player wins!---Calls the isEmpty function. We just have to check when this function is called. 
4. check if any valid moves---We will have to implement the function anotherPlayIsPossible in a later activity. 
5. If aren't any valid moves, player loses---The gameIsWon function can return false if there are no moves left. 
6. If there are valid moves, select the first option---we would call replacedSelectedCards function
7. remove the cards from the spaces--We would call replacedSelectedCards function
8. If there are cards left in the deck, place them in the empty spaces--This would a combination of the functions deck size and deal. 
9. Go back to step 3---Calls the isEmpty function. We just have to check when this function is called.// a meta step

4. ElevensBoard.java contains three helper methods. These helper methods are private
because they are only called from the ElevensBoard class.
a. Where is the dealMyCards method called in ElevensBoard?
It is in the constructor of this class and when we need to call a new game. 

b. Which public methods should call the containsPairSum11 and containsJQK methods?
The function isLegal and the function anotherPlayPossible would need to call the containsPairSum11 and containsJQK methods. 

It’s important to understand how the cardIndexes method works, and how the list that it
returns is used. Suppose that cards contains the elements shown below. Trace the execution
of the cardIndexes method to determine what list will be returned. Complete the diagram
below by filling in the elements of the returned list, and by showing how those values index
cards.
It would go to 0 to 8 and the result would be 
0, 1, 3, 6,7 
the last four spaces wouldn't have anything in them. They do not exist. 

Complete the following printCards method to print all of the elements of cards that are
indexed by cIndexes.
public static printCards(ElevensBoard board) {
 List<Integer> cIndexes = board.cardIndexes();
 /* Your code goes here. */

 for(Integer index:clndexes){
     System.out.println(cards[index]); 
 }
 //would call the toString method from the Card class

Which one of the methods that you identified in question 4b above needs to call the
cardIndexes method before calling the containsPairSum11 and containsJQK
methods? Why?
The function isLegal would need to be called. We need to check if the card indexes listed are actually part of the deck. 
