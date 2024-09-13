package b_operator;

public class Ex08_ShorcircuitLogic {

	public static void main(String[] args) {
		
		int a=3;
		if(a>3 && ++a>3) {							//&&를 사용할 경우, 앞의 조건이 이미 false라서 뒷 부분의 조건과 무관하게 값이 변하지 않으므로 뒷 부분을 실행하지 않음. => shortcircuit logic.  &를 사용하면 shortcircuit logic이 작동하지 않아, 다른 언어와 동일한 값을 가진다.
			System.out.println("조건만족");
		}
		System.out.println("A="+a);
		
		
		//--------------------------------------------
		int b=3;
		if(b>1 || --b>3) {
			System.out.println("조건만족2");	//&&를 사용할 경우, 앞의 조건이 이미 true라서 뒷 부분의 조건과 무관하게 값이 변하지 않으므로 뒷 부분을 실행하지 않음. => shortcircuit logic. &를 사용하면 shortcircuit logic이 작동하지 않아, 다른 언어와 동일한 값을 가진다.
			
		}
		System.out.println("B="+b);
	}

}
