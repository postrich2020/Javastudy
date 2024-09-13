package c_control;

public class Ex05_for_개념 {

	public static void main(String[] args) {
		
		/*
		int result=0;
		for(int a=1;a<=100;a+=1){			//a+=1 or a++ 같은 결과
			result=result+a;	
			System.out.println("a = "+a);

		}
		System.out.println("결과 : "+result);
*/
//		for(char ch='A' ;ch<='Z' ;ch++ ) {
//			System.out.print(ch);
//		}
		
//		for(char ch='가' ;ch<='힣' ;ch++ ) {
//			System.out.print(ch);
//		}
		
		for (int a=10;a>0;a-=2) {
			System.out.println(a);
		}
		
		for(char ch='Z';ch>='A';ch-=1) {
			System.out.print(ch);
		}
		
		System.out.println();
		//1부터 10까지의 홀수의 합과 짝수의 합을 구하기
		int odd=0, even=0;
		for(int i=1; i<=10; i++) {
		if(i%2==1) {
			odd+=i;
		
		} else {
			even +=i;
		}}
		
		System.out.println("홀수의 합 : "+odd);
		System.out.println("짝수의 합 : "+even);
		System.out.println("---------------------");
		
		
		odd=0; even=0;
		for(int i=1; i<=10; i+=2) {
			odd+=i;
			even+=(i+1);
			}
		
		System.out.println("홀수의 합 : "+odd);
		System.out.println("짝수의 합 : "+even);

	}

}
