package d_array;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Student[] s= new Student[3];  //배열 new
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<s.length ; i++) {
			//*****  
			s[i] = new Student(); //객체 new student에 대해서는 배열과 객체 모두 생성 시켜야 한다.
			System.out.println("학생명 입력 -> " );
			s[i].setName(input.next());
			
			System.out.println("국어 점수 -> " );
			s[i].setKor(input.nextInt());
			
			System.out.println("영어 점수 -> " );
			s[i].setEng(input.nextInt());
			
			System.out.println("수학 점수 -> " );
			s[i].setMath(input.nextInt());
			
			System.out.println("총점 : "+s[i].calTotal());
			System.out.println("평균 : "+s[i].calAvg());
		}

	}

}
