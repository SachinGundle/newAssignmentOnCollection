package SetBranch;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
	     HashSet<String> hs=new HashSet<>();
	     
	     hs.add("Sachin");
	     hs.add("Ganeshrao");
	     hs.add("Gundle");
	     hs.add(" ");
	     hs.add("Naleshwar");
	     hs.add("Nanded");
	     hs.add("Sachin");
	     hs.add(" ");

	     
	     Iterator<String> itr=hs.iterator();
	     while (itr.hasNext()) {
	    	 System.out.println(itr.next());
	     }
		}

}
