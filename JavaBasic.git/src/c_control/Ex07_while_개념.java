package c_control;
/*
   반복문
   - for 문
   - while문
   - do~while문
  
   for(초기치 : 조건문; 증가치){
   반복문장;
   }
  
   초기치;
   while(조건문){
   반복문장;
   증가치;
   }
 */

import java.util.Scanner;

public class Ex07_while_개념 {

	public static void main(String[] args) {

		//		int sum=0;
//		for(int i=1; i<=1;i++) {
//			sum+=i;
//			
//		}
//		System.out.println("합 : "+sum);
		
		int sum=0;
		int i=1;
		while(i<=10) {
			sum+=i;
			i++;
			
		}
		System.out.println("합 : "+sum);
		
		//단 수를 입력 받아 구구단을 출력
		Scanner input = new Scanner(System.in);
		System.out.println("단 입력 -> " );
		int dan = input.nextInt();
		//[ex] 2*1=2
		//
		//       2*9=18
		
		for(int i2=1; i2<=9;i2++) {
			System.out.printf("%d * %d = %d \n", dan, i2, dan*i2);
		} //end of for
			System.out.println();
		
			// for문을 while문으로 변형
		int i3=1;
		while(i3<=9) {
			System.out.printf("%d * %d = %d \n", dan, i3, dan*i3);
			i3++;
		} //end of for
		

	} // end of main

} //end of class
