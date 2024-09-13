package d_array;

import java.util.*;

public class Ex99_야구게임 {

	public static void main(String[] args) {
		
		
		//임의의 값 선정(중복 제외)
		int [] baseball = new int[3];
		
		for(int i=0; i<baseball.length;i++) {
			baseball[i] = (int)(Math.random()*10);
			for (int j=0;j<i;j++) {
				if(baseball[j]==baseball[i]) {
					i--;
				} //end of if
			} //end of for-j
			System.out.println(baseball[i] + "/");
		} // end of for-i
		
		for(int i=0;i<baseball.length;i++) {
			System.out.print(baseball[i]+" ");
		} // end of for-i

		
		//2. 사용자 입력값 answer에 각각의 숫자로 저장
		//			[ex] 3, 4, 5
		int[]answer = new int[3];
		
		//구문작성
		
		Scanner input = new Scanner(System.in);
		System.out.println("숫자입력(1 2 3) -> ");
		String input_str = input.nextLine();
		StringTokenizer st = new StringTokenizer(input_str);
		for (int i=0;i<answer.length;i++) {
			answer[i] = Integer.parseInt(st.nextToken());
			
		}
		
		
		
		//answer 값 출력
//		for(int i=0;i<answer.length;i++) {
//			System.out.print(answer[i]+" ");
//		}
			//3. 값 비교
			int strike=0, ball=0;
			for(int i=0;i<baseball.length;i++) {
				for(int j=0; j<answer.length;j++) {
					if(baseball[i]==answer[j]) strike++;
					else ball++;
				}
			}
			
		// 4. 출력
			System.out.println("스트라이크 : "+strike+"/볼 : "+ball);
	} // end of main

} // end of class
