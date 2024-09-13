package d_array;

import java.util.*;

public class Ex01_요일 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); 
		System.out.println("현재 날짜 확인");
		System.out.print(cal.get(Calendar.YEAR)+"년 ");
		System.out.print(cal.get(Calendar.MONTH)+1+"월 "); //moth만 0부터 카운트 +1을 해줘야 함.
		System.out.println(cal.get(Calendar.DATE)+"일");

		System.out.println();
		
		System.out.println("현재 시간 확인");
		System.out.print(cal.get(Calendar.HOUR)+"시 ");
		System.out.print(cal.get(Calendar.MINUTE)+"분 "); //moth만 0부터 카운트 +1을 해줘야 함.
		System.out.println(cal.get(Calendar.SECOND)+"초");

		String[] yoil= {"일","월","화","수","목","금","토"};
		System.out.println(yoil[cal.get(Calendar.DAY_OF_WEEK)-1]+"요일");
		//Sunday :1, .... Friday : 6
		
		int yoilnum=cal.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(yoil[yoilnum]+"요일");
	}

}
