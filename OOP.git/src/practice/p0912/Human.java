package practice.p0912;

public class Human {
	//-------------------------
	//초기화
	
	// 01. 변수 선언
	//멤버변수
protected String name;
protected int age, height, weight;

  // 02. 변수 값 설정-부모인자 생성자
public Human(String name, int age, int height, int weight) {
	this.name=name;
	this.age=age;
	this.height=height;
	this.weight=weight;

}

//초기화 완료
//-------------------------

//출력 함수
public String printInformation() {	
	String str=name+" "+age+" "+height+" "+weight;
	return str;
}

}
