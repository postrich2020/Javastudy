package e_constructor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		System.out.println(s1.getName()+"님의 총점 : " + s1.calTotal());
		System.out.println(s1.getName()+"님의 총점 : " + s1.calAvg());		

		Scanner input = new Scanner(System.in);
		System.out.println("학생 이름 : ");
		String name = input.next();
		System.out.println("국어점수 : ");
		int kor = input.nextInt();
		System.out.println("영어점수 : ");
		int eng = input.nextInt();
		System.out.println("수학점수 : ");
		int math = input.nextInt();
		
		
		Student s2 = new Student(name,kor,eng,math);		//setter로 값을 지정하거나 생성자로 값을 지정.
		System.out.println(s2.getName()+"님의 총점 : " + s2.calTotal());
		System.out.println(s2.getName()+"님의 총점 : " + s2.calAvg());		


	}

}
