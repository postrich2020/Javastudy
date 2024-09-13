package c_control;

//우리대학의 학번은 총 10자리로 되어 있습니다.
//
//맨 앞의 4자리는 입학년도이고 다섯번째 문자는 단과대 번호입니다.
//
//     1 : 공대
//
//     2 : 사회대
//
//그 뒤의 2자리는 각 학과번호입니다.
//
//​
//
//  공과대학인 경우는
//
//     11 : 컴퓨터학과       12 : 소프트웨어학과          13 : 모바일학과
//
//     22 : 자바학과         33 : 서버학과
//
//     
//
//사회대학인 경우는
//
// 11 : 사회학과         12 : 경영학과          13 : 경제학과
//
//​
//
//​
//
// ex) 2017111001 는 2017년도에 입학한 공대 컴퓨터학과 학생입니다
//
// ex) 2019211001 는 2019년도에 입학한 사회대 사회학과 학생입니다
//
// ex) 2018133001 는 2018년도에 입학한 공대 서버학과 학생입니다  


import java.util.Scanner;

public class Ex02_if_학번 {

	public static void main(String[] args) {
		Scanner inputstuid=new Scanner(System.in);
		
		System.out.print("학번을 입력하세요 : ");
		String stuid=inputstuid.nextLine();
		
		String ent="", cla="", subs="", num=""; //입학년도, 학과, 학생 번호 변수
		ent=stuid.substring(0,4); // 입학년도. substring(시작위치, 입력 위치 전까지)
		cla=stuid.substring(4,5); //단과대
		subs=stuid.substring(5,7); // 학과
		num=stuid.substring(7,10); // 학생번호
		String 단과명=cla.equals("1")?"공대":cla.equals("2")?"사회대":"단과 미소속";
		String 학과명=cla.equals("1")?subs.equals("11")?"컴퓨터학과":subs.equals("12")?"소프트웨어학과":subs.equals("13")?"모바일학과":subs.equals("22")?"자바학과":subs.equals("33")?"서버학과":"학과 미소속"
							:cla.equals("2")?subs.equals("11")?"사회학과":subs.equals("12")?"경영학과":subs.equals("13")?"경제학과":"학과 미소속":"단과 미소속";
		
		System.out.println(stuid+"는 "+ent+"년도에 입학한 "+단과명+" "+학과명+" 학생입니다.");
		System.out.printf("%s는 %s년도에 입학한 %s %s 학생입니다.%n", stuid, ent, 단과명, 학과명);  // %s는 문자열 대입, %n은 다음 행으로
		
		System.out.println("============");
		System.out.println("입학년도 : "+ent);
		System.out.println("단과대 : "+cla);
		System.out.println("학과 : "+subs);
		System.out.println("학생번호 :"+num);
		
		

	}

}
