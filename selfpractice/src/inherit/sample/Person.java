package inherit.sample;

public abstract class Person {
	private String name;
	
	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public abstract void out();
	
}
