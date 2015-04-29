package person;

public class Person {
	int age;
	public String name;
	protected int height;
	int weight;
	
	public Person(){
		System.out.println("Person 클래스의 생성자가 호출되었습니다.");
	}
	public void a(){
		weight = 100;
	}
}
