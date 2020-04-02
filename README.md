# Elevens

## Activity 5 Instructions

Each of the folders Buggy1 through Buggy5 contain already compiled, runable code with logic errors, and the source files.
Your job is to run the Tester programs, then correct the runtime problems that you encounter.

To run the code, first move to the proper folder, then run the code normally (no need to compile the tester).

Example for Buggy1:

```
 $ cd Buggy1
 $ java DeckTester
```

You should see:

```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1
	at java.util.ArrayList.elementData(ArrayList.java:418)
	at java.util.ArrayList.get(ArrayList.java:431)
	at Deck.deal(Deck.java:85)
	at DeckTester.testEmpty(DeckTester.java:99)
	at DeckTester.test1CardDeck(DeckTester.java:28)
	at DeckTester.main(DeckTester.java:12)
```

Next, fix the error(s).

Then compile and run as usual:

```
 $ javac DeckTester.java
 $ java DeckTester
```

Continue until the code runs as expected.

## Submitting

Commit all local changes, then (replace # with the current activity number):
```
$ git push origin a#
```

## Switching to the next activity

```
$ git fetch upstream a#
$ git checkout -b a# upstream/a#
```
