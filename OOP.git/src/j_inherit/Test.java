package j_inherit;

public class Test {

	public static void main(String[] args) {
		/*
		 * Umma u=new Umma();
		u.gene();
		u.job();
		
		Ddal d = new Ddal();
		d.gene();
		d.study();
		
		d.job(); //부모꺼 호출 가능
		*/
		
				
		//@@@@@@@
		//변수는 부모 클래스이고, 객체 자식 클래스
//		Umma dal = new Ddal();
//		dal.job();
//		//dal.study();
//		dal.gene(); //*자식의 오버라이딩함수 호출

		//@@@@@@@ casting
		//참조형에서 부모자식간에 캐스팅 가능
		/*
		 * [아래 경우는 안됨]
		 * String a = new String();
		 * StringBuffer b = (StringBuffer) a; //-> 불가
		 */
		
//		Umma a = new Umma();
//		Ddal d=(Ddal)a; //메모리에 로드가 안되어있어 에러
		
//		Ddal d= new Ddal();
//		Umma a = (Umma)d; //up casting
//		Ddal d2=(Ddal)a; //down casting
		
		//연산자 : instanceof
		Ddal d = new Ddal();
		
		if(d instanceof Ddal) {
			System.out.println("Ddal 클래스 객체");
			
		}
		if(d instanceof Umma) {
			System.out.println("Umma 클래스 객체");
		}
		
	}

}
