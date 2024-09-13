package c_control;
/*
반복문
  - for 문
  - while문
  - do~while문

  for(초기치 : 조건문; 증가치){
  반복문장;
  }

  초기치;
  while(조건문){
  반복문장;
  증가치;
  }
  
  
  초기치;
  do{
  반복문장;
  증가치;
  }while(조건문);
*/


public class Ex08_do_while_개념 {

	public static void main(String[] args) {
		
//		//1~10 누적합계 for문
//		int sum=0;
//		for(int i=1; i<=1;i++) {
//			sum+=i;
//			
//		}
//		System.out.println("합 : "+sum);
//
//		//1~10 누적합계 while문
//		int sum=0;
//		int i=1;
//		while(i<=1) {
//			sum+=i;
//			i++;
//		}
//		System.out.println("합 : "+sum);
		
		//1~10 누적합계 do~while문
		int sum=0;
		int i=1; 
		do{
			sum+=i;
			i++;
			
		}while(i<=10);
		System.out.println("합 : "+sum);
		
	}

}
