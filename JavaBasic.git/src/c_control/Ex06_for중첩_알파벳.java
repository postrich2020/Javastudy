package c_control;

import java.util.Scanner;
public class Ex06_for중첩_알파벳 {

	public static void main(String[] args) {
		
		//알파벳 한 줄에 출력
		
		for (int j=1;j<=26;j++) {		//26회 반복
			System.out.print(j+"  ");
		for (char ch='A';ch<='A'+j-1;ch++) {	//알파벳 출력
			System.out.print(ch+" ");
		}
		System.out.println();
		}

	}

}
