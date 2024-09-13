package b_operator;
/*
 * 비교 연산자
 * > : 크다
 * >= : 크거나 같다
 * < : 작다
 * <= : 작거나 같다
 *  == : 같다
 *   !=:다르다
 */
public class Ex05_비교 {

	public static void main(String[] args) {
		int kor=89, eng=87, math=77;
		//총점, 평균을 구해서 변수에 저장하고 출력
		
		double t=kor+eng+math, avg=t/3;
		int tot=kor+eng+math;
		double aver = (double)tot/3;
		
		System.out.println("총점 : "+(int)t+", 평균 : "+avg); //( )를 써서 형변환을 해준다.
		System.out.println("총점 : "+tot+", 평균 : "+aver);
		
		/* [학점 구하기
		 * 
		 * 평균이 90점 이상이면 A학점
		 * 평균이 80이상 90미만이면 B학점
		 * 평균이 70이상 80미만이면 C학점
		 * 
		 */
		
		
		/* 올바른 코딩 */
			if(avg>=90) {								// 만약에 평균값이 90이상이라면,
				System.out.println("A학점");	// 그렇다면, 'A학점'을 출력
			}else if(avg>=80) {						// 그렇지 않다면, 만약에 평균값이 80 이상이라면,
				System.out.println("B학점");	// 그렇다면, 'B학점'을 출력
			}else if(avg>=70) {
				System.out.println("C학점");
			}
		
		/* 잘못된 코딩 예 1
		if(avg>=90) {								// 만약에 평균값이 90이상이라면,
			System.out.println("A학점");	// 그렇다면, 'A학점'을 출력
		} if(avg>=80) {						// 만약에 평균값이 80 이상이라면,
			System.out.println("B학점");	// 그렇다면, 'B학점'을 출력
		} if(avg>=70) {
			System.out.println("C학점");
		}*/
		
		/* 잘못된 코딩 예2
		if(avg>=70) {								// 만약에 평균값이 70이상이라면,
			System.out.println("C학점");	// 그렇다면, 'C학점'을 출력
		}else if(avg>=80) {						// 그렇지 않다면, 만약에 평균값이 80 이상이라면,
			System.out.println("B학점");	// 그렇다면, 'B학점'을 출력
		}else if(avg>=90) {
			System.out.println("A학점");
		}*/
		
		
	}

}
