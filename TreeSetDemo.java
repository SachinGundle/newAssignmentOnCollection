package SetBranch;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
	     TreeSet<String> ts=new TreeSet<>();
	     
	     ts.add("Sachin");
	     ts.add("Ganeshrao");
	     ts.add("Gundle");
	     ts.add(" ");
	     ts.add("Naleshwar");
	     ts.add("Nanded");
	     ts.add("Sachin");
	     
	     Iterator<String> itr=ts.iterator();
	     while (itr.hasNext()) {
	    	 System.out.println(itr.next());
	     }
		}

}
