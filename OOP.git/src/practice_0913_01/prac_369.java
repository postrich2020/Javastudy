package practice_0913_01;

import java.util.*;

public class prac_369 {
public static void main(String[] args) {
	
	
	Scanner input1 = new Scanner(System.in);
	PRACTICE1:
		while(true) {
	System.out.print("문제 번호를 입력하시오(1~3) : ");
	int choice1=input1.nextInt();
	
	switch(choice1) {
	case 1:{
		//3, 6, 9문제
		Scanner input=new Scanner(System.in);
		System.out.print("성공 번호를 입력하세요(1~100,000)");
		int a = input.nextInt();
		boolean b=false; //3, 6, 9 판별
		int c=0, d=0,e=0; //c=판별 수, d=누적 카운트, 
		
		//입력 수 만큼 반복
		for (int i=0;i<=a;i++) {
			//초기화
			c=i; //판별 수 reset
			b=false; //3, 6, 9판별 기본값 false로
			

			//나머지가 0일 때까지 반복
			while(c!=0) {

			//나머지 구한 수
			//나머지가 3이라면 true
			if((c%10==3|c%10==6|c%10==9)) {
				b=true;
			}
			c/=10;
			} // end of while
			//최종적으로 true면 카운트 누적.
			System.out.printf("%d  %d \n",d, i); //테스트
			if(b==true) {d++;
			System.out.println("--------------");}
		} System.out.printf("\n 총 박수 친 횟수는 : %d회 입니다. \n",d);
		

		
		break; //end of while
	
	} //end of case1
	
	case 2:{
		// 2번 문제
		Scanner input=new Scanner(System.in);
		System.out.println("수를 입력하세요(1 2 3) : ");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int d=0; //카운트
		
		if(c>100000000 | c<1) {
			System.out.println();
			System.out.println("범위 값이 1이상 100,000,000 이하를 벗어났습니다.");
		break;}
		
		for(int i=0;i<=c;i+=a) {
			if(i%b!=0) {d++;}
			
		}
		System.out.printf("%d회 \n",d);
		
		break; //end of while
	}//end of case 2
	
	case 3:{
		
		
		
		
		
		
		
		
		
		
		
		while(true) {
		System.out.println("case3");break;
		}break; //end of while
	}//end of case 3
	
	
	default :{
		System.out.println("종료합니다."); break PRACTICE1;
	}//end of default
	} //end of switch
	
		} // end of while

} //end of main
}



