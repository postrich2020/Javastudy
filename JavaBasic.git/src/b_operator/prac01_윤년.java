package b_operator;

import java.util.Scanner;

public class prac01_윤년 {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.print("판별한 연도를 입력하세요");
int y=input.nextInt();

/* 윤년 조건
 * 4년 마다 윤년이 돌아옴.
 * 100으로 나누어 떨어지는 해는 제외 됨. 단, 400으로 떨어지는 해는 윤년임.
 * 
 * 100으로 나누어 떨어지지 않으면서 4로 나누어 떨어지거나,
 * 100으로 나누어 떨어지면서, 400으로 나누어 떨어지는 해
 * 
 */
String lunaryear= y%(y%25!=0?4:16)!=0 ? "평년":"윤년";
String lun=y%(y%100!=0?4:400)==0?"윤년":"평년";  //100으로 나누어 떨어지지 않으면서, 4로 나누어 떨어지거나, 100으로 나누어 떨어지면서, 400으로 나누어 떨어지는면 '윤년'으로

System.out.println("입력하신 해는 "+lunaryear+"입니다");
System.out.println("입력하신 해는 "+lun+"입니다");
	}

}

