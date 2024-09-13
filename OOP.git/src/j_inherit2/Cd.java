package j_inherit2;

public class Cd extends Item{
private String singer;

//생성자 함수 생성
public Cd() {
	this("0","제목없음","무명","유명한");
}
public Cd(String num, String title, String actor, String director) {
	super(num,title);
	this.singer = singer;
}
//생성자 함수 생성 완료.

public void output() {
	System.out.println("책번호 : "+num);
	System.out.println("책제목 : " +title);
	System.out.println("가수 : "+singer);
}
}
