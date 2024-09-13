package b_operator;

import java.util.*; //Scanner(입력 기능)을 위한 기능 호출

public class Ex03_나머지 {
		public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
				// 나머지 연산자 활용 : 홀/짝수 구할 때
//			int a=11;
//			if(a%2==0) {
//				System.out.println("짝수");
//			} else {
//				System.out.println("홀수");
//			}
	 	int a;
		System.out.print("판별할 수를 입력하시오 : ");
	    a=input.nextInt();
	    if(a>0) {
	    if (a%3==0) {
	    	System.out.println("입력하신 수는 3의 배수가 맞습니다.");
	    } else {
	    	System.out.println("입력하신 수는 3의 배수가 아닙니다.");
	    }}else {
	    	System.out.println("판별 불가");
	    }
	  

}
}
