package c_control;

/*
			for문 : 반복 횟수가 정해져 있는 경우 주로 사용
			while문 : 반복 횟수가 정해져 있지 않은 경우 주로 사용
 */

import java.util.*;


public class Ex07_while_응용 {

	public static void main(String[] args) {
		
				// 예 : 국어/영어/수학 -> 90/88/70
		Scanner input = new Scanner(System.in);
		System.out.print("예 : 국어/영어/수학(90/88/70) -> ");
		String str = input.nextLine();
		//System.out.println(str);
		StringTokenizer st = new StringTokenizer(str,"/"); // 구분기준을 정해주지 않으면 기본값은 공백
		
		
		
		//반복 횟수 알 수 있다면
//		int cnt = st.countTokens();
//		for(int i=0;i<cnt;i++) {
//			String token=st.nextToken();
//			System.out.println("점수 : "+token);
//			
//		}
		
		while(st.hasMoreTokens()) {  //hasmoretokens -> 추가로 읽을 내용이 있는지 확인
			String token = st.nextToken();
			System.out.println("점수 : "+token);
			
		} //end of while
		
	} // end of main

} //end of class
