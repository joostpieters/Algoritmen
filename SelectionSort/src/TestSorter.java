import static org.junit.Assert.*;

import org.junit.Test;


public class TestSorter {
	
	/**
	 * The number of compares should be equal for every array with the same length.
	 */
	@SuppressWarnings("rawtypes")
	@Test
	public void test_numbCompares() {
		// We create a "best case" array that is fully sorted.
		Comparable[] rij = {1,2,3,4,5,6,7,8,9};
		// We create a "worst case" array that is sorted in the opposite direction. 
		Comparable[] rij2 = {9,8,7,6,5,4,3,2,1};
		//We create the two sorters
		SelectionSorter s = new SelectionSorter(rij);
		SelectionSorter s2 = new SelectionSorter(rij2);
		// We sort the array.
		s.sort();
		s2.sort();
		//We check if the number of compares is good
		assertTrue(s.getComparers() == s2.getComparers());
		//The array needs to be sorted
		assertTrue(s.isSorted());
		assertTrue(s2.isSorted());
		//THe value of the beginning of the array and the array are checked if their lower than the other values
		assertTrue(s.isLess(0, 1));
	}
	
}