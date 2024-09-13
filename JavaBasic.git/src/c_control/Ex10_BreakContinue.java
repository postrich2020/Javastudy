package c_control;

/*
 			break : 블럭을 벗어나는 문장
 			continue : 블럭의 끝으로 이동하는 문장
 */

public class Ex10_BreakContinue {

	public static void main(String[] args) {
		
		/*
		
		//break
		for(int j=0; j<3;j++) {
			if(j==1) break;
			System.out.printf("< %d > \n",j);
		}
		System.out.println("데이타");
		
		
		//continue
		for(int j2=0; j2<3;j2++) {
			if(j2==1) continue;
			System.out.printf("< %d > \n",j2);
		}
		System.out.println("데이타");

*/
		END: //라벨 지정
		for (int i=0;i<2;i++) {
		//break
		for(int j=0; j<3;j++) {
			if(j==1) continue END;  //break 라벨; -> 라벨 해당 영역 전체를 벗어남.
			System.out.printf("< %d, %d > \n",i, j);
		} //end of j
		System.out.println("데이타");
		} //end of i
		
	}

}
