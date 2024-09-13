package c_control;


import java.util.Scanner;

public class Ex01_if_주민번호 {

	public static void main(String[] args) {
		Scanner inputid= new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
		String id=inputid.nextLine();
				char sung=id.charAt(7);
		System.out.println(sung);
		
		// 그 문자가 1 이거나 3이거나 9라면 '남자' 출력
		// 그 문자가 2 이거나 4이거나 0라면 '여자' 출력
		String gender="";
		
		
		if(sung == '1' | sung=='3' | sung=='9') {			// 개념상 '||'가 맞지만, '|'를 사용해도 결과에 영향 없음.
			gender="남자";
		}else if(sung=='2'|sung=='4'|sung=='0'){
			gender="여자";
		} else {
			gender="잘못된 입력";
		}
		System.out.println("당신은 "+gender+"입니다");

	}

}

