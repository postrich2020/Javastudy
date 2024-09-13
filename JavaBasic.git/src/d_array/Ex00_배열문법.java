package d_array;

public class Ex00_배열문법 {

	public static void main(String[] args) {

//		//배열 변수 선언
//		int [] kor = null; //배열의 초기값('null')은 지정하지 않아도 문제 안됨.  stack은 자동초기화가 되지 않지만, heap은 자동으로 초기화가 됨.
//		//배열객체 생성
//		kor=new int[3];//메모리 할당 
//		//값 지정
//		kor[0]=100;
//		kor[1]=200;
//		kor[2]=300;
		
//		//총점 구하기
//		int total=0;
//		// total = kor[0] + kor[1] + kor[2];
//		for(int i=0;i<kor.length;i++) { //배열의 길이로 반복 횟수를 지정. i=i+1
//			total+=kor[i]; //total=total+1
//		}
//		System.out.println("총점 : "+total);

		
//		//배열변수 선언+객체 생성
//		int [] kor=new int[3];
//		//값 지정
//		kor[0]=100;
//		kor[1]=200;
//		kor[2]=300;
		
		//초기화
		//배열변수 선언 + 객체생성 + 값지정
		//int[]kor=new int[] {100,200,300};
		int[]kor= {100,200,300};
		
		//총점 구하기
		int total=0;
		// total = kor[0] + kor[1] + kor[2];
		for(int i=0;i<kor.length;i++) { //배열의 길이로 반복 횟수를 지정. i=i+1
			total+=kor[i]; //total=total+1
		}
		System.out.println("총점 : "+total);
		

	}

}
