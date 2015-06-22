/**
 * A class that sorts an given array with the bubble sort algorithm. The class also provides
 * a method to return the number of compares and swaps this algorithm makes. 
 *  
 * @author Yanice Slegers
 *
 *	TODO: make abstract class
 *
 */
public class BubbleSorter {

	/**
	 * Variable that contains the array that needs to be sorted. 
	 */
	@SuppressWarnings("rawtypes")
	private Comparable[] row;
	/**
	 * Variable containing the number of compares this algorithm has made.
	 */
	private int compares;
	/**
	 * Variable containing the number of swaps this algorithm has made.
	 */
	private int swaps;
	/**
	 * Initializes this class with an array.
	 * 
	 * @param	row
	 * 			The row that needs to be sorted.
	 */
	@SuppressWarnings("rawtypes")
	public BubbleSorter(Comparable[] row){
		this.row = row;
	}
	
	/**
	 * Returns the number of compares this algorithm makes.
	 */
	public int getCompares(){
		return compares;
	}
	/**
	 * Increases the number of compares this algorithm has made by one.
	 */
	public void increaseCompares(){
			compares++;
	}
	/**
	 * Return the number of swaps this arrays has made.
	 */
	public int getSwaps(){
		return swaps;
	}
	/**
	 * Increases the number of compares this algorithm has made by one.
	 */
	public void increaseSwaps(){
		swaps++;
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
		return row[i].compareTo(row) < 0;
	}
	
	/**
	 * Prints the array.
	 */
	public void showArray() {
		for (int i = 0; i < row.length; i++) {
			System.out.print(row[i] + " | ");
		}
		System.out.println();
	}

	/**
	 * Switches two elements of the array that needs to be sorted.
	 * 
	 * @param 	a
	 *        	The first index that needs to be switched.
	 * @param 	b
	 *          The second index that needs to be switched.
	 */
	public void switchPlace(int a, int b) {
		@SuppressWarnings("rawtypes")
		Comparable temp = row[a];
		row[a] = row[b];
		row[b] = temp;
	}
	
	public void sort(){
		
	}
}
