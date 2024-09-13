package b_operator;
/*
 * shift : 모든 비트의 값을 이동하는 연산자
 *     >>
 *     <<
 *     >>>
 *     숫자 2를 1byte에 적용한다면?
 *     2       0000 0010
 *     2<<1 0000 0100
 *     2>>1 0000 0001
 *     
 *     2>>>1 0000 0001
 *         움수인 경우
 *            10000 0010  -> 0100 0001
 */
public class Ex04_쉬프트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=4;						//0000 0000     0000  0000    0000 0000   0000 0100
int result=a>>2;			//0000 0000     0000  0000    0000 0000   0000 0001
System.out.println("a>>2 한 결과 :"+ result);



//정수형 변수 result2를 만들어
int result2;

//result2에 a에서 왼쪽으로 2칸 이동
result2 = a<<2;
System.out.println("a<<2 한 결과 :"+ result2);

int b=-4;
int re1=b >>2;
System.out.println("b>>2 한 결과 :"+ re1);


int re2=b >>>2;			// >>>는 양수로 변환
System.out.println("b>>2 한 결과 :"+ re2);
	}

}
