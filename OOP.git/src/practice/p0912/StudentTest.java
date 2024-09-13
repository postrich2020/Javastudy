package practice.p0912;

public class StudentTest {

	public static void main(String[] args) {
		
		// Student 클래스 참조 배열 선언 및 생성
		Student arrays[]=new Student[3];
		
		//Student 값을 배열에 넣는다.
		arrays[0]=new Student ("홍길동", 20, 171, 81, "201101", "영문");
		arrays[1]=new Student("고길동",21, 183, 72, "201102","건축");
		arrays[2]=new Student("박길동",22, 175, 65, "201103","컴공");

		//배열에 있는 객체 정보를 호출하여 Student 클래스 출력 서식에 따라 모두 출력
		for(int i=0;i<arrays.length;i++) {
		System.out.println(arrays[i].printInformation());
		}
	}

}
