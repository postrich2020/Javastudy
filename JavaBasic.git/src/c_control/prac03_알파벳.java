package c_control;

public class prac03_알파벳 {

	public static void main(String[] args) {
		
		//문제 1
		
		//알파벳 한 줄에 출력
		
		for (int j=1;j<=26;j++) {		//26회 반복
			System.out.print(j+"  ");
		for (char ch='A';ch<='A'+j-1;ch++) {	//알파벳 출력
			System.out.print(ch+" ");
		}
		System.out.println();
		}

		//-----------------------------
		//문제 2
		for (int j=1;j<=26;j++) {		//26회 반복
			System.out.print(j+"  ");
		for (char ch='A';ch<='Z'-j+1;ch++) {	//알파벳 출력
			System.out.print(ch+" ");
		}
		System.out.println();
		}
		
		//----------------------------
		//문제 3
		for (int j=1;j<=26;j++) {		//26회 반복
			System.out.print(j+"  ");
		for (char ch='Z';ch>='Z'-j+1;ch--) {	//알파벳 출력
			System.out.print(ch+" ");
		}
		System.out.println();
		}
		//-----------------------------
		//문제 4

		for (int j=1;j<=26;j++) {		//26회 반복
			System.out.print(j+"  ");

		for (char ch=(char)('A'+j-1);ch<='Z';ch++) {	//알파벳 출력
			System.out.print(ch+" ");
		}
		System.out.println();
		}
		
		
	}

}
