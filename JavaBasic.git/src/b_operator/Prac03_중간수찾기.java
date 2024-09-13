package b_operator;

/*
 * 입력 받은 세 값 중 두 번 째로 큰 값 찾기
 * ---------------
 * A>B 라면,
 * A>C 라면,
 * B>C 이면, B
 * B<C이면, C
 * 
 * A<C라면, A
 * ---------------
 * ---------------
 * A<B라면,
 * B>C라면,
 * A>C이면, A
 * A<C이면, C
 * 
 * B<C라면, B
 */

import java.util.Scanner;

public class Prac03_중간수찾기 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("첫 번 째 수를 입력하세요 : ");
		int a=input.nextInt();
		System.out.print("두 번 째 수를 입력하세요 : ");
		int b=input.nextInt();
		System.out.print("세 번 째 수를 입력하세요 : ");
		int c=input.nextInt();
		
		int max= a>b? a>c?a:c : b>c? b:c;
		int mid=a>b? a<c? a:c>b? c:b :b<c? b:a>c?a:c;
		int min= a<b? a<c?a:c : b<c? b:c;
		
		System.out.println("----------------------------------");
		System.out.println("세 수 중 가장 큰 수는 " + max);
		System.out.println("세 수 중 가운데 수는 " + mid);
		System.out.println("세 수 중 가장 작은 수는 " + min);
		
	

			
	}

}
