package j_inherit2;

public class Item extends Object{ //부모 클래스 지정하지 않으면, 자동으로 Object 끌어옴
	protected String title;
	protected String num; //자식클래스의 허용을 위해 private 대신 protected로 지정

	public Item() {
		num="0";
		title = "";
		System.out.println("부모 기본 생성자");

	}

	public Item(String num, String title) {
		this.num =num;
		this.title = title;
		System.out.println("부모 인자 생성자");
	}
	public void output() {

	}

}

