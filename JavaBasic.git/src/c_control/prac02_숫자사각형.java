package c_control;


import java.util.Scanner;
public class prac02_숫자사각형 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		//숫자 사각형 1
		System.out.print("세로-가로 숫자 2개 입력");
		int row=input.nextInt();
		int col=input.nextInt();
		int k=1;

		for (int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++,k++) {
				System.out.printf(k+" ");
			}
			System.out.println();
		}
		//----------------------
		System.out.println();
		System.out.println("============");
		
		
		//숫자사각형 3
		System.out.print("수를 입력하세요 : ");
		int squ=input.nextInt();
		
		
		for (int i2=1;i2<=squ;i2++) {
	
			for(int j2=0;j2<squ;j2++) {
				System.out.print(i2+(j2*squ)+" ");
			}
			System.out.println();
		}
		//----------------------
				System.out.println();
				System.out.println("============");
				
				
				//숫자사각형 2
				System.out.print("세로-가로 수를 입력하세요 : ");
				int row2=input.nextInt();
				int col2=input.nextInt();
				int st=0;
				int en=0;
				int k3=-1;
				
				for(int i3=0;i3<row2;i3++) {
					st=(i3+1)%2==0?(i3+1)*col2:i3*col2+1;
					en=(i3+1)%2==0?i3*col2+1:(i3+1)*col2;
					

						k3*=(-1);
					
						// System.out.print("st = "+st+" en = "+en+" k3 = "+k3);
					
					for(int j3=st;j3<=en;j3+=k3) {
						System.out.print(j3+" ");
					}
					
					for(int j3=st;j3>=en;j3+=k3) {
						System.out.print(j3+" ");
					}
					
					System.out.println();
				}
		
	}

}
