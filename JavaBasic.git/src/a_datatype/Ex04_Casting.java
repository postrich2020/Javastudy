package a_datatype;
/*
 * [참고] 자료형
 * 1. 기본형
 *      '논리형 : boolean
 *      '문자형 : char(2Byte)
 *      '정수형 : byte(1Byte), short(2Byte), int(4Byte), long(8Byte)
 *      '실수형 : float(4Byte), double(8Byte)
 *      
 * 2. 참조형 : 배열, 클래스
 * 
 * [기본]
 * 		변수의 자료형과 값의 자료형이 일치

 *[참고]
 *			변수의 자료형과 값의 자료형이 안 맞는 경우
 *					'변수의 자료형 > 값의 자료형 : 자동 해결
 *					'변수의 자료형 < 값의 자료형 : 자료형 변경(casting)
 *
 */
public class Ex04_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float f;
		// f = 3.6; //에러 발생
		f=(float)3.6F; //casting된 상황
		System.out.println("f = "+f);
		
		double d;  //8Byte
		d=100;		// 공간 8byte, 값 4byte
		System.out.println("d=" + d);
		
		//정수형변수 i에 36.99 실수대입하고 출력
		int i;
		i = (int)36.99;
		System.out.println("i="+i);

		
		int su;
		//su=10000000000;
		long big;
		big=10000000000L; //long 으로 casting시 'L'을 붙일 것. 소문자는 1과 잘 구분이 되지 않으니, 대문자 "L"을 사용.
		System.out.println("큰 수 : "+big);
	}

}
