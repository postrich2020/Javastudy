package b_operator;

import java.util.Scanner;
public class Prac02_큰수찾기 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("첫 번 째 수를 입력하세요 : ");
		int a =input.nextInt();
		System.out.print("두 번 째 수를 입력하세요 : ");
		int b=input.nextInt();
		System.out.print("세 번 째 수를 입력하세요 : ");
		int c=input.nextInt();
		
		int max = a>b ? a > c ? a:c :b>c?b:c;
		System.out.print("세 수 중 가장 큰 수는 "+max+"입니다.");

	}

}
