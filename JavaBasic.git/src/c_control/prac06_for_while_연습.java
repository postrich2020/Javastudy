package c_control;

import java.util.*;

public class prac06_for_while_연습 {

	public static void main(String[] args) {
		

		
		
		Scanner input = new Scanner(System.in);
		PRACTICE:
			while(true) {
		System.out.print("문제 번호를 입력하시오(1 ~ 4) : ");
		int ans=input.nextInt();						//문제 번호 선택

		switch(ans) {
		
		case 1:{
			//문제 1
			
			Scanner q1 = new Scanner(System.in);
			System.out.print("행 수를 입력하시오.(자연수) ");
			int row1=q1.nextInt();
			if(row1>0) {
			int a1=1;
		
			for (int i1=0;i1<row1;i1++) {
	
				//공백 출력
				for (int j1=0;j1<i1;j1++) {		
				System.out.print("  ");
				
				} //for j1
				
				// 숫자 출력
				for (int j1=0;j1<row1-i1;j1++) {	
				System.out.print(a1+" ");
				a1++;
				} //for j1
				

				
				System.out.println();
			} //for i1
			} else { //if
				System.out.println("범위를 초과 하였습니다.");
				break;
			}
			

		} break;//case 1
		
		case 2:{
			//문제 2
			
			Scanner q2 = new Scanner(System.in);
			System.out.print("행 수를 입력하시오.(1~6) ");
			int row=q2.nextInt();
			if(row>0 & row<=6) {
			char a2='A';
			int b2=0;
			for (int i2=0;i2<row;i2++) {
				
				// 문자 출력
				for (int j2=0;j2<row-i2;j2++) {			//문자 출력
				System.out.print(a2+" ");
				a2++;
				} //for j2
				
				//숫자 출력
				for (int j2=0;j2<i2;j2++) {		
				System.out.print(b2+" ");
				b2++;
				} //for j2
				
				System.out.println();
			} //for i2
			} else { //if
				System.out.println("범위를 초과 하였습니다.");
				break;
			}
		} break;//case 2	

		case 3:{
			
	//문제 3
			
			Scanner q3 = new Scanner(System.in);
			System.out.print("행 수를 입력하시오.(자연수) ");
			int row3=q3.nextInt();
			if(row3>0) {
			int a3=1;
		
			for (int i3=0;i3<row3;i3++) {
				for (int j3=0;j3<row3;j3++) {		
				System.out.print(a3+" ");
				a3+=2;
				if (a3>10) a3=1;
				
				} //for j3
								
				System.out.println();
			} //for i3
			} else { //if
				System.out.println("범위를 초과 하였습니다.");
				break;
			}
			

		}break;//case 3
		
		case 4:{
			//문제 4
			
			Scanner q4=new Scanner(System.in);
			System.out.print("시작 단 수와 연속 출력 갯수를 입력하세요. (5 3).단, 시작 단 수는 2~9단 입니다.");
//			int dan41=input.nextInt();
//			int dan42=input.nextInt();
			String str=q4.nextLine();
			StringTokenizer st = new StringTokenizer(str);
			int dan41=Integer.parseInt(st.nextToken());
			int dan42=Integer.parseInt(st.nextToken());
			
			if(dan41>=2 & dan41<=9) {		
			// 구구단 출력
			
			for(int j4=1;j4<=9;j4++) {  //*9 회 반복
			for(int i4=dan41;i4>(dan41-dan42);i4--) {		//출력 단수
				System.out.printf("%d × %d = %d    ",i4,j4,i4*j4); //구구단 출력
				
			} //for i4
			System.out.println();
			} //for j4
			} //if
			else {
				System.out.println("범위를 초과 하였습니다.");
				break;
			}//else
			
		}break;//case 4
		
		default : {
			System.out.print("종료합니다.");
			break PRACTICE;
		}//default
		
		} //switch
			}

	} //main

} //class
