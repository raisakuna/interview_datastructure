package quickSort;

public class Person implements Comparable<Person>{
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	private final String name;
	private final int age;
	
	

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}



	@Override
	public String toString() {
		return "Person {name=" + name + ", age=" + age + "}";
	}
	
	
	
	

}
