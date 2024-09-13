package d_array;

public class Ex00_반복문복습 {

	public static void main(String[] args) {
		
		//for문
		for(int i=1;i<=6;i++) {
		int temp=(int)(Math.random()*45)+1; //0.0<=랜덤값<1.0
		System.out.print(temp+"/");
		}//end of for
		System.out.println();
		
		//while문
		int i1=1;
		while(i1<=6){
			int temp=(int)(Math.random()*45)+1;
			System.out.print(temp+"/");
			i1++;
		}//end of while
		System.out.println();
		
		//do~while문
		int i2=1;
		do {
			int temp=(int)(Math.random()*45)+1;
			System.out.print(temp+"/");
			i2++;
		} while(i2<=6); //end of do
		
	} //end of main
} //end of class
