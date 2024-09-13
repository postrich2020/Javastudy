package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex_while_연습 {

	public static void main(String[] args) {
		
		/*
		< 최대값찾기 >

		​

		최대값은 가장 큰 값을 찾아내는 알고리즘이다. 

		사람은 데이타를 보면 척보고 어느것이 가장 크고, 어느것이 가장 작은지 알아낼 수 있다.

		그러나 컴퓨터는 본다, 비교한다 라는 기능을 자동으로 할 수 없으므로 두뇌가 행동하는 것과 같은 기능을 부여해야 한다. 

		최대값을 찾는 방법은 이렇다. 

		​

		우선 임의의 변수를 정의하고 예를 들어 max 라 하자. 

		​

		1. 이 변수에 첫번째 값을 입력한다. 

		2. 이 값이 가장 크다고 가정하고 다음번  데이타와 비교를 한다. 

		3. 이 변수에 저장된 값보다 큰 값이 들어오면 더 큰 값으로 바꿔치기를 한다. 

		4. 이 과정을 입력된 데이타가 끝날때 까지 반복하면 된다. 
		*/
		
		Scanner input=new Scanner(System.in);
		System.out.print("숫자 입력 (1 2 3 4) : ");
		String str=input.nextLine(); // 1 2 3 4
		
		StringTokenizer st = new StringTokenizer(str);
		
		int max=0; //int max=Integer.parseint(st.nextToken());
		
		while(st.hasMoreTokens()) {
			String token=st.nextToken();
			// System.out.println(token);
			int su = Integer.parseInt(token);
			if(max<su) max=su; //max=max<su?su:max;
			
		} // while
		System.out.println("큰 수 : " +max);
		
		
		/*
		문제 2)

		정수를 입력받아 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시오.

		​

		입력

		10 20 30 55 66 77 88 99 100 15

		​

		출력

		짝수 : 6개

		홀수 : 4개
		*/
		
		System.out.print("수를 나열 하시오.(1 2 3 4) : ");
		String eo=input.nextLine();
		
		StringTokenizer evod=new StringTokenizer(eo);
		
		int ev=0,od=0;
		
		while(evod.hasMoreTokens()) {
			String token=evod.nextToken();
			int temp=Integer.parseInt(token);
			if (temp % 2 == 0) ev++;
			 else 	od++;
			
		} //while
		System.out.printf("홀수 = %d, 짝수 = %d \n", od, ev);

		
		/*
		문제 3) 

		10개의 정수 입력받아서 그 합과 평균을 출력하되 0 이 입력되면 10개 입력이 끝나지 않았더라도 그 때까지 입력된 합과 평균을 출력하는 프로그램을 작성하시오. 

		평균은 소수부분은 버리고 정수만 출력한다.

		( 0이 입력된 경우 0을 제외한 합과 평균을 구한다.)

		( 10개이상을 입력할 경우는 10개로 계산한다. )

		​

		입력

		5 9 6 8 4 3 0

		​

		출력

		35  5
		*/
		
		System.out.println("평균-합을 구할 수를 10개 이하로 나열하시오. : ");
		String toav=input.nextLine();
		
		StringTokenizer ta = new StringTokenizer(toav); //입력 받은 값을 ta에 문자 분리하여 넣음.
		int to=0, av=0, ac=0;
		
		
		
		while(ta.hasMoreTokens()) { //더이상 분리한 문자가 없을 때까지 반복.
			String Token=ta.nextToken(); //분리한 문자들을 token에 하나씩 로딩 함.
			int temp=Integer.parseInt(Token); //token에 들어간 문자를 숫자형으로 변환
			if(temp==0 | ac>=10) break;
			System.out.print(temp+" ");
			ac++; // 반복 횟수
			to+=temp; //총점
			av=to/ac; //평균

		} //while
		System.out.println();
		System.out.printf("총점 : %d,  평균 : %d \n", to,av);

	} //main

} //class
