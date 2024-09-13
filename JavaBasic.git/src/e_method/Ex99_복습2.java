package e_method;


import java.util.*;
public class Ex99_복습2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("점수 입력 ->");
		int jumsu = input.nextInt();
		String result=pass(jumsu);
		
		//합격 여부 출력
		
		System.out.println(result);
		

	}
	
	/*
	 * 역할 : 입력 받은 점수를 넘겨 받아서 
	 * 		80점 이상이면 '합격', 그렇지 않으면, '불합격' 출력
	 */
	static String pass(int jumsu) {
		String result="";
		if(jumsu>=80) result="합격";
		else result="불합격";
		
		//System.out.println(result);
		return result;
	}

}
