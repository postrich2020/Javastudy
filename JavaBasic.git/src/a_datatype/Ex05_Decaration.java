package a_datatype;

public class Ex05_Decaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
			int kor;						// 변수 선언
			kor = 30;					// 값 대입
			
			// 초기화 = 변수선언 + 값 대임
			int eng = 50;
*/
		
			int kor=30, eng=50;
			
			System.out.println("국어 : " + kor+", 영어 = "+eng);  //print, println, printf 특성에 따라 사용. println은 출력 후 다음 행으로 이동, printf는 형식에 맞춰 출력.
			System.out.printf("국어 : %d, 영어 = %d\n", kor, eng); //'\n'은 다음행으로 이동. 사용 갯수에 따라 여러 줄을 띄울 수 있음.
			//System.out.println();
			
			/*
			 * 만약에 국어 점수와 영어점수가 동일하니?
			 * 그렇다면, "두 점수가 동일"이라고 출력
			 * 그렇지 않다면, "두 점수는 다름"이라고 출력
			 */
			
			if(kor == eng) {
				System.out.println("두 점수가 동일");
			} else {
				System.out.println("두 점수가 다름");
			}
			
			// 두 점수 맞바꾸기 => 두 변수의 값을 바꾸기
			// kor=30, eng=50
			// [바꾼 후] kor=50, eng=30
			
			int temp=kor;
			kor=eng;
			eng=temp;

			System.out.printf("국어 : %d, 영어 = %d\n", kor, eng);

			
	}

}
