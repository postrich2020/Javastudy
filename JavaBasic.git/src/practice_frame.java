import java.util.*;

public class practice_frame {

	public static void main(String[] args) {
		
		
		Scanner input1 = new Scanner(System.in);
		PRACTICE1:
			while(true) {
		System.out.print("문제 번호를 입력하시오(1~4) : ");
		int choice1=input1.nextInt();
		
		switch(choice1) {
		case 1:{
			while(true) {
			System.out.println("case1");break;
			}break; //end of while
		} //end of case1
		
		case 2:{
			while(true) {
			System.out.println("case2");break;
			}break; //end of while
		}//end of case 2
		
		case 3:{
			while(true) {
			System.out.println("case3");break;
			}break; //end of while
		}//end of case 3
		
		case 4:{
			while(true) {
			System.out.println("case4");break;
			}break; //end of while
		}//end of case 4
		
		default :{
			System.out.println("종료합니다."); break PRACTICE1;
		}//end of default
		} //end of switch
		
			} // end of while

	} //end of main

} //end of class
