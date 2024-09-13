package n_collection;

import java.util.ArrayList;
import java.util.Collections;

public class Ex02_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>(4);  //()안에 수를 넣지 않으면, 기본적으로 10  <>안에 받을 형태를 명확히 지정함.
		list.add("rabbit");
		list.add("cat");
		list.add("dog");
		list.add("fox");
		list.add("ant");
		
		System.out.println(list);
		
		list.set(3, "lion");
		System.out.println(list);
		
		list.add("tiger");
		System.out.println(list);
		
		list.remove("3");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		//original for문
		for(int i=0;i<list.size(); i++) {
			String obj = (String)list.get(i);
			System.out.println(obj);
		}
		
		//향상된 new for문 -->집합적인 data에서 사용
		for(String temp : list) {
			System.out.println(temp);
		}

	}

}
