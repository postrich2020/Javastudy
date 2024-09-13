package prac_0911_01;

import java.util.*;

import e_exercise.GradeExpr;

public class Main {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		String accountName="", accountNum="";
		int accountBa=0, cred=0;
	



			//1. 신규 생성
			
			System.out.println("예금주를 입력하세요");
			accountName=input1.next();
			System.out.println("계좌번호를 입력하세요");
			accountNum=input1.next();
			System.out.println("잔액을 입력하세요");
			accountBa=input1.nextInt();

			//acc객체 생성. 호출 : Account 클래스
			Account acc=new Account(accountName,accountNum, accountBa);
					
			acc.Output();
			PRACTICE1:	
		while(true) {
			
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 리스트조회");
			System.out.println("4. 종료");
			System.out.println("번호를 선택하세요(1~4) : ");
		
			int choice1=input1.nextInt();
	
				
			
			switch(choice1) {
			
			case 1 :{
				//1. 입금

				System.out.print("입금액 :");
				cred=input1.nextInt();
				acc.Deposit(cred);
				acc.Output();
				break;	
			}
			
			case 2 :{
				//2. 출금
				System.out.print("출금액 :");
				cred=input1.nextInt();
				acc.Withdraw(cred);
				acc.Output();
				break;	
			}
			
			case 3 :{
				//3. 리스트 조회
				acc.Output();
				
				break;	
			}
			
			case 4 :{
				//종료
				
				System.out.println("종료합니다."); break;
			}
			
			default :{
				System.out.println("종료합니다."); break PRACTICE1;
			}
			
			} //end of switch

			
			

		} //end of while
		
		
		
}
}
