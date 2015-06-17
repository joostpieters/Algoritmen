package gna;
/**
 * A class that provides a method to sort a given array with the insertion sort algorithm.
 * The class provides also a method to calculate the number of swaps and the number of compares 
 * this sorting algorithm needs to sort the given array.
 * 
 * @author Yanice Slegers
 *
 */
public class InsertionSorter {

	/**
	 * A variable that contains the number of compares this algorithm has made.  
	 */
	private int numbCompares;
	/*
	 * A variable that contains the number of swaps this algorithm has made.
	 */
	private int swaps;
	/**
	 * A variable that contains the row that needs to be sorted.
	 */
	@SuppressWarnings("rawtypes")
	private Comparable[] rij;
	
	/**
	 * Return the number of compares this algorithm has done.
	 */
	public int getNumbCompares() {
		return numbCompares;
	}
	/**
	 * Increases the number of compares this algorithm has done by one.
	 */
	public void inCreaseNumbCompares() {
		this.numbCompares++;
	}
	/**
	 * Return the number of swaps this algorithm has done by one.
	 */
	public int getSwaps() {
		return swaps;
	}
	/**
	 * Increases the number of swaps this algorithm has done by one.
	 * @param swaps
	 */
	public void IncreaseSwaps() {
		this.swaps++;
	}
	/**
	 * Checks if the element of the first index is less than the element of the second index.
	 * @param	i
	 * 			The first index of this row that is compared.
	 * @param	j
	 * 			The second index of this row that is compared.
	 * @return	True if and only if the element if the first index is less than the element of the second index.
	 * 
	 */
	@SuppressWarnings("unchecked")
	public boolean isLess(int i,int j){
		return rij[i].compareTo(rij[j]) < 0;
	}
	
	/**
	 * Prints the array.
	 */
	public void showArray() {
		for (int i = 0; i < rij.length; i++) {
			System.out.print(rij[i] + " | ");
		}
		System.out.println();
	}

	/**
	 * Switches two elements of the array that needs to be sorted.
	 * 
	 * @param a
	 *            The first index that needs to be switched.
	 * @param b
	 *            The second index that needs to be switched.
	 */
	public void switchPlace(int a, int b) {
		@SuppressWarnings("rawtypes")
		Comparable temp = rij[a];
		rij[a] = rij[b];
		rij[b] = temp;
	}

	/**
	 * Validates of the row is fully sorted.
	 * 
	 * @return True if and only if each value of this row is lesser than the
	 *         value of the next index of this array.
	 */
	@SuppressWarnings("unchecked")
	public boolean isSorted() {
		for (int i = 0; i < rij.length - 1; i++) {
			if (rij[i].compareTo(rij[i + 1]) > 0) {
				return false;
			}
		}
		return true;
	}
	
	
}
