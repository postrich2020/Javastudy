package f_exception;

import java.io.*;

public class Ex03_Throws {

	public static void main(String[] args) {
		
		try {
		readFile();
		System.out.println("파일 처리 성공");
		}catch(Exception ex) {
			System.out.println("예외 발생 : " + ex.getMessage());
			//ex.printStackTrace();
			
		}

	}
	
	static void readFile() throws Exception { //throw Exception 모든 예외 처리를 하지 않음.
		FileInputStream fis=null;
		try{
		fis = new FileInputStream("happy.txt");
		}finally {
			fis.close();
		}
		
	}

}
