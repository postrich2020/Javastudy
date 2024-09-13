package c_exercise2;

import java.util.*;

public class Main2 {

	public static void main(String[] args) {

		
		Product [] p= new Product [10];  //클래스 호출. 메모리에 객체 선언
		
		Scanner input=new Scanner(System.in);
		p[0] = new Product(); //
		System.out.println("상품번호 : ");
		p[0].setProductNo(input.next()); //private로 지정된 클래스의 변수를 변경시에는 set필요.
		
		System.out.println("상품명 : ");
		p[0].setProductName(input.next());
		
		System.out.println("초기 재고량 : ");
		p[0].setStock(input.nextInt());

		
		System.out.println("판매량 : ");
		p[0].setSale(input.nextInt());
		
		System.out.println("입고량 : ");
		p[0].setIncome(input.nextInt());
		
		System.out.println("상품번호 : "+p[0].getProductNo());
		System.out.println("상품명 : "+p[0].getProductName());
		System.out.println("재고량 : "+p[0].stock());
		

		
	}

}


