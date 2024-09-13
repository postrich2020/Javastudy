package e_method;

import java.util.*;

public class prac02_메소드복습 {
	public static void main(String[] args) {
		
		String[] makesq =input();
		output(makesq);
		
	}
	
	static String [] input() {
		// 두 정수와 알파벳 문자 하나를 입력 받는다.
		
		Scanner input = new Scanner(System.in);
		System.out.println("두 정수와 시작할 알파벳을 입력 하시오([예] 3 4 F)");
		String str=input.nextLine();
		StringTokenizer st= new StringTokenizer(str);
		String [] makesq = new String[3];
		
		for (int i=0;i<3;i++) {
			makesq[i]=(st.nextToken());
		}
		return makesq;
		
	}
	static void output(String [] makesq) {
		// 출력될 값을 저장한다.
		int row=Integer.parseInt(makesq[0]);
		int col=Integer.parseInt(makesq[1]);
		char ch=(char)makesq[2].charAt(0);
		char [][] makesquare = new char [row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(ch+" ");
				makesquare[i][j]=ch;
				ch++;
			}
			System.out.println();
		}

	}

	}
		
	

