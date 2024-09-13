package d_array;

/*
    학생수를 입력하세요 -> 5
    
    0번 학생의 국어점수를 입력하세요 -> 
    0번 학생의 국어점수를 입력하세요 -> 
    0번 학생의 국어점수를 입력하세요 -> 
    0번 학생의 국어점수를 입력하세요 -> 
    0번 학생의 국어점수를 입력하세요 -> 
    
    위 학생들의 총점은 xxx입니다.
    위 학생들의 평균은 yyy입니다.
    
 */

import java.util.*;

public class Ex02_성적2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요 ->");
		int su = input.nextInt();
		
		int[]kor=new int[su];
		
		for(int i=0; i<kor.length;i++) {
			System.out.println(i+"번 학생의 국어점수를 입력하세요 ->");
			kor[i]=input.nextInt();
			
		} // end of for
		
		// 총점 구하기
		int total=0;
		
		for(int i=0; i<kor.length;i++) {
			total+=kor[i];
			
		} // end of for
		
		
		//총점과 평균 출력
		System.out.printf("총점은 : %d,  평균은 : %d",total,total/kor.length);
		
	} //end of main

} //end of class
