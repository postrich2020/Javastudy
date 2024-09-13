package a_datatype;
/*
 * 자바에서 콘솔 입력받는 방법
 * 			- java.util.Scanner 클래스 이용
 * 			- 정수형 입력시 : nextInt()
 * 			- 실수형 입력시 : nextDouble()
 * 			- 문자열입력시 : next() / nextLine()  ***[숙제] 차이점???
 * 
 */

//[참고] 자주사용하는 기본적인 클래스는 java. lang 패키지
// import java.lang.*;

import java.util.*; //input 기능을 위해 호출

public class Ex08_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int kor, eng, math;
			Scanner input = new Scanner(System.in);
			System.out.println("국어입력 -->");
			kor = input.nextInt();

			
			
			//영어점수 입력 받기, 수학점수 입력 받기, 출력
	
			System.out.println("영어입력 -->");
			eng = input.nextInt();
			
			
			
			System.out.println("수학입력 -->");
			math = input.nextInt();
			System.out.println("국어 : "+kor);
			System.out.println("영어 : "+eng);
			System.out.println("수학 : "+math);
			
			// 총점 구해서 출력
			// 평균 구해서 출력
			int tot;
			double avg;
			
			
			tot=kor+eng+math;
			avg=tot/3;
			System.out.println("=========== ");
			System.out.println("총점 : "+tot);
			System.out.println("평균 : "+avg);
	}

}
