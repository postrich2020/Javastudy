package a_datatype;
/*
 * c언어의 문자 : Ascii_code
 * 					한 글자를 1byte(8bit)로 표현
 * 					256개 문자 표현
 * 
 * java언어의 문자 : unicode(with ascii-code)
 * 					한 글자를 2byte(16bit)로 표현
 * 					65535개 문자 표현
 * 
 */

/* 메모리 단위
 * 
 * 		'1bit : 0(off) / 1(on)
 * 		'8bit = 1byte
 * 		'1024byte = 1KB
 * 		'1024KB = 1MB
 * 		'1024MB = 1GB
 * 		'1024GB = 1TB
 * 
 */

/*
 * [십진수] 숫자 10개 : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
 * 
 * 		 365 = 3*10(2) + 6*10(1) + 5*10(0)
 * 				= 3*100    + 6*10     + 5*1
 * 				= 300        +60          +5
 * 
 * [이진수] 숫자 2개 : 0, 1
 *   		 	 11010 = 1*2(4) + 1*2(3) + 0*2(2) + 1*2(1) + 0*2(0)
 * 						= 1*16   + 1*8      + 0*4     + 1*2      + 0*1
 * 						= 16       + 8          + 0         + 2          + 0
 * 						= 26
 * 
 * [16진수] 숫자 16개 : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, a, b, c, d, e, f
 * 	  		   6F = 6*16(1) + F*16(0)
 * 					= 6*16     + 15*1
 * 					= 96         + 15
 * 					= 111
 * 
 * 
 * 
 */
public class Ex09_Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a; //4B 정수
			a='A'; //4B 변수에 2B 값 지정
			System.out.println(a);
			
			
			a='a'; //4B 변수에 2B 값 지정
			System.out.println(a);
			
			char ch=70;  // char ch = (char) 70;
			System.out.println(ch);
	}

}

/*
* [Ascii-code] 1B=8bit
* 
* 
*  -  -  -  -  -  -  -  -
*  0 1 0 0				 대문자
* 			    0 0 0 1  A
*  0 1 0 0 0 0 1 0  B
*  0 1 0 0 0 0 1 1  C
* 
* A : 0.000001 = 1*2(6) + 1*2(0)
* 						= 64 + 1
* 						= 65
* 
* 
*  -  -  -  -  -  -  -  -
*  0 1 1 0				 소문자
* 			    0 0 0 1  a
*  0 1 1 0 0 0 1 0  b
*  0 1 1 0 0 0 1 1  c
* 
*/