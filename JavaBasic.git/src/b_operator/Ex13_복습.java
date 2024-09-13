package b_operator;

public class Ex13_복습 {
	
	public static void main(String[] args) {
		// 국어점수 45점, 영어점수 67점, 수학점수 77점,
		int kor=45, eng=67, math=77;
		int 토탈=kor+eng+math;
		
		//총점이 150보다 크고 250보다 작으면 '보통반 입니다.' 출력
		if(토탈 >150 & 토탈 < 250) {
		System.out.println("보통반 입니다.");
		}
		
//		if(150<total<250) {										//잘못된 비교 구문
//			System.out.println("보통반 입니다.");
//		}
	}
}
