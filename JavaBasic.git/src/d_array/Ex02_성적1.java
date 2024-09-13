package d_array;

/*
  5명의 국어점수를 입력하시오(입력 예시 : 10/10/10/10/10 ) ->
  총점은 xxxx이고, 평균은 oooo입니다.
 */

import java.util.*;

public class Ex02_성적1 {

	public static void main(String[] args) {

		//점수 입력
		Scanner input = new Scanner(System.in);
		System.out.println("5명의 국어점수를 입력하시오");
		System.out.println("(입력 예시 : 10/10/10/10/10)");
		String str = input.nextLine();
		StringTokenizer st = new StringTokenizer(str,"/");
		
		System.out.println();
		
		int rp=st.countTokens();
		int[]score=new int [rp];
		int total=0;
		
		for(int i=0;i<score.length;i++) {
			score[i]=Integer.parseInt(st.nextToken());
			System.out.print(score[i]+" / "
					+ "");
			total+=score[i];
		} //end of for-i
		
		System.out.println();
		System.out.printf("총점 : %d,     평균 : %d", total, total/score.length);

	} //end of main

} //end of class
