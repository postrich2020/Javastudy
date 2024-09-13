package n_collection;

public class Ex00_Objects {

	public static void main(String[] args) {
		//StudentA 메모리 확보 및 초기화
		StudentA a = new StudentA("01234","홍길동");
		StudentA b = new StudentA("01234","홍길동");
		
		//출력
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		if(a.equals(b)) {
			System.out.println("동일인");
		}else {
			System.out.println("다른사람");
		}

	}

}

 class StudentA extends Object{
	 //멤버변수  -> 아래 StudentA에서 생성된 변수가 지역변수라 사라질 지역 변수를 유지 시키기 위해 멤버변수 지정.
	 String hakbun;
	 String name;
	 
StudentA(String hakbun, String name){
			this.hakbun=hakbun;
			this.name = name;			
}

public boolean equals(Object obj) {
	StudentA other = (StudentA)obj;
	if(hakbun.equals(other.hakbun)) {
		return true;
	}else {
		return false;
	}
}
	public String toString() {
	return "학번 : " + hakbun + " 이름 : "+name;
}
}
