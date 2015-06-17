
public class main {
	
	
 public static void main(String[] args) {
	Integer[] rij = {9,8,7,6,5,4,3,2,1,};
		Comparable[] rij2 = rij.clone();
		Sorter s = new Sorter(rij2);
		
		s.showArray();
		s.sort();
		s.showArray();
		System.out.println(s.getComparers());
 	}
}
