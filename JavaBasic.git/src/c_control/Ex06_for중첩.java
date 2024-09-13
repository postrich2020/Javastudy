package c_control;

public class Ex06_for중첩 {

	public static void main(String[] args) {
//		for(int j=1;j<=5;j++) {		// 5줄
//		for (int i=1;i<=5;i++) {		// 5칸
//		System.out.print("*");
//		}
//		System.out.println();
//		}
		
//		for(int j=0; j<5;j++) {
//			for(int i=0; i<(j+1) ; i++) {
//				System.out.print("*");
//				
//			}
//			System.out.println();
//		} //end of for-j
		
		
//		for(int j=0;j<5;j++) {
//			for(int i=0;i<5-j;i++) {
//				System.out.print("*");
//			}		//end of for-i
//			System.out.println();
//		}		//end of for-j
		
		//공백 만들기
		for(int j=0;j<5;j++) {
			//공백 출력
			for(int i=0;i<j;i++) {
				System.out.print(" ");
			}		//end of for-i
	
		// '*'찍기
		
			//공백 출력
			for(int i=0;i<5-j;i++) {
				System.out.print("*");
			}		//end of for-i
			System.out.println();
		}		//end of for-j
		

	} // end of main

} // end of class
