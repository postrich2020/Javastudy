package j_inherit_sample;

import java.awt.*; //고전화면

public class Test {
	
	Frame f;
	
	Test(){
		
		f=new Frame("나의 첫 화면");
		f.setBounds(100,100,500,400); //(위치)(가로, 세로,) (크기)(폭, 높이)
		f.setVisible(true);
	}
	public static void main(String[] args) {
		Test t=new Test();
		
	}

}
