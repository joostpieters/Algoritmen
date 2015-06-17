
/**
 * A class that sorts a given array with the selection sort Algorithm.
 * This class also provides a method to return the number of compares 
 * this algorithm has made and a method to increase the number of comapers by one.
 * 
 * 
 * @author Yanice Slegers
 *
 */
public class Sorter {
	/**
	 * The number of compares this algorithm has made.
	 */
	private int comparers;
	/**
	 * The array that needs to be sorted.
	 */
	private Comparable[] rij;
	
	/**
	 * This class is initialized with a given array. The given 
	 * array is the array that needs to be sort.
	 * 
	 * @param	rij
	 * 			The row that needs to be sorted
	 */
	public Sorter(Comparable[] rij){
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
	 * @param	a
	 * 			The first index that needs to be switched.
	 * @param	b
	 * 			The second index that needs to be switched.
	 */
	public void switchPlace(int a, int b){
		Comparable temp = rij[a];
		rij[a] = rij[b];
		rij[b] = temp;
	}
	/**
	 * Validates of the row is fully sorted.
	 * @return	True if and only if each value of this row is lesser than the 
	 * 			value of the next index of this array. 
	 */
	public boolean isSorted(){
		for(int i = 0; i < rij.length; i++){
			if(rij[i].compareTo(rij[i+1])>0){
				return false;
			}
		}
		return true;
	}
	
}
