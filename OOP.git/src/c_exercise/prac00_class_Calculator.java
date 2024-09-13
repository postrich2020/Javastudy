package c_exercise;

import java.util.*;

public class prac00_class_Calculator {

	public static void main(String[] args) {

			prac00_class_CalculatorExpr cal=new prac00_class_CalculatorExpr();
			
			Scanner input=new Scanner(System.in);
					System.out.println("첫 번 째 숫자 -> " );
			//cal.num1=input.nextInt();
					cal.setNum1(input.nextInt());
					System.out.println("두 번 째 숫자 -> " );
					cal.setNum2(input.nextInt());
					
					

					System.out.println("덧셈 : "+cal.getAddition());
					System.out.println("뺄셈 : "+cal.getSubstraction());
					System.out.println("곱셈 : "+cal.getMultipliction());
					System.out.println("나눗셈 : "+cal.getDivision());

	}

}
