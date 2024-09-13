package c_control;

import java.util.Scanner;

public class prac04_별삼각형 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("출력 유형을 입력하세요.(1~3) : ");
		int ty=input.nextInt();					//출력 종류
		System.out.println();
		if( ty>3|ty<1){
		System.out.print("범위를 벗어났습니다.");
			
		} else
		{
		System.out.print("출력할 층 수를 입력하세요.(1~100) : ");
		int hei=input.nextInt();				//높이 입력
		System.out.println();
		
		if (hei>100|hei<1) {
		System.out.print("범위를 벗어났습니다.");
		} else {
		
		
		
		switch(ty) {
		case 1 :												//타입1
			for (int i=1;i<=hei;i++) {
				for (int j=1;j<=i;j++) {
				System.out.print("*");
				}			// for-j
				System.out.println();
			}				//for-i
			break;
		case 2 :												//타입 2
			for (int i=1;i<=hei;i++) {
				for (int j=hei-i+1;0<j;j--) {
				System.out.print("*");
				}			// for-j
				System.out.println();
			}				//for-i
			break;
		case 3 :												//타입 3
			for (int i=0;i<hei;i++) {						//공백 출력
				for (int j=hei-i;1<=j;j--) {
				System.out.print(" ");
				}			// for-j
				
				for (int j=1;j<=(i*2+1);j++) {		//*출력
				System.out.print("*");
				}			// for-j
				System.out.println();
			}				//for-i
			break;
		}		//switch
		}
		}
	}			// main

}			// class
