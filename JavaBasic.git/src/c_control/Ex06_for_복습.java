package c_control;

import java.util.Scanner;

public class Ex06_for_복습 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int su=input.nextInt();
				
		for(int i=0; i<su; i++) {				//행(row)
			
			//공백을 추가
			for(int j=su-i;0<j;j--){
				System.out.print("  ");
			}
						
			for(int j=0;j<=i;j++) {			// 문자(열:column)
				System.out.print(j+1);
				
			}
			System.out.println();
		}


	}

}
