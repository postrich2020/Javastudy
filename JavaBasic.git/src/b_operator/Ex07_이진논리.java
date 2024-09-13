package b_operator;

public class Ex07_이진논리 {

	public static void main(String[] args) {
		int a=15;			// 0000 0000	0000 0000	0000 0000	0000 1111
		int b=10;			// 0000 0000	0000 0000	0000 0000	0000 1010
		
		int and = a&b;	// 0000 0000	0000 0000	0000 0000	0000 1010
				System.out.println("and =" + and);
				
		int or=a|b;		// 0000 0000	0000 0000	0000 0000	0000 1111
				System.out.println("or = "+or);
		
		int eor=a^b;	// 0000 0000	0000 0000	0000 0000	0000 0101
				System.out.println("E-OR = "+eor);

	}

}


/* 		논리연산자(이진=비트)
*			A		B			A&B(and)			A|B(or)		A^B(Exclusive OR : 입력신호가 서로 다를 때)
*			-------------------------------------------------------------------------------------------------------
*			0		0					0					0						0
*			0		1					0					1						1
*			1		0					0					1						1
*			1		1					1					1						0
*
*/