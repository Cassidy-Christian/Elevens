1. Discuss the similarities and differences between Elevens, Thirteens, and Tens. 
A major similarity is that all they will call from the Board Function. They all have a deck and they have a number of spaces to fill. They will have different isLegal and anotherPlayIsPossible functions. 

2. As discussed previously, all of the instance variables are declared in the Board class. But it is the
ElevensBoard class that “knows” the board size, and the ranks, suits, and point values of the
cards in the deck. How do the Board instance variables get initialized with the ElevensBoard
values? What is the exact mechanism?
The initialization of the values occurs in the Board class in the Constructor. It calls the super in its constructor and that allows it to be unique.  

3. Now examine the files Board.java, and ElevensBoard.java, found in the Activity8
Starter Code directory. Identify the abstract methods in Board.java. See how these
methods are implemented in ElevensBoard. Do they cover all the differences between Elevens,
Thirteens, and Tens as discussed in question 1? Why or why not?

The abstract methods are isLegal and anotherPlayIsPossible. This would be sufficient for the other two games would be the rules. We just need to change what parameters are passed through the constructor and the rules would be part of the abstract methods. 
