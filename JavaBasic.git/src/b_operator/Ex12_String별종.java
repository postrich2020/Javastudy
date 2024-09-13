package b_operator;
/*
 * 문자열 처리하는 클래스
 *   - String
 *   - StringBuffer / StringBuilder
 *   
 *   
 */
public class Ex12_String별종 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("홍길동");
		sb.append("바보");
		//sb=sb+"바보";
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder("홍길동");
		sb2.append("바보");
		//sb=sb+"바보";
		System.out.println(sb2);
		
		// String str = new String("홍길자");
		//[특권] new 생략 가능
		//           + 연산자 가능
		String str="홍길자";
		str+="바보";		//str=str+"바보";
		System.out.println(str);
		
	}

}
