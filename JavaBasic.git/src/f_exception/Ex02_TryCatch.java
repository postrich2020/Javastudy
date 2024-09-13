package f_exception;


import java.io.FileInputStream;
import java.io.*;

public class Ex02_TryCatch {

	public static void main(String[] args) {
		FileInputStream fis=null;
		
		try {
		fis = new FileInputStream("abc.txt");
		fis.read();
		
		System.out.println("파일처리");
		}catch(FileNotFoundException ex) {
			System.out.println("파일이 존재하지 않는 예외 발생 : " + ex.getMessage());
		}catch(Exception ex) {
			System.out.println("예외 발생 : "+ex.getMessage());
			ex.printStackTrace();
		}finally{
			try {
			fis.close(); //fis를 열었으면, 반드시 닫아야 함.
			}catch(Exception ex){}
		}
		
		}
		

	}


