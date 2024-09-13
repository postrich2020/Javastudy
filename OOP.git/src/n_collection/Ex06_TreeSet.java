package n_collection;

import java.util.TreeSet;

public class Ex06_TreeSet {

	public static void main(String[] args) { 
		TreeSet set=new TreeSet(); //Set을 물려 받음.
		set.add("elephant");
		set.add("tiger");
		set.add("lion");
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("zebra");
		set.add("bee");
		set.add("dog");
		
		System.out.println(set);
		System.out.println(set.subSet("d", "s"));
		System.out.println(set.headSet("e"));
		System.out.println(set.tailSet("e"));

	}

}
