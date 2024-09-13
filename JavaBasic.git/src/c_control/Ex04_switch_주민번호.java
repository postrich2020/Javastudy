package c_control;

import java.util.Scanner;

public class Ex04_switch_주민번호 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String id = input.nextLine();
		char chul=id.charAt(8); 				//지역
		
		String local ="";
		switch(chul) {  //chul 변수에 선택지 넣음.
		case '0' : local="서울"; break;  //break를 하지 않으면, 다음 행을 자동 실행하여 원하는 결과가 나오지 않으므로 반드시 break 체크 확인.
		case '1': local="인천/부산"; break;
		case '2' : local = "경기"; break;
		case '9' : local = "제주";break;
		default : local="한국";
		}
			System.out.println("당신은"+local+"출신입니다.");
	}

}



/*
 * 주민번호에서 출신지 번호가
 * 0 : 서울
 * 1: 인천/부산
 * 2 : 경기
 * 9:제주
 * 나머지 : 한국
 * 
 * if(chul =='0'){
 * 		서울
 * }else if(chul =='1'){
 * 		인천/부산
 * }else if(chul =='2'){
 * 		경기
 * }else if(chul =='9'){
 * 		제주
 * }else{
 * 		한국
 * }
 * 
 */
