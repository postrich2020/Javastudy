package i_access3;

import i_access3.sub.Access;

// Access클래스와 MainTest 클래스가 다른 패키지(폴더, 디렉토리) 안에 있는 상황

public class MainTest extends Access{
	//Access 부모클래스, MainTest 자식클래스

	public static void main(String[] args) {
		MainTest acc = new MainTest();  //Access에서 자식클래스인 MainTest로 변경
		//acc.a="프라이빗 변경";
		acc.b="퍼블릭 변경";
		acc.c="프로텍티드 변경";
		//acc.d="디폴트 변경";
		
		acc.output();

	}

}
