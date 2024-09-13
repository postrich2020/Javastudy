package f_static;

public class NoState접근 {
	String name = "홍길동";
	public static void main(String[] args) {
		NoState접근 obj = new NoState접근(); //메모리에 name을 로딩 시키기 위해 클래스를 생성해줌.
		System.out.println("고객명 : "+obj.name); //main은 1회 로딩하여 실행 되므로 무한 반복 실행은 되지 않는다.

	}

}
