package etc.collection.list;

public class User {
	
	private String name;
	private int age;
	
	//생성자
	public User() {
	}
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//getters & setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	//메소드
	@Override
	public String toString() {
		return "( " + name + ", " + age + "세 )";
	}
	

}
