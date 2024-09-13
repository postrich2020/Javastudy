package n_collection;

import java.util.*;

public class Ex05_Lotto {

	public static void main(String[] args) {
		
		Set <Integer>lotto = new HashSet<Integer>();
		
		while(lotto.size()<6) {
//			int num=(int)(Math.random()*45)+1;
//			lotto.add(num);
			
			lotto.add((int)(Math.random()*45)+1);
			
		}
		
		List list=new ArrayList(lotto); //sort는 리스트 형태만 가능하므로, set타입을 list 형태로 만든다.
		Collections.sort(list); 
		System.out.println(list);

	}

}
