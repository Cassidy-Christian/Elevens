1. Write a static method named flip that simulates a flip of a weighted coin by returning either "heads" or "tails" each time it is called. The coin is twice as likely to turn up heads as tails. Thus, flip should return "heads" about twice as often as it returns "tails."

public static String flip() {
	int r = (int)(Math.random() * 3);
	if (r<2){
		return “heads”; }
	else{
		return “tails”; }
}

2. Write a static method named arePermutations that, given two int arrays of the same length but with no duplicate elements, returns true if one array is a permutation of the other (i.e., the arrays differ only in how their contents are arranged). Otherwise, it should return false.

public static boolean arePermutations (int[] a, int[] b) {
	for (int aValue:a) {
		boolean permutation = false;
	for (int bValue:b) {
		if (bValue==aValue) {
			permutation = true;
		}
	}
	if (!permutation) {
		return false;
	}
	}
	return true;
}


3. Suppose that the initial contents of the values array in Shuffler.java are {1, 2, 3,4}. For what sequence of random integers would the efficient selection shuffle change values to
contain {4, 3, 2, 1}?

The random sequence of 0, 1, 1 could cause this change. The first 0 switches 4 and 1, producing 4, 2, 3, 1. the first 1 switches 2 and 3, producing 4, 3, 2, 1. The second 1 switches the 3 with itself.


