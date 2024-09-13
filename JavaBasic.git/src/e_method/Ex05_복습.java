package e_method;

public class Ex05_복습 {

	public static void main(String[] args) {
		int data1=1000;
		double data2=1.99;
		
		String result = method(data1, data2);
		//msg의 값을 출력
		System.out.println(result);

	}
	
	static String method(int data1, double data2) { //자료형이 넘어오는 순서 중요. 먼저 넘어온 data1이 int형이므로 int먼저 지정, 다음 double지정.
		//data1와 data2의 값을 여기서 출력
		System.out.println(data1+" "+data2);
		
		String msg = "안녕하세요";
		return msg;
	}

}
