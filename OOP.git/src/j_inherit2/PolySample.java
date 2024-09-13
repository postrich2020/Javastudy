package j_inherit2;

public class PolySample {
public static void main(String[] args) {
	
	Item[] result=method();
	//데이타 처리(출력)
	for(int i=0;i<result.length;i++) {
		//((Item)result[i]).output();
		//Item item = (Item)result[i]; //Object -> Item 형변환(Casting 중)
		result[i].output(); //다형성
	}
}
static Item[] method() {
	//데이타 위치
	Book b = new Book("001","파이썬","ICT","누군가");
	Dvd d=new Dvd("002","탈주","한국인","한국감독");
	Cd c=new Cd();
	
	Item[] obj=new Item[3];
	obj[0]=b;
	obj[1]=d;
	obj[2]=c;
	
	return obj;
}
}
