package practice.p0912;
// 03. 상속 관계 설정
public class Student extends Human {
//---------------------
//초기화
	
// 04. 변수 선언
	//멤버변수
	private String number="", major="";
	
	//05. 변수 값 설정-자식인자 생성자
	Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number=number;
		this.major=major;
	}
	
	
	//초기화 완료
	//-------------------------

	//출력 함수
	public String printInformation() {
		String str;
		str=name+" "+age+" "+height+" "+weight+" "+number+" "+major;
		return str;
	}

	
}
