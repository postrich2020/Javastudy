package a_datatype;
/*
   9    : 숫자 9
   '9'  : 문자 9
   "9" : 문자열 9 
 
 
 */


public class Ex02_Valuable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//------------------------------------
		// [1] 변수를 선언
		char testCh;				// 문자변수 testCh 선언
		int jungsu;					// *정수형 변수 jungsu 선언
		double silsu;				//* 실수형 변수 silsu 선언
		boolean ok;					// * 논리형변수 ok 선언
		
		//------------------------------------
		// [2] 값을 지정(대입)
		testCh = '깡';			// testCh 변수에 '깡' 문자 지정(대입)
		jungsu = 10000;		// *jungsu 변수에 10000 숫자 지정
		silsu = 3.6;				// *선언한 실수형 변수에 3.6 저장
		ok = true;				// *ok 변수에 참(true) 지정(저장, 대입)
		
		//------------------------------------
		//[3] 출력
		System.out.println("문자변수 : "+testCh);
		System.out.println("정수변수 : "+jungsu); //*jungsu 변수를 출력
		System.out.println("실수형변수 : "+silsu); //*선언한 실수형 변수를 출력
		System.out.println("논리형변수 : "+ok); //*선언한 논리형 변수를 출력
	}

}
