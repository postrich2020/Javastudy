package c_control;

import java.util.Scanner;

public class Ex05_for_연습 {

	public static void main(String[] args) {

		/*
		 * 문제 1)1~ N까지의 숫자를 다음처럼 출력하라
		 * 
		 * 1 2 3 4 5
		 * 
		 * 6 7 8 9 10
		 * 
		 * 11 12 13 14 15
		 */

		for (int i = 1; i <= 15; i++) {
			System.out.print(i + " ");
			if (i % 5 == 0) {
				System.out.println();
			}
		}

		/*
		 * 문제2) 문자열처리하기
		 * 
		 * ​
		 * 
		 * 문자 N(a~z, A~Z)를 입력받아 N이 소문자면 a부터 N까지 인쇄하고
		 * 
		 * N이 대문자이면 문자 N부터 Z까지 출력하라
		 * 
		 * 그 밖의 문자가 입력되면 Error 를 출력하라
		 * 
		 * ​
		 * 
		 * 입력 출력
		 * 
		 * f abcdef
		 * 
		 * X XYZ
		 * 
		 * 6 Error
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("문자 하나를 입력하세요 : ");
		char ch = input.next().charAt(0);
		// char ch = (char)input.extInt(); --> 자료형 매치 문제 발생할 수 있음.

		// 소문자인지 여부
		if (ch >= 'a' & ch <= 'z') {
			for (char i = 'a'; i <= ch; i++) {
				System.out.print(i);

			}
		} else if (ch >= 'A' & ch <= 'Z') {
			for (char i = ch; i <= 'Z'; i++) {
				System.out.print(i);
			}
		} else {
			System.out.print("Error");
		}
		System.out.println();
		System.out.println();

		/*
		 * 문제3 ) 입력받은 문자열의 뒤집어서 출력하세요
		 * 
		 * ​
		 * 
		 * [예] 입력 -> 출력
		 * 
		 * 
		 * 
		 * 안녕 친구 -> 구친 녕안
		 * 
		 * CarpeDiem -> meiDepraC
		 * 
		 * 
		 * 
		 * [힌트] 문자열의 길이 구할 때 length() 이용
		 */

		Scanner inputex = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = inputex.nextLine();
		int leng = str.length();										// 입력 문자열의 길이 산출

		for(int k=1;k<=leng;k++) { 								// 입력 문자열 길이 수만큼 반복
			System.out.print(str.charAt(leng-k));			// 역순으로 출력
		}
		System.out.println();

		for (int j = 1; j <= leng; j++) {
			System.out.print(str.substring(leng - j, leng - j + 1));

		}

	}

}
