package e_method;

public class Ex03_인자와반환 {

	public static void main(String[] args) {
		//데이타
		int a =10, b=20;
		int sum = add(a, b);
		
		//결과
		System.out.println("합 : "+sum);
		

	}
	static int add(int a, int b) {  //파라미터 변수명은 달라도 되지만, 착오를 줄이기 위해 인자와 같은 이름을 사용
		//데이타처리
		int sum=a+b;
		return sum;
	}

}
