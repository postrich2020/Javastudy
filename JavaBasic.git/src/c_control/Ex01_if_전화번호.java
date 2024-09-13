package c_control;

import java.util.Scanner;
public class Ex01_if_전화번호 {
	

	public static void main(String[] args) {

		Scanner inputtel = new Scanner(System.in);
		
		System.out.print("전화번호 : ");
		String tel=inputtel.nextLine();
		int idx=tel.indexOf('-');
		// System.out.print(idx);
		
		String localNum=tel.substring(0,idx); //0번째 부터 idx값 까지의 문자열 추출
		// System.out.println("지역번호는 = "+localNum);

		/*
		 * 지역 번호가 02라면 "서울" 출력
		 * 그렇지 않고 지역번호가 032라면 "인천" 출력
		 * 나머지는 "한국" 출력
		 */
		String localname="";
		
		if(localNum.equals("02")) {
			localname="서울";
		}else if(localNum.equals("032")) {
			localname="인천";
		} else {
			localname="한국";
		}
		
		String localname2=localNum.equals("032")?"인천2":localNum.equals("02")?"서울2":"한국2";
		
		System.out.println("입력하신 번호의 지역은 "+localname+"입니다.");
		System.out.println("입력하신 번호의 지역은 "+localname2+"입니다.");
	}

}


/*
 * 02-222-2222
 * 032-123-1234
 * 051-555-9876
 */
