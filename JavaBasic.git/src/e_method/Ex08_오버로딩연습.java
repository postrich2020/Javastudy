package e_method;

public class Ex08_오버로딩연습 {

	public static void main(String[] args) {
		multiple(2,3);
		multiple(4, 'ㅋ');
		multiple(2, 3, 'ㅋ');

	}
	static void multiple(int a, int b) {
		System.out.println(a*b);
	}
	static void multiple(int a , char ch) {
		for(int i=0;i<a;i++) {
			System.out.print(ch);
		}
	}
	static void multiple(int n, int m, char ch) {
		System.out.println();
		for (int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}

}

/* multiple 메소드 만들기
 * - 2개의 int인자인 경우는 곱셈계산 한 결과를 출력
 * - 1개의 int인자와 1개의 char 인자인 경우는 int 인자 수 만큼 char 인자 문자를 출력
 * - 2개의 int인자와 1개의 char 인자인 경우는 char 인자 문자를 n*m형식의 행과 열로 출력
 * 
 * multiple(2, 3) 호출								[출력 결과]	6
 * multiple(4,'ㅋ') 호출								[출력 결과]	ㅋㅋㅋㅋ
 * multiple(2, 3, 'ㅋ') 호출							[출력 결과]	ㅋㅋ
 * 																			ㅋㅋ
 * 																			ㅋㅋ
 */
