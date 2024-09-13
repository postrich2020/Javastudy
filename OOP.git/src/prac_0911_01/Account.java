package prac_0911_01;

import java.util.Scanner;

public class Account {
	public String accountName, accountNum;  //예금주, 계좌번호를 전용으로 갖는다. 멤버변수 생성.
	public int accountBa; //잔액을 전용으로 갖는다.
	

	public Account(String accountName, String accountNum, int accountBa) { //생성자 초기화
		this.accountName=accountName;
		this .accountNum=accountNum;
		this.accountBa=accountBa;
	}
	
	public void Withdraw(int cred) {
		if (cred>accountBa) {
			System.out.println("잔액이 부족합니다.");
		} else {
			accountBa-=cred;
			System.out.println("출금 요청이 정상 처리되었습니다.");

			
		}
	}
	
	public void  Deposit(int cred) {
			accountBa+=cred;
			System.out.println("입금 요청이 정상 처리되었습니다.");

	}
	
	public void Output() {
		System.out.println();
		System.out.print("예금주 : "+accountName);
		System.out.print(" / 계좌번호 : "+accountNum);
		System.out.println(" / 잔액 : "+accountBa);
		System.out.println();
	}
	
	

}
