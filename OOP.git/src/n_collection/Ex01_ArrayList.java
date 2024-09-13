package n_collection;

import java.util.*;

public class Ex01_ArrayList {
	public static void main(String[] args) {

		List result =method();
		//처리
		for(int i=0;i<result.size();i++) {
			Object obj = result.get(i); //Object에 의해 특정 형태 구분하지 않고 obj에 그냥 받아들임.
			System.out.println(obj);
			
		}

	}
	static List method() {
		//데이타	
		String name = "홍길자";
		Integer age = 100; //int-integer 호환 됨.
		Double height = 190.99;
		
		List list = new ArrayList(); //입력 받을 갯수를 모를 때.
		//Object[] obj = new Object[갯수];
		list.add(name);
		list.add(age);
		list.add(height);
		
		return list;
	}
}
