package b_operator;

import java.util.Scanner;

public class Ex09_삼항복습 {

	public static void main(String[] args) {
		//두 수 중에서 큰 수를 출력
		int a=5, b=10;
		int max;
		if(a>b) {
			max=a;
		} else {
			max=b;
		}
		System.out.println("두 수 중 큰 수는 "+max);
		
		//두 수를 입력받아서 그 두 수 중 큰 값을 출력
		Scanner input = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력하세요");
		int c=input.nextInt();
		System.out.print("두 번째 수를 입력하세요");
		int d=input.nextInt();
		
		int max2= c>d ? c:d;
		System.out.println("두 수 중 큰 수는 "+max2);

	}

}
