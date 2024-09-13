package b_operator;
/*
 * 산술연산자 : + - * / %(% : 나머지)
 */

import java.util.*;



public class Ex03_산술 {

	public static void main(String[] args) {
		
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력 하시오 : ");
		a=input.nextInt();
		
		System.out.print("두 번째 수를 입력 하시오 : ");
		b=input.nextInt();
		
		int c,d,e,f,g;
		
		c=a+b;
		d=a-b;
		e=a*b;
		f=a/b;
		g=a%b;
		
		
		System.out.println(a+" + "+b+" = "+c); //더하기
		System.out.println(a+" - "+b+" = "+d); //빼기
		System.out.println(a+" × "+b+" = "+e); //곱하기
		System.out.println(a+" ÷ "+b+" = "+f); //나누기
		System.out.println("나머지 = "+g); //나머지
			}

}

/* [콘솔창에서]

첫번 째 숫자 입력 --> __ (ex) 20
두번 째 숫자 입력 --> __ (ex) 15

더하기 : 35
빼기 : 5
곱하기 : 300
나누기 : 1
나머지는 : 5

*/