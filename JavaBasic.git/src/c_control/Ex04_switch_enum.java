package c_control;


enum Size{ //변수 식별을 용이하게 함.
	SMALL,
	MEDIUM,
	LARGE
	}

public class Ex04_switch_enum {

	public static void main(String[] args) {
		/*
		 * small : 1, medium : 2, large : 3으로 프로그램 처리
		 */
		
//		int size = 1; //화면에서 넘어오는 값 상상하기
//		switch(size) {
//		case 1 : System.out.println("작은 것");break;
//		case 2 : System.out.println("중간 것");break;
//		case 3 : System.out.println("큰 것");break;
//		}

		Size size = Size.SMALL;	//화면에서 넘어오는 값 상상하기
		
		switch(size) {
		case SMALL : System.out.println("작은 것");break;
		case MEDIUM : System.out.println("중간 것");break;
		case LARGE : System.out.println("큰 것");break;
		}
	}

}
