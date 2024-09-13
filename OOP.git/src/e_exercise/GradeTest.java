package e_exercise;
import java.util.*;
public class GradeTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("데이타 개수 크기 :  ");
		int su=input.nextInt();
		
		int[] arr = new int[su];
		
		System.out.println("정수 데이타입력 : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println();
		
		GradeExpr grade=new GradeExpr(arr); //생성자 함수를 통해 arr을 GradeExpr로 전송
		
		System.out.println("총점 : "+grade.getTotal());
		System.out.println("평균 : "+grade.getAverage());
		System.out.println("최고 점수 : "+grade.getGoodScore());
		System.out.println("최저 점수 : "+grade.getBadScore());
		

	}

}
