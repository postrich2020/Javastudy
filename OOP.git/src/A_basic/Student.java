package A_basic;

public class Student {

			//member fields : 멤버변수들(서로 다른 자료형)
	String name;
	int kor, eng, math;
	int total;
	double avg;

		// member methods : 멤버 함수들
	int calTotal() {
		total=kor+eng+math;
		return total;
	}
	double calAvg() {
		avg=(double)total/3;
		return avg;
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

/*
 * 클래스 이름과 java 파일명은 동일
 * - 대소문자 구별
 * 
 * [권장] 클래스 이름은 대문자로 시작
 */


}
