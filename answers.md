1. The size of the board is one of the differences between Elevens and Thirteens. Why is size not an
abstract method?
Size isn't an abstract method because it is an instance variable. It is part of the contructor. There is no need to create setters or getter methods in the Board class since the size variable is already defined in the subclass.

2. Why are there no abstract methods dealing with the selection of the cards to be removed or replaced
in the array cards?
Removing and replacing cards is uniform and mutually exclusive process that occurs in all the games. Picking a card from the deck doesn't change from game to game. This is why it can be implemented in the Board class and be inherited down. It does not need to be an abstract method.

3. Would this new scheme allow the Elevens GUI to call isLegal
and anotherPlayIsPossible polymorphically? Would this alternate design work as well as the abstract Board class design? Why or why not?
the isLegal() and anotherPlayIsPossible() functions will still be called polymorphically. This alternate design will still work, but all of the methods will have to be implemented separately for each card game board class. It is not the most efficient program. 
