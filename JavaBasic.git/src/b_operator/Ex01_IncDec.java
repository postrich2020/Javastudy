package b_operator;

public class Ex01_IncDec {

	public static void main(String[] args) {
		
			// 정수변수 a에다가 5를 하나 선언
			int a = 5;
			int b = 7;
		System.out.println("A="+a+", B="+b); // A=5, B=7
		System.out.println("A="+a+1+", B="+b+1); //[주의] // A=51, B=71
		System.out.println("A="+(a+1)+", B="+(b+1)); // A=6, B=8
		
		a=a+1;
		b=b+1;
		System.out.println("A="+a+", B="+b); // A=6, B=8
		
		//증가 감소 연산자
		a++;  // a=a+1;
		b--;   // b=b-1;
		System.out.println("A="+a+", B="+b); // A=7, B=7
		
		++a;  // a=a+1;
		--b;   // b=b-1;
		System.out.println("A="+a+", B="+b); // A=8, B=6
		System.out.println(); 
		
		
		//-----------------------------------------------------
		int z=10, y=10;
		
		int result=++z;  // z=z+1; int result=z;
		System.out.println("++z="+result); //result=11
		System.out.println(); 
		
		int result2=y++; // int result2=y; y=y+1;
		System.out.println("y++="+result2); //result2=10

		System.out.println("z="+z+", y="+y); // z=11, y=11
		
		System.out.println("z="+ ++z+", y="+--y); //z=12, y=10
		System.out.println("z="+ z++ +", y="+y--); //z=12, y=10
		
		System.out.println("z="+z+", y="+y); // z=13, y=9
		
		
	}

}
