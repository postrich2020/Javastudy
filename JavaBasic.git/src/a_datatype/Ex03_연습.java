package a_datatype;

public class Ex03_연습 {

	public static void main(String[] args) {
				
			double kor; 				// 국어점수 변수 선언
			double eng; 				//영어점수 변수 선언
		
			kor = 91; 				// 국어점수 변수에 90점 지정
			eng = 100;			// 영어점수 변수에 100점 지정
			
			double tot;		 			// 총점 변수 선언
			tot = kor + eng;	// 총점 계산하기
			
			double avg;
			avg=tot/2;
			
		
			System.out.println("국어 : "+kor+"점");	// 국어 출력
			System.out.println("영어 : "+eng+"점");	// 영어 출력
			System.out.println("============");	
			System.out.println("총점 : "+tot+"점");	// 총점 출력
			System.out.println("평균 : "+avg+"점");// 평균을 구해서 출력


	}

}
