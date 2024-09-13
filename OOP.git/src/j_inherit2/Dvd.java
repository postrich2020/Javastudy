package j_inherit2;

public class Dvd extends Item{
private String actor;
private String director;

//생성자 함수 생성
public Dvd() {
	this("0","제목없음","무명","유명한");
}
public Dvd(String num, String title, String actor, String director) {
	super(num,title);
	this.actor = actor;
	this.director=director;
}
//생성자 함수 생성 완료.
public void output() {
	System.out.println("책번호 : "+num);
	System.out.println("책제목 : " +title);
	System.out.println("배우 : "+actor);
	System.out.println("감독 : "+director);
}
}
