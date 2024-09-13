package e_method;

import java.util.Scanner;

public class Ex99_복습4 {

	public static void main(String[] args) {
		

	
	
	Scanner input1 = new Scanner(System.in);
	PRACTICE1:
		while(true) {
	System.out.print("문제 번호를 입력하시오(1~4) : ");
	int choice1=input1.nextInt();
	
	switch(choice1) {
	case 1:{
		while(true) {
		problem1();
		substract(10,8);
		}break; //end of while
	} //end of case1
	
	case 2:{
		while(true) {
			problem2();
		System.out.println("case2");break;
		}break; //end of while
	}//end of case 2
	
	case 3:{
		while(true) {
		System.out.println("case3");break;
		}break; //end of while
	}//end of case 3
	
	case 4:{
		while(true) {
		System.out.println("case4");break;
		}break; //end of while
	}//end of case 4
	
	default :{
		System.out.println("종료합니다."); break PRACTICE1;
	}//end of default
	} //end of switch
	
		} // end of while
	} //end of main
} // end of class

	static void problem1() {
	
	/*
	 * 1. 정수형 데이터(int) 2개를 매개변수로 받아서 뺄셈 연산을 수행하여 결과값을 반환하는 
	 * subtract 메소드를 선언하고, 입력 받은 두 수를 인자로 보내서 그 메소드를 호출하여 
	 * 결과값을 출력하는 프로그램을 작성하시오.
	 */
	
	static int substract(int a, int b) {
		int result = a-b;
		return result;
	}
	} //end of problem1
	
	static void problem2() {
	/*
	 * 2. 정수형 데이터 1개를 매개변수로 받아서 해당되는 문자열(인사말)을 모니터로 출력하는 메소드 greeting를 선언하고, 입력 받은 정수형 데이터를 인자로 보내서 그 메소드를 호출합니다.

단, 그 정수 데이터에 따라 다음과 같은 인사말을 출력합니다.

( 1-안녕하세요, 2-굿모닝, 3-올라, 4-곤니치와 )
	 */	
		Scanner input = new Scanner(System.in);
		System.out.println("인사말을 선택하세요(1~4) : ");
		int greet = input.nextInt();
		greeting(greet);
	} //end of problem2
	static void greeting(int greet) {
		switch(greet) {
		case 1:{
			System.out.println("안녕하세요"); break;
		}
		case 2:{
			System.out.println("굿모닝"); break;
		}
		case 3:{
			System.out.println("올라"); break;
		}
		case 4:{
			System.out.println("곤니치와"); break;
		}
		} //end of switch
	} //end of greeting
		
		