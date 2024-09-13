package a_datatype;

public class Ex05_복습 {

	public static void main(String[] args) { //자바의 시작점을 알림
		// TODO Auto-generated method stub
				// 나이를 저장할 변수 선언하고 본인의 나이를 대입한 후 출력
				int myage=45;
				System.out.println("나의 연령은 "+myage+"세 입니다.");
				
				// 본인의 키를 소숫점 포함한 데이타로 저장하고 출력
				double hei=175.6;
				System.out.println("나의 키는 "+hei+"cm 입니다.");
				
				
				// 이름 저장할 변수를 선언하고 이름을 대입 후 출력
				char name1 = '홍';
				char name2 = '길';
				char name3 = '동';
				System.out.print(name1);System.out.print(name2);System.out.println(name3);
				
				//******
				//문자 : char
				//문자열 : String(클래스-참조형)
				
				String strname = "홍길자";
				System.out.println("이름은 " + strname+"입니다.");
	}

}
