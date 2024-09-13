package c_control;
import java.util.Scanner;
public class Ex06_for중첩_숫자사각형 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 2개 입력 ->");
		int row = input.nextInt();
		int col=input.nextInt();
		
		
		for (int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}

	}

}
/*
 * 문제) 행과 열의 수를 입력 받아 다음과 같이 출력하는 프로그램을 작성하시오.
 * 입력
 * 3, 4
 * 
 * 출력
 * 1 2 3 4
 * 2 4 6 8
 * 3 6 9 12
 */
