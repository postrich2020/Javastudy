package d_array;

import java.util.Scanner;

public class prac01_배열연습 {

	public static void main(String[] args) {

		Scanner input1 = new Scanner(System.in);
		PRACTICE1:
			while(true) {
		System.out.print("문제 번호를 입력하시오(1~2) : ");
		int choice1=input1.nextInt();
		
		switch(choice1) {
		case 1:{

				 String [] ox= new String [] {"ooxxoxxooo", 
						 									"ooxxooxxoo", 
						 									"oxoxoxoxoxoxox",	
						 									"oooooooooo",
						 									"ooooxooooxoooox"
				 											};
				 	int count1=0; //배점 계산 변수
				 	int [] ti=new int [ox.length]; //점수 넣을 배열
				 	for(int i=0;i<ox.length;i++) {
				 		int oxlength=ox[i].length();
				 		for(int j=0;j<oxlength;j++) {
				 			char oxchar = ox[i].charAt(j);
				 			if (oxchar=='o') {
				 				count1++;
				 				ti[i]+=count1;				 
				 			} else {count1=0;}
				 		} //end of for-j
				 		count1=0;
				 		System.out.printf("%d번 점수는 %d \n",i,ti[i]);
				 	} //end of for-i
				

		} break;//end of case1
		
		case 2:{

			 int [][] score1= new int [][] {{5},
					 										{5, 50,50,70,80,100},
					 										{7, 100,95,90,80,70,60,50},
					 										{3, 70,90,80},
					 										{3, 70, 90,81},
					 										{9, 100,99,98,97,96,95,94,93,91}
			 												};
			 int [][] score2= new int[5][score1.length]; //총점, 평균, 평균 점수 이상 인원 수, 비율 넣을 배열
			 double score3=0;
			 
			 for (int i=1;i<score1.length;i++) {
				 for(int j=1;j<score1[i].length;j++) {
					 score2[1][i]+=score1[i][j];  //총점 누적
				 }  //end of for-j
				 	score2[2][i]=score2[1][i]/score1[i][0]; //평균 계산
				 	for(int j=1;j<score1[i].length;j++) { //평균 이상 인원 카운트
				 		if((score1[i][j])>score2[2][i]) {
				 			score2[3][i]++;
				 		} //end of if

				 	} //end of for-j
				 	
				 	score3=(score2[3][i]*1000000)/score1[i][0];  //평균 이상 인원 비율

				 	
				 	System.out.printf("%.3f",score3/10000);
				 	System.out.println("%");
			 } // end of for-i
			 

		} break;//end of case 2
		
		default :{
			System.out.println("종료합니다."); break PRACTICE1;
		}//end of default
		} //end of switch
		
			} // end of while
		


	 } // end of main

	} // end of class


