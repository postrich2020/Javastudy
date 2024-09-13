package A_basic;

public class MainTest {

	public static void main(String[] args) {
		//클래스 변수 선언
		Student s=null;
		//객체 생성
		s=new Student();
		
		//값지정 및 처리
//		s.name="홍길순";
//		s.kor=88;
//		s.eng=77;
//		s.math=60;
		s.setName("홍길순");
		s.setKor(88);
		s.setEng(77);
		s.setMath(60);
		
		//s.total=300;
		System.out.println(s.name+"님 총점 : "+s.calTotal());
		System.out.print(s.name+"님 평균 : "+s.calAvg());;
		
		

	}

}
