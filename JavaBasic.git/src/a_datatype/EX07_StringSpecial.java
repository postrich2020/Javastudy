package a_datatype;
/*
 * @@@@@@@@@
 * String : 클래스임(참조형)
 *       -> 참조형은 무조건 new 연산자로 메모리 확보해야 함
 *       
 *       => 단, 하나 String 특권으로 new 생략해도 됨.
 *       
 */
public class EX07_StringSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String name = "홍길동";
	       
	       String name2 = "박길동";
	       
	       /*
	        * name 변수의 값과 name2 변수의 값이 같다면, "이름이 같다" 출력
	        * 그렇지 않다면, "이름이 다르다" 출력
	        */
	       if(name == name2) {
	    	   System.out.println("주소가 같음.");
	       }else {
	    	   System.out.println("주소가 다름.");
	       }
	       
	       	//문자열 값을 비교한다면???
	       if(name.equals(name2)) {  // 변수값이 주소를 비교하는 것이 아니라, 문자열 값인 참조값을 비교하려면, equals를 사용.
	    	   System.out.println("이름이 같음.");
	       }else {
	    	   System.out.println("이름이 다름.");
	       }
		
		
		
	}

}
