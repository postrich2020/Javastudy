package e_method;

public class Ex00_흐름 {

//	public static void main(String[] args) { //static이 붙어있는 그룹은 static이 붙지 않은 그룹을 호출할 수 없음.
//		
//		System.out.println("main 시작");
//		method();
//		
//		System.out.println("main 끝");
//
//	}
//	
//	static void method() { //main에 static이 있기 때문에, static을 넣어야 함.
//		System.out.println("method 실행");
//		
//	}
	
	static void method() { //main에 static이 있기 때문에, static을 넣어야 함.
		System.out.println("method 실행");
	}
	public static void main(String[] args) { //static이 붙어있는 그룹은 static이 붙지 않은 그룹을 호출할 수 없음.
		
		System.out.println("main 시작");
		method();
		method();
		method();
		
		System.out.println("main 끝");

	}
	

		
	
	

}
