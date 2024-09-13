package c_control;

import java.util.Scanner;

public class prac01_switch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("학번을 입력하세요 : ");
		String id=input.nextLine();
		String 입학년도=id.substring(0,4);
		String coll=id.substring(4,5);
		String cla=id.substring(5,7);
		String 순번=id.substring(7,10);
		String 단과대= coll.equals("1")?"공대":coll.equals("2")?"사회대":"단과대 오류";
		String 학과="";
		
		if (coll.equals("1")) {
			//단과대="공대";
			switch(cla) {
			case "11" : 학과="컴퓨터학과";break;
			case "12" : 학과="소프트웨어학과";break;
			case "13" : 학과="모바일학과";break;
			case "22" : 학과="자바학과";break;
			case "33" : 학과="서버학과";break;
			
			}} else if(coll.equals("2")){
			//단과대="사회대";	
			switch(cla) {
			case "11" : 학과="사회학과";break;
			case "12" : 학과="경영학과";break;
			case "13" : 학과="경제학과";break;
			}
			}
		System.out.printf("%s는 %s년도에 입학한 %s %s 학생입니다.%n",id,입학년도,단과대,학과);
		
		System.out.println("------------------------");
		System.out.println("입학 년도 : "+입학년도+"년도");
		System.out.println("단  과  대 : "+단과대);
		System.out.println("소속 학과 : "+학과);

		}

	}

