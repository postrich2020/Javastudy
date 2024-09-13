package k_final;
/*
 *    final : 변경 불가
 *    
 *    			- class : 부모클래스 못됨
 *    			- field : 값 변경
 *    			- method : overriding
 */

final class Parent{ //final 영향으로 부모 class가 될 수 없음
	final String field = "부모님꺼"; //final기능 영향으로 20라인 변경 기능 불가
	final void jib() { //final 영향으로 23라인 오류
		System.out.println("부모님이 만드신 집");
	}
}

class Child extends Parent{
		Child(){
			//field ="내꺼";
		}
//		void jib() {
//			System.out.println("자식이 탕진");
//		}
}
public class Test {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.field);
		p.jib();

	}

}
