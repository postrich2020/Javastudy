package d_array;

public class Ex03_로또 {

	public static void main(String[] args) {
		int lot=5; //로또 게임 횟수
		int[][]lotto=new int[lot][6];
		
		//값 지정 : 임의의 값
		for(int i=0;i<lot;i++) {
			for(int j=0;j<6;j++) {
				lotto[i][j]=(int)(Math.random()*45+1);
			
				//for(int k=0;k<=i;k++) {
					for(int l=0;l<j;l++) {
						if(lotto[i][j]==lotto[i][l]) { j--; break;}
				
					} //end of for-l
				//} //end of for-k
			} //end of for-j

		} //end of for-i
		//출력
		
		//오름차순 정렬
		int comp=0;
		for(int i=0;i<lot;i++) {
			for(int j=0;j<5;j++) {
				for(int k=j+1;k<6;k++) {
					if(lotto[i][j]>lotto[i][k]) {
						comp=lotto[i][j];
						lotto[i][j]=lotto[i][k];
						lotto[i][k]=comp;

					}
				} //end of for-k
			} //end of for-j
			
			for(int j=0;j<6;j++) {

			} //end of for-j
		}//end of for-i
		
		//최종 출력
			for(int i=0;i<lot;i++) {
				for(int j=0;j<6;j++) {
					System.out.print(lotto[i][j]+" ");
				} //end of for-j
				System.out.println();
			} //end of for-i
			

	}//end of main

}//end of class
