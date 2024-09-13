package b_operator;
/*
 * 대입연산자 =
 * 
 * 대입연산자 축약형 : 산술, 쉬프트, 이진논리에서 축약 가능.
 * 
 * a=a+b;  ==> a+=b;
 * a=a-b;  ==> a-=b;
 * a=a*b;  ==> a*=b;
 * a=a/b;  ==> a/=b;
 * a=a%b;  ==> a%=b;
 * 
 */
public class Ex10_대입 {

	public static void main(String[] args) {
		int a=10, b=7;
		
		a+=b;
		System.out.println("+ = 결과 : "+a);
		
		a=10;
		a-=b;
		System.out.println("- = 결과 : "+a);
		
		a=10;
		a*=b;
		System.out.println("* = 결과 : "+a);
		
		a=10;
		a/=b;
		System.out.println("/ = 결과 : "+a);
		
		a=10;
		a%=b;
		System.out.println("% = 결과 : "+a);

	}

}
