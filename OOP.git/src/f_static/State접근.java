package f_static;

public class State접근 {
	static String name = "홍길동";
	public static void main(String[] args) {
		System.out.println("고객명 : "+name); //4번 행에 name을 설정했어도, 메모리에 name 값이 올라오지 않아 값을 찾지 못하기 때문에, 값을 로딩 할 수 없는데, 이를 위해 static을 붙여야 한다. static을 붙임으로써 메모리에 값이 로딩 됨.

	}

}
