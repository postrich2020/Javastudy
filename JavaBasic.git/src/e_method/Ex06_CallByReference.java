package e_method;

/*
 * call by reference
 * 			: 매소드의 인자(파마메터)의 자료형이 참조형인 경우 // 값이 아닌 주소를 복사
 *  ==> 주소만 복사
 */

public class Ex06_CallByReference {

	public static void main(String[] args) {

			StringBuffer a = new StringBuffer("안녕");
			StringBuffer b = new StringBuffer("하이");
			
			add(a, b);
			System.out.println("2. A="+a+", B="+b);

	}
	
	static void add(StringBuffer a, StringBuffer b) {
		a.append(b);
		System.out.println("1. A="+a+", B="+b);
	}

}
