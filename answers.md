Buggy1:
Constructor or Method: I think the isEmpty method that would be found in the Deck Class has been changed

Describe a Possible Code Error:
Looking at my previos code I wrote for the isEmpty() Method/Function, I have: 

        if (size==0){
            return true; 
        }
        else{
            return false; 
        }

 If my code was in place, I think the DeckTester would work and there wouldn't be an AssertionError. I think the method might have been changed to:

 if(size<0){
     return true; 
 }
 which would explain why 0 wouldn't return true. I think if I set the size to a value lower than 0, the code would return true. However, a card can't be empty.  

Buggy2: 
Constructor or Method (write method name): The Constructor in the Deck Class 
Describe a Possible Code Error: 
The Constructor must be wrong if it is saying the size of the card is 0 instead of 1. Originally in my Constructor I have the code: 

 for(int i=0;i<ranks.length; i++)

 Maybe this for loop was changed to 
for(int i=1;i<ranks.length; i++)
This would cause the program to have an error when the card is only length 1 because the loop wouldn't be able to run. 

Buggy3:
Constructor or Method (write method name): 
The Shuffle Method in the Deck Class could have been changed. 

Describe a Possible Code Error: 
I originally have the for loop:
for(int i=size-1;i>=0;i--)

It could have been changed to:
for(int i= size-1; i<0; i--), 
which would cause the cards to not be randomly shuffled/set because there's really no way for the card size to be less than 0 when the loop begins. This would cause the AssertionError because none of the decks would have been shuffled. 

Buggy4
Constructor or Method (write method name):
I think the Deal method in the Deck Class has been changed. 

Describe a Possible Code Error: 
I originally have the method set as: 
        if(size==0){
            return null; 
        }
        else{
            size--; 
        return cards.get(size); 
        }
If there is only one card in the deck, the code should return that value/card and not return null. This makes me believe the size of the card is decreased before it goes through the if statement. The code could possibly look like: 

        size--; 
        if(size==0){
            return null; 
        }
        else{
            size--; 
        return cards.get(size); 
        }

Which would decrease the size one more value than needed and would result in a deck of one card returning a null answer. 

Buggy5- 
The changes in the Deck class were legit the errors I found in the previous 4 buggies! 
