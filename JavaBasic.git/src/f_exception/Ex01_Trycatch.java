package f_exception;
/*
 * 오류
 * 	- 에러 : 심각한 오류
 * 	- 예외 : 심각하지 않은 오류
 * 
 * 예외처리 : 최종 목적은 프로그램이 정상적으로 종료
 * 
 *				[1] try-catch
 *						try{
 *								예외가 발생할 여지가 있는 구문
 *							}catch(Exception ex){
 *								예외가 발생한 후에 구문
 *							}finally{
 *								예외 관련 없이 무조건 실행 구문
 *							}
 *
 * 			[2] 함수 뒤에 throws
 */

public class Ex01_Trycatch {

	public static void main(String[] args) {
		//string[]str=new String[]{안녕하세요", 올라","하이"};
		String []str= {"안녕하세요", "올라", "하이"};
		
		try {
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		return; //정상 종료시 호출된 main에서 return. catch 실행하지 않음. finally는 무조건 실행
		}catch(Exception ex) {
			System.out.println("예외발생 : "+ex.getMessage());
		}finally { //예외 관련 없이 실행
			System.out.println("무조건 실행 구문");
		}
		
		System.out.println("프로그램 종료");

	}

}
