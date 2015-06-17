/**
 * A class that sorts a given array with the selection sort Algorithm. This
 * class also provides a method to return the number of compares this algorithm
 * has made and a method to increase the number of comapers by one.
 * 
 * 
 * @author Yanice Slegers
 *
 */
public class SelectionSorter {
	/**
	 * The number of compares this algorithm has made.
	 */
	private int comparers;
	/**
	 * The array that needs to be sorted.
	 */
	@SuppressWarnings("rawtypes")
	private Comparable[] rij;

	/**
	 * This class is initialized with a given array. The given array is the
	 * array that needs to be sort.
	 * 
	 * @param rij
	 *            The row that needs to be sorted
	 */
	public SelectionSorter(@SuppressWarnings("rawtypes") Comparable[] rij) {
		this.rij = rij;
	}

	/**
	 * Returns the number of compares this algorithm has made.
	 */
	public int getComparers() {
		return comparers;
	}

	/**
	 * Increases the number of compares this class has made by one.
	 */
	public void inCreaseCompares() {
		comparers++;
	}

	/**
	 * Switches two elements of the array that needs to be sorted.
	 * 
	 * @param a
	 *            The first index that needs to be switched.
	 * @param b
	 *            The second index that needs to be switched.
	 */
	@SuppressWarnings("rawtypes")
	public void switchPlace(int a, int b) {
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
 /**
  * Sorteert nu enkel maar de grooste rij.
  */
	public void sort() {
		for(int i = 0; i < rij.length-1; i++){
			int min = i;
			for(int j = i+1; j <rij.length; j++){
				inCreaseCompares();
				if(isLess(j, min)){
					min = j;
				}
			}
			switchPlace(i, min);
		}
			
	}
	/**
	 * Checks if the element of the first index is less than the element of the second index.
	 * @param	i
	 * 			The first index of this row that is compared.
	 * @param	j
	 * 			The second index of this row that is compared.
	 * @return	True if and only if the element if the first index is less than the ellemant of the second index.
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

}
