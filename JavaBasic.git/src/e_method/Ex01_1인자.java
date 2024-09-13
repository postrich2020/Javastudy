package e_method;

/*
 * 인자 - argument
 * 매개변수 - parameter
 * 
 * 인자 : = 매개변수   // 개념이 다르긴 하지만, 혼용해서 사용함.
 */

public class Ex01_1인자 {

	public static void main(String[] args) {
		//데이타
		int a=10, b=20;
		
		add(a, b); //인자 : arument //가져가는 값

	}
	static void add(int a, int b) {  //매개변수 : parameter  //인자로 가져온 것을 받음
		//데이타에 대한 처리
		int sum = a+b;
		System.out.println("합 : "+sum);
	}

}
