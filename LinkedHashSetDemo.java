package SetBranch;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
	     LinkedHashSet<String> lhs=new LinkedHashSet<>();
	     
	     lhs.add("Sachin");
	     lhs.add("Ganeshrao");
	     lhs.add("Gundle");
	     lhs.add(" ");
	     lhs.add("Naleshwar");
	     lhs.add("Nanded");
	     lhs.add("Sachin");
	     
	     Iterator<String> itr=lhs.iterator();
	     while (itr.hasNext()) {
	    	 System.out.println(itr.next());
	     }
		}

}
