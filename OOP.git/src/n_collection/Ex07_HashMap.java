package n_collection;

import java.util.*;

public class Ex07_HashMap {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		HashMap<String, String> map=new HashMap<String, String>();
		//               아이디      비밀번호
		map.put("javassem", "1111");  //키, 밸류 순으로 입력
		map.put("javababo", "9999");
		map.put("kimjava", "9999");
		map.put("javassem", "1234"); //같은 키 값이 있으면 나중 키 값으로 덮어버림.

		while(true) {
			System.out.println("아이디 : ");
			String id = input.nextLine();
			System.out.println("비밀번호 : ");
			String pw = input.nextLine();

			if(map.containsKey(id)) {
				if((map.get(id)).equals(pw)) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					continue; //while문 바로 뒤로 보냄.
				}
			}else {
				System.out.println("존재하지 않는 아이디 입니다.");
				continue; //while문 바로 뒤로 보냄.
			}
			//구현 부분

		}
	}

}
