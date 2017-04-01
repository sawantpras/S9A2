package collectiondemos;

import java.util.*;

public class HashSetDemo {

	public static void main(String args[]) {
		// create hashset containing string value
		HashSet<String> al = new HashSet<String>();
		al.add("Ravi");
		al.add("Ajay");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		al.add("Suresh");
		al.add("Suresh");
		// iterator used to display value
		Iterator<String> itr = al.iterator();
		// hasnext method check for next value
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
