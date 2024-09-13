package h_innerclass;

/*
 * inner class : 클래스 안에 클래스(멤버 취급)
 */

class outer{
	class Inner{
		void najabara() {
			System.out.println("잡아봅시다");
		}
	}
	
}

public class MainTest {
public static void main(String[] args) {
	/* Outer o = new Outer();
	Outer.Inner in = o.new Inner();
	in.najabara();*/
	
	Outer.Inner in = new Outer.Inner();
	in.najabara();
}
}
