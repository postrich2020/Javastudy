package c_control;

public class prac05_방탈출_while {

	public static void main(String[] args) {
	
		int count8=0;
			for(int i=1; i<=10000; i++) {  //8이 있는지 확인
					int su = i;					//비교 대상 수를 su에 대입
			
					while(su!=0) {			//더이상 나눌 수 없을 때까지 반복
						int na=su%10;		//10으로 나눈 나머지
						
						if(na==8) {			//나머지가 8이면
							count8++;		//카운트 누적
	
						} //if
						su=su/10; // 다음 자릿수
						
					} //while
			} //for
			System.out.printf("1~10,000까지 '8'은 총 %d 번 나온다.",count8);

	} //main

} //class
