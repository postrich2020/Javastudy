package c_control;

import java.util.Calendar;
import java.util.Scanner;

public class Ex03_나이구하기 {

	public static void main(String[] args) {
		Scanner inputid=new Scanner(System.in);
		System.out.print("주민번호를 입력하세요 : ");
		
		//입력값에서 연, 월, 일 추출
		String id = inputid.nextLine();
		String nai=id.substring(0,2);					// age="80" >80
		String mon=id.substring(2,4);
		String da=id.substring(4,6);
				
				int sunai = Integer.parseInt(nai);	// 문자열 "80"  ->  int형 80 형태 변환(문자->숫자)
				int sunmo=Integer.parseInt(mon);
				int sunda=Integer.parseInt(da);
				
								
				//현재 연, 월, 일 추출
				Calendar cal = Calendar.getInstance();
				int year=cal.get(Calendar.YEAR);
				int month=cal.get(Calendar.MONTH);
				int day=cal.get(Calendar.DAY_OF_MONTH);
	
	
				int age=0;
				int age2=0;
				
				// 한국 나이 계산
				char sung = id.charAt(7);
								if(sung=='1'|| sung=='2') {
				//성별 문자가 '1'이거나 '2'라면
						age=year-(1900+sunai)+1;
								} else if(sung=='3' ||sung=='4'){
									//성별 문자가 '3'이거나 '4'라면
						age=year-(2000+sunai)+1;
	}		
				// 만 나이 계산
						int adage=month>sunmo?-2:day>sunda?-2:-1;	// 보정 만 나이. 한국 나이에서 생일 지나면 -1, 생일 안지나면 -2.
								age2=age+adage; //한국나이+보정 만 나이
					
								
						if(age<0) {
							System.out.println("잘못된 주민번호 입니다.");
						} else {
							System.out.println("한국나이="+age);
							System.out.println("만나이="+age2);
						
						}
						
	

	}

}

/*
 * Wrapper Class : 자료형 클래스
 * 
 * int : Integer
 * long: Long
 * double : Double
 */
