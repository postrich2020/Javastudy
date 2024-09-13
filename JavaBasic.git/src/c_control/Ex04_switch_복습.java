package c_control;

public class Ex04_switch_복습 {

	public static void main(String[] args) {


		int kor=90, eng=80, math=70;
		int total=kor+eng+math;
		int avg=total/3;
		System.out.println("평균 : "+avg);

		char score='\u0000';  //유니코드 0을 초기화 할 때. JAVA스러운 초기화 방법
		switch(avg/10) {
		case 10:								// 100점 case에 break;가 없으므로, 다음 case9에서 정의한 score='A'가 실행 됨. 자연스럽게 100점도 'A'가 됨.
		case 9:	score='A'	; break;
		case 8:	score='B'	; break;
		case 7:	score='C'	; break;
		default :  score='F';
		
		}
		
		System.out.println("당신의 학점은 "+score);
	}

}

/*
 * 평균을 구해서 90이상이면 'A'학점
 * 90미만 80이상이면 'B'학점
 * 평균이 70이상면 'C'학점
 * 그 외는 'F'
 * (switch 문 이용)
 */

