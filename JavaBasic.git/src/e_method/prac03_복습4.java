package e_method;

import java.util.Scanner;

public class prac03_복습4 {

	public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			System.out.println("인사말을 선택하세요(1~4) : ");
			int greet = input.nextInt();
			greeting(greet);
		}
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
				System.out.println("63곤니치와"); break;
			}
			}
		}
	}

