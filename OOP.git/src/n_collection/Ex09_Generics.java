package n_collection;

public class Ex09_Generics {

	public static void main(String[] args) {
		MyType<String, String> name = new MyType("이름", "김자바");
		MyType<String, Integer> age = new MyType("나이", new Integer(44));
		MyType<String, Double> height = new MyType("키", new Double(130.99));

		System.out.println(name.getName()+"/"+name.getValue());
		System.out.println(age.getName()+"/"+age.getValue());
	}

}

class MyType<K, V>{
	K name;
	V value;
	MyType(K name, V value){
		this.name = name;
		this.value = value;
	}
	
	K getName(){
		return name;
	}
	V getValue(){
		return value;
	}
	
}