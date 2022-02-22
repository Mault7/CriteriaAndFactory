package Person;

public class Person {
	
	String gender;
	int age;
	String name;
	

	public Person(int age, String gender,String name) {
		
		this.gender = gender;
		this.age = age;
		this.name=name;
	}
	
	public String getGender() {
		
		return this.gender;
	}
	
	public int getAge() {
		
		return this.age;
	}

	public String getName() {
		
		return this.name;
	}

}
