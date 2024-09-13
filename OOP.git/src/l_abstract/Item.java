package l_abstract;
/*
 * abstract(추상) : 미완성 //이름이 필요. 오버라이딩에 강제성을 주기 위해
 * 		- method : 오버라이딩(overriding)에 강제성을 주기 위해서
 * 		- class : 클래스내 미완성이 발생하면 class도 미완성이 됨. 객체생성못함(부모클래스 역할)
 */
public abstract class Item extends Object{ //부모 클래스 지정하지 않으면, 자동으로 Object 끌어옴
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
	public abstract void output();

}

