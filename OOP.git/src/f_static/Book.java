package f_static;
/*
 * static : 공유
 * 	'메모리 단 하나 설정(지정)-메모리 공유
 * 	'클래스명 접근(******)
 * 
 */
public class Book {
	private static int count; //멤버변수 생성
	static { //static 초기화. 단 1회
		System.out.println("딱 한 번");
	} 
	public Book(){
		count++;
	}
	public static int getCount() {
		
		return count;
	}
}
