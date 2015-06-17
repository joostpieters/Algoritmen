import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class TestSorter {
	
	/**
	 * The number of compares should be equal for every array with the same length.
	 */
	@Test
	public void test_numbCompares() {
		// We create a "best case" array that is fully sorted.
		Comparable[] rij = {1,2,3,4,5,6,7,8,9};
		// We create a "worst case" array that is sorted in the opposite direction. 
		Comparable[] rij2 = {9,8,7,6,5,4,3,2,1};
		//We create the two sorters
		Sorter s = new Sorter(rij);
		Sorter s2 = new Sorter(rij2);
		// We sort the array.
		s.sort();
		s2.sort();
		//We check if the number of compares is good
		assertTrue(s.getComparers() == s2.getComparers());
	}
	/**
	 * Test if a fully correctly sorted array make any swaps.
	 */
	@Test
	public void test_swaps(){
		
	}

}
