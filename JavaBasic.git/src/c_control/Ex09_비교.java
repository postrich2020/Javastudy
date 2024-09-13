package c_control;

import java.util.*;
public class Ex09_비교 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
/*		
		//for 사용시
		//구구단 출력 반복 횟수를 묻고 해당 횟수 만큼 반복
		System.out.print("구구단 출력을 몇 번 실행 할까요? ");
		int su = input.nextInt();
		System.out.println();
		
		for (int a=0; a<su; a++) {
		System.out.print("출력할 단 = ");
		int dan = input.nextInt();
		for (int i=1;i<=9;i++) {
			System.out.printf(" %d * %d = %d \n",dan,i,dan*i, args);
			
		}// end of i
		
		System.out.println();
		System.out.println();
		} //end of a
*/
		
		/*
		//while 사용시
		//계속해서 반복 하다가 종료 요청시 반복 종료
		
		while(true) {
		System.out.println("단 입력 -> ");
		int dan = input.nextInt();
		for(int i=1; i<=9;i++) {
			System.out.printf(" %d * %d = %d \n", dan, i, dan*i);
		}
		System.out.println("종료할까요?(Y/N)");
		String answer=input.next();
		if(answer.equals("Y")|answer.equals("y")) break;
		
		}
		*/
		
		/*

		//do ~ while 사용시
		//계속해서 반복 하다가 종료 요청시 반복 종료
		
		String answer = "";	
		do {
		System.out.println("단 입력 -> ");
		int dan = input.nextInt();
		for(int i=1; i<=9;i++) {
			System.out.printf(" %d * %d = %d \n", dan, i, dan*i);
		}
		System.out.println("다시 할까요?(Y/N)");
		answer=input.next();
		}while(answer.equals("Y")|answer.equals("y"));
		
		*/
	} //end of main

} //end of class
